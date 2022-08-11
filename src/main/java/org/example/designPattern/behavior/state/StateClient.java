package org.example.designPattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 状态模式的场景类
 */
@Slf4j
public class StateClient {
    public static void main(String[] args) {
        //定义一个普通的人
        Human human =new Human();
        //设置一个具体的人
        human.setState(new ChildState());
        log.info("儿童");
        human.work();
        human.work();
        human.work();
        human.work();
    }

}
