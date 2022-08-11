package org.example.designPattern.create.factory.abst;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 生产女性工厂 八卦炉
 */
public class FemaleFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
