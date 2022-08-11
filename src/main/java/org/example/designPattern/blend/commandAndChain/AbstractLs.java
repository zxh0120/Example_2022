package org.example.designPattern.blend.commandAndChain;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 抽象ls命令
 */
public abstract class AbstractLs extends CommandName {
    /**
     * 默认参数
     */
    public final static String DEFAULT_PARAM = "";
    /**
     * 参数a
     */
    public final static String A_PARAM = "a";
    /**
     * 参数l
     */
    public final static String L_PARAM = "l";
}
