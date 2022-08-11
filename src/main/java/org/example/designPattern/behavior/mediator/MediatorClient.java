package org.example.designPattern.behavior.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/8/2
 * @description 中介者模式
 */
@Slf4j
public class MediatorClient {
    public static void main(String[] args) {


        //定义中介者
        Mediator mediator = new Mediator();
        //定义各个同事类
        IPosition position = new Position(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);
        log.info("{}", "职位提升了----------------------------------");
        position.promote();
        log.info("{}", "职位降级了----------------------------------");
        position.demote();
    }
}
