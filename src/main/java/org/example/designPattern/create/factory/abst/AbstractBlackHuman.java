package org.example.designPattern.create.factory.abst;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description  黑色人种
 */
@Slf4j
public class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        log.info("AbstractBlackHuman{}","黑色人种皮肤是黑色的");
    }

    @Override
    public void talk() {
        log.info("AbstractBlackHuman{}","黑色说话一般双字节");
    }

    @Override
    public void getSex() {
        log.info("AbstractBlackHuman{}","~~~~~");
    }
}
