package org.example.designPattern.create.factory.abst;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 黄色男性人种
 */
@Slf4j
public class MaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        log.info("MaleYellowHuman{}", "黄色男性");
    }
}
