package org.example.designPattern.create.factory.abst;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 人种工厂 八卦炉
 */
public interface HumanFactory {
    /**
     * 制造一个黄色人种
     *
     * @return
     */
    Human createYellowHuman();

    /**
     * 制造白色人种
     *
     * @return
     */
    Human createWhiteHuman();

    /**
     * 制造黑色人种
     */
    Human createBlackHuman();


}
