package org.example.annotation.client;

import lombok.extern.slf4j.Slf4j;
import org.example.annotation.InitSex;
import org.example.annotation.ValidateAge;
import org.example.annotation.model.User;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zxh
 * @date 2022/7/14
 * @description
 */
@Slf4j
public class TestInitParam {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        initUser(user);
        //年龄为0,效验通过情况
        boolean checkResult = checkUser(user);
        printResult(checkResult);
        //重新设置年龄，效验通过
        user.setAge(22);
        checkResult = checkUser(user);
        printResult(checkResult);


    }

    private static void printResult(boolean checkResult) {
        if (checkResult) {
            log.info("效验通过");
        } else {
            log.info("效验未通过");
        }
    }

    /**
     * 通过反射给属性赋值
     *
     * @param user
     */
    private static void initUser(User user) throws IllegalAccessException {
        //获取user类中所有的属性(getFields无法获得private属性)
        Field[] declaredField = User.class.getDeclaredFields();
        //便利所有属性
        for (Field field : declaredField) {
            //如果属性上有此注解,则进行赋值操作
            if (field.isAnnotationPresent(InitSex.class)) {
                InitSex initSex = field.getAnnotation(InitSex.class);
                //禁用访问安全检查的开关
                field.setAccessible(true);
                //设置属性的性别值
                field.set(user, initSex.sex().toString());
                log.info("完成属性值的修改为：{}", initSex.sex().toString());
            }

        }

    }


    /**
     * 通过反射给拿到当前属性的值进行对比效验
     *
     * @param user
     * @return
     */
    private static Boolean checkUser(User user) throws IllegalAccessException {
        //获取user类中所有的属性(getFields无法获得private属性)
        Field[] fields = User.class.getDeclaredFields();
        Boolean result = true;
        //遍历所有属性
        for (Field field : fields) {
            //如果属性上有此注解,则进行赋值操作
            if (field.isAnnotationPresent(ValidateAge.class)) {
                ValidateAge validateAge = field.getAnnotation(ValidateAge.class);
                field.setAccessible(true);
                int age = (int) field.get(user);
                if (age < validateAge.min() || age > validateAge.max()) {
                    result = false;
                    log.info("年龄不符合条件");
                }

            }
        }
        return result;
    }

}
