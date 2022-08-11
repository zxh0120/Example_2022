package org.example.designPattern.create.factory.abst;

/**
 * @author zxh
 * @date 2022/6/28
 * @description  男性工厂 八卦炉
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
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
