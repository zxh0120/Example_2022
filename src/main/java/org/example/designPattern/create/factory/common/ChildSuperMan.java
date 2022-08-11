package org.example.designPattern.create.factory.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 未成人超人
 */
@Slf4j
public class ChildSuperMan implements ISuperMan {

    @Override
    public void specialTalent() {
        log.info("ChildSuperMan{}", "小超人刀枪不入、快速运动");
    }
}
