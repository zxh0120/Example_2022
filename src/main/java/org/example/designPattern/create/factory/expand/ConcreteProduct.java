package org.example.designPattern.create.factory.expand;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 具体的产品类 可以有多个，都继承于抽象产品类
 */
@Slf4j
public class ConcreteProduct extends Product {
    @Override
    public void method2() {
        log.info("conCreateProduct{}", "具体的产品类");
    }
}
