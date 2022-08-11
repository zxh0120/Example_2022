package org.example.designPattern.behavior.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/29
 * @description H2型号的悍马类型
 */
@Slf4j
public class HummerH2Model extends Hummer {
    @Override
    protected void start() {
        log.info("悍马H2,启动~~~");
    }

    @Override
    protected void stop() {
        log.info("悍马H2,停止~~~");
    }

    @Override
    protected void alarm() {
        log.info("悍马H2,鸣笛~~~");
    }

    @Override
    protected void engineBoom() {
        log.info("悍马H2,引擎声音~~~");
    }

    /**
     * 默认没有喇叭
     * @return
     */
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
