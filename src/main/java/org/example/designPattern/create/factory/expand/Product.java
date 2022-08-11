package org.example.designPattern.create.factory.expand;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 抽象产品类
 *          抽象产品类负责定义产品的共性，实现对事物最抽象的定义。
 */
@Slf4j
public abstract class Product {
    /**
     * 产品类的公共方法
     */
    public void method1() {
        log.info("Product{}", "产品类公共方法");
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
