package org.example.designPattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description
 */
@Slf4j
public class AdultState extends HumanState {
    @Override
    public void work() {
        log.info("成年人的工作就是挣钱,然后为社会做共享！");
        super.human.setState(Human.OLD_STATE);
    }
}
