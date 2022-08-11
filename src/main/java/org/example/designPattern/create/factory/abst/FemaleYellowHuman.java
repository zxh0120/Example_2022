package org.example.designPattern.create.factory.abst;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 黄色女性人种
 */
@Slf4j
public class FemaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        log.info("Female{}", "黄色女性");
    }

}
