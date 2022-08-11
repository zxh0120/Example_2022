package org.example.designPattern.behavior.mediator;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 职位
 */
public class Position extends AbsColleague implements IPosition {

    public Position(AbsMediator absMediator) {
        super(absMediator);
    }

    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }
}
