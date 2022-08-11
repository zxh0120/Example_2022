package org.example.designPattern.behavior.mediator;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 工资接口
 */
public interface ISalary {
    /**
     * 加薪
     */
    void increaseSalary();

    /**
     * 降薪
     */
    void decreaseSalary();
}
