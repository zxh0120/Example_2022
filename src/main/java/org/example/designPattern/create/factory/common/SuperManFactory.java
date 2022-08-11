package org.example.designPattern.create.factory.common;


import lombok.extern.slf4j.Slf4j;
import org.example.designPattern.create.factory.expand.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 超人制作工厂
 */
@Slf4j
public class SuperManFactory {
    private static final String ADULT = "adult";
    private static final String CHILD = "child";
    private static final Map<String, ISuperMan> productHashMap = new HashMap<>();

    /**
     * 定义一个生产超人的工厂
     *
     * @param type
     * @return
     */
    public static ISuperMan CreateSuperFactory(String type) {
        //根据输入参数产生不同的超人
        if (type.equalsIgnoreCase(ADULT)) {
            //生产成年超人
            return new AdultSuperMan();
        } else if (type.equalsIgnoreCase(CHILD)) {
            return new ChildSuperMan();
        } else {
            return null;
        }
    }

    /**
     * 缓存，对需要再次被重用的对象保留
     *
     * @param type
     * @return
     */
    public static synchronized ISuperMan CreateSuperFactionLazyInitialization(String type) {
        ISuperMan iSuperMan = null;
        if (productHashMap.containsKey(type)) {
            iSuperMan = productHashMap.get(type);
        } else {
            if (type.equalsIgnoreCase(ADULT)) {
                //生产成年超人
                iSuperMan = new AdultSuperMan();
            } else if (type.equalsIgnoreCase(CHILD)) {
                iSuperMan = new ChildSuperMan();
            }
            productHashMap.put(type, iSuperMan);
        }
        return iSuperMan;

    }
}
