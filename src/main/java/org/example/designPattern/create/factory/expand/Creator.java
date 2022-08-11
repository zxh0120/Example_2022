package org.example.designPattern.create.factory.expand;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 抽象工厂类 负责定义产品对象的产生
 */
public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     *
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);

}
