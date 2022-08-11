package org.example.designPattern.behavior.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zxh
 * @date 2022/6/29
 * @description 模板方法 场景类
 */
@Slf4j
public class TemplateClient {
    public static void main(String[] args) {
        Hummer h1 = new HummerH1Model();
        h1.run();

        Hummer h2 = new HummerH2Model();
        h2.run();
        log.info("~~~~~~~~~~~~~~~");

        Hummer h11 = new HummerH1Model();
        h11.extendRun();

        Hummer h22 = new HummerH2Model();
        h22.extendRun();
    }


}
