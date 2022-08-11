package org.example.designPattern.create.factory.common;


import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date ${date}
 * @description 成人超人
 */

@Slf4j
public class AdultSuperMan implements ISuperMan {

    @Override
    public void specialTalent() {
        log.info("AdultSuperMan{}", "成年超人力大无穷");
    }
}
