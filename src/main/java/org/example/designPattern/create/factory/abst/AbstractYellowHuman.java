package org.example.designPattern.create.factory.abst;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 黄色人种
 */
@Slf4j
public class AbstractYellowHuman  implements  Human{
    @Override
    public void getColor() {
        log.info("AbstractYellowHuman{}","黄色人种的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        log.info("AbstractYellowHuman{}","一般说普通话");
    }

    @Override
    public void getSex() {
        log.info("AbstractYellowHuman{}","~~~~~");
    }
}
