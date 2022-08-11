package org.example.designPattern.create.factory.abst;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 白色人种
 */
@Slf4j
public class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        log.info("AbstractWhileHuman{}", "白色人种的皮肤颜色是白色的");
    }

    @Override
    public void talk() {
        log.info("AbstractWhileHuman{}", "一般说的是单字节");
    }

    @Override
    public void getSex() {
        log.info("AbstractWhileHuman{}","~~~~~~~~~~~");
    }
}
