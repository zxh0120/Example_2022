package org.example.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @author zxh
 * @date 2022/7/21
 * @description 获取class实列三种方式
 * 通过反射获取类属性、方法、构造器
 */
@Slf4j
public class TestReflect {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {

        Apple apple = new Apple(1, "red", "hello", 11);
        //使用对象的getClass()方法
        Class<? extends Apple> aClass = apple.getClass();
        log.info("使用对象的getClass():{}", aClass);

        //使用Class类的静态方法forName()
        Class<?> aClass1 = Class.forName("org.example.reflect.Apple");
        log.info("使用Class类的静态方法forName():{}", aClass1);

        //运用.class的方式来获取Class实例
        Class<Apple> appleClass = Apple.class;
        log.info("运用.class的方式来获取Class实例:{}", appleClass);


        //返回一个类中全部字段和字段内容
        Field[] declaredFields = Apple.class.getDeclaredFields();
        for (Field field : declaredFields) {
            //可更改属性的访问权限
            field.setAccessible(true);
            try {
                Object content = (Object) field.get(apple);
                Object name = field.getName();
                log.info("name:{};content:{}", name, content);
            } catch (IllegalAccessException e) {
                log.error(String.valueOf(e));
            }
        }

        //返回一个类中所有可访问的公共字段，包括该类的公共字段和继承的类的公共字段
        Field[] fields = Apple.class.getFields();
        log.info("getFields结果：");
        Arrays.stream(fields).forEach(x -> log.info(String.valueOf(x)));

        //返回一个类中全部字段,但只包括该类子弹
        Field[] declaredFieldsAll = Apple.class.getDeclaredFields();
        List<Field> fieldsList = Arrays.asList(declaredFieldsAll);
        log.info("getDeclaredFields结果：");
        fieldsList.forEach(x -> {
            log.info("{}", x);
        });


        //根据字段名返回一个公开字段
        try {
            Field id = Apple.class.getField("id");
            log.info("getFile结果：");
            log.info("{}", id);
        } catch (Exception e) {
            log.error("{}", e);
        }
        //根据一个字段名返回一个字段
        Field weightId = Apple.class.getDeclaredField("weightId");
        log.info("getDeclaredFiled结果：");
        log.info("{}", weightId);


        //同Field Method也有四种获取方式
        // 这里举其中一个例子
        Method[] methods = Apple.class.getDeclaredMethods();
        System.out.println("getDeclaredMethods结果");
        Arrays.stream(methods).forEach(System.out::println);

        // 同上 举一个获取构造器的例子
        Constructor[] constructors = Apple.class.getDeclaredConstructors();
        System.out.println("getDeclaredConstructors结果");
        Arrays.stream(constructors).forEach(System.out::println);

        //反射赋值
        Field[] declaredFields1 = Apple.class.getDeclaredFields();
        for (Field field : declaredFields1) {
            field.setAccessible(true);
            if (field.getType() == Integer.class && "id".equals(field.getName())) {
                field.set(apple, 123);
            } else if (field.getType() == String.class && "color".equals(field.getName())) {
                field.set(apple, "yellow");
            }
        }
        log.info(apple.toString());
    }
}
