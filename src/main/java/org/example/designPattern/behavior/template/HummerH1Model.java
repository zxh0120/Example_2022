package org.example.designPattern.behavior.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/29
 * @description H1型号的悍马类型
 */
@Slf4j
public class HummerH1Model extends Hummer {
    /**
     * 要响喇叭
     */
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        log.info("悍马H1,启动~~~");
    }

    @Override
    protected void stop() {
        log.info("悍马H1,停止~~~");
    }

    @Override
    protected void alarm() {
        log.info("悍马H1,鸣笛~~~");
    }

    @Override
    protected void engineBoom() {
        log.info("悍马H1,引擎声音~~~");
    }

    /**
     * 默认有喇叭
     * @return
     */
    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    /**
     * 由客户决定
     *
     * @param isAlarm
     */
    public void setAlarmFlag(Boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
