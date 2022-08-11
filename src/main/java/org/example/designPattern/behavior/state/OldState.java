package org.example.designPattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/7/25
 * @description
 */
@Slf4j
public class OldState extends HumanState {
    @Override
    public void work() {
        log.info("老人的工作就是享受天伦之乐！");
    }
}
