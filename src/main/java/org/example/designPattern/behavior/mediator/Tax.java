package org.example.designPattern.behavior.mediator;

/**
 * @author zxh
 * @date 2022/8/2
 * @description
 */
public class Tax extends AbsColleague implements ITax {
    /**
     * 注入中介者
     */
    public Tax(AbsMediator absMediator) {
        super(absMediator);
    }

    @Override
    public void raise() {
        super.mediator.down(this);

    }

    @Override
    public void drop() {
        super.mediator.up(this);
    }
}
