package org.example.designPattern.behavior.mediator;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 抽象同事类
 */
public abstract class AbsColleague {
    
    /**
     * 每个同事类都对中介者非常了接
     */
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }

}
