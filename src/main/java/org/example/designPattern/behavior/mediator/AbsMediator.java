package org.example.designPattern.behavior.mediator;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 抽象中介者
 */
public abstract class AbsMediator {

    /**
     * 工资
     */
    protected final ISalary salary;

    /**
     * 职位
     */
    protected final IPosition position;

    /**
     * 税收
     */
    protected final ITax tax;


    protected AbsMediator() {
        salary = new Salary(this);
        position = new Position(this);
        tax = new Tax(this);
    }

    /**
     * 工资增加了
     *
     * @param salary
     */
    public abstract void up(ISalary salary);

    /**
     * 职位提升了
     *
     * @param position
     */
    public abstract void up(IPosition position);

    /**
     * 税收增加了
     *
     * @param tax
     */
    public abstract void up(ITax tax);

    /**
     * 工资降低了
     *
     * @param salary
     */
    public abstract void down(ISalary salary);

    /**
     * 职位降低了
     *
     * @param position
     */
    public abstract void down(IPosition position);

    /**
     * 税收降低了
     */
    public abstract void down(ITax tax);
}
