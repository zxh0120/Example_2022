package org.example.designPattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description 孩童的状态
 */
@Slf4j
public class ChildState extends HumanState {
    @Override
    public void work() {
        log.info("儿童的工作就是玩耍！");
        super.human.setState(Human.ADULT_STATE);
    }
}
