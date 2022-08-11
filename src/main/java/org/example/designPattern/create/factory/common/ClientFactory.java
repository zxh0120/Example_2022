package org.example.designPattern.create.factory.common;


/**
 * @author zxh
 * @date 2022/6/28
 * @description 成年超人(如克拉克 、 超能先生)和未成年超人(如DASH 、 JACK)。这是一个非常正宗的工厂方法模式，定义一个产品接口，然后再定义两个实现，通过超人制造工厂制造超人。
 * 想想看我们对超人最大印象是是什么？当然是他的超能力，我们以specialTalent(特殊天赋)方法来代表，先看抽象产品类  ISuperMan.
 * 产品定义好了，我们再看看具体的产品，成年超人 adultSuperMan 和未成年超人 ChildSuperMan。
 * 产品都具备了，那我们编写一个工厂类 SuperManFactory，其意图就是生产超人，具体是成年超人还是未成年超人，则由客户端决定。
 */
public class ClientFactory {
    /**
     * 模式生产超人
     */
    public static void main(String[] args) {
        //生产一个成年超人
        ISuperMan adult = SuperManFactory.CreateSuperFactionLazyInitialization("adult");
        //展示一个超人技能
        adult.specialTalent();

        //生产一个未成年超人
        ISuperMan child = SuperManFactory.CreateSuperFactionLazyInitialization("child");
        child.specialTalent();

        //生产一个成年超人
        ISuperMan adult1 = SuperManFactory.CreateSuperFactionLazyInitialization("adult");
        //展示一个超人技能
        adult1.specialTalent();

        //生产一个未成年超人
        ISuperMan child1 = SuperManFactory.CreateSuperFactionLazyInitialization("child");
        child1.specialTalent();

    }
}
