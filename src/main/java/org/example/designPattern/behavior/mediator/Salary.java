package org.example.designPattern.behavior.mediator;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 工资
 */
public class Salary extends AbsColleague implements ISalary {

    public Salary(AbsMediator absMediator) {
        super(absMediator);
    }

    @Override
    public void increaseSalary() {
        super.mediator.down(this);

    }

    @Override
    public void decreaseSalary() {
        super.mediator.up(this);
    }
}
