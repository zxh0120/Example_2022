package org.example.designPattern.behavior.template;

/**
 * @author zxh
 * @date 2022/6/29
 * @description 抽象类 悍马模型
 */
public abstract class Hummer {
    /**
     * 启动车辆
     */
    protected abstract void start();

    /**
     * 停止车辆
     */

    protected abstract void stop();

    /**
     * 喇叭鸣叫
     */
    protected abstract void alarm();

    /**
     * 引擎发出轰鸣声
     */
    protected abstract void engineBoom();

    public final void run() {
        start();
        engineBoom();
        alarm();
        stop();
    }

    /**
     * 扩展 钩子函数 默认喇叭会响
     *
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }

    /**
     * 扩展后的
     */
    public final void extendRun() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

}
