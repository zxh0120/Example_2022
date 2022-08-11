package org.example.designPattern.create.factory.expand;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 泛型工厂场景类
 */
public class ClientFactory {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        ConcreteProduct product = concreteCreator.createProduct(ConcreteProduct.class);
        product.method1();
        product.method2();

        ConcreteProduct1 product1 = concreteCreator.createProduct(ConcreteProduct1.class);
        product1.method1();
        product1.method2();
    }
}
