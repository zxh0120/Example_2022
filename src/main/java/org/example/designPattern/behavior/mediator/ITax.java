package org.example.designPattern.behavior.mediator;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 税收接口
 */
public interface ITax {
    /**
     * 税收上升
     */
    void raise();

    /**
     * 税收下降
     */
    void drop();
}
