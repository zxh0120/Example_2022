package org.example.designPattern.behavior.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 中介者
 */
@Slf4j
public class Mediator extends AbsMediator {
    /**
     * 工资增加了
     *
     * @param salary
     */
    @Override
    public void up(ISalary salary) {
        upSalary();
        upTax();
    }

    @Override
    public void up(IPosition position) {
        upPosition();
        upSalary();
        upTax();
    }

    @Override
    public void up(ITax tax) {
        upTax();
        upSalary();
    }

    @Override
    public void down(ISalary salary) {
        downSalary();
        downTax();

    }

    @Override
    public void down(IPosition position) {
        downPosition();
        downSalary();
        downTax();
    }

    @Override
    public void down(ITax tax) {
        downTax();
        downSalary();
    }

    /**
     * 工资、职位、税收降低的处理方法相同，不再赘述
     * 工资增加
     */
    private void upSalary() {
        log.info("工资翻倍,乐翻天");
    }

    private void upTax() {
        log.info("税收上升，为国家做贡献");
    }

    private void upPosition() {
        log.info("职位上升一级,狂喜");
    }

    private void downSalary() {
        log.info("经济不景气,降低工资");
    }

    private void downTax() {
        log.info("税收减低,国家收入减少");
    }

    private void downPosition() {
        log.info("官降三级,比自杀还痛苦");
    }
}
