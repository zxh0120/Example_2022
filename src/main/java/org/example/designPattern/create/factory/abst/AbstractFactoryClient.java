package org.example.designPattern.create.factory.abst;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 抽象工厂
 *   一个接口(人种接口），多个抽象类（每个人种都是一个抽象类，黑色人种、白色人种、黄色人种）,N个实现类（性别是在各个实现类中实现的）
 *   HumanFactory接口  ,定义了三个方法，分别用来生产三个不同肤色的人种，两个实现类被分别是性别
 */
@Slf4j
public class AbstractFactoryClient {
    public static void main(String[] args) {
        //第一条生产线,男性生产线
        HumanFactory maleFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory feMaleFactory = new FemaleFactory();

        //生产线建立完毕，开始生产人了
        Human maleFactoryYellowHuman = maleFactory.createYellowHuman();
        Human feMaleFactoryYellowHuman = feMaleFactory.createYellowHuman();

        log.info("生产一个黄色女性");
        feMaleFactoryYellowHuman.getColor();
        feMaleFactoryYellowHuman.talk();
        feMaleFactoryYellowHuman.getSex();

        log.info("生产一个黄色男性");
        maleFactoryYellowHuman.getColor();
        maleFactoryYellowHuman.talk();
        maleFactoryYellowHuman.getSex();
    }
}
