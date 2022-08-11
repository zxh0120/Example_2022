package org.example.designPattern.create.factory.expand;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 具体工厂类，具体如何产生一个产品对象，是由具体工厂类实现的
 */
@Slf4j
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return (T) product;
    }
}
