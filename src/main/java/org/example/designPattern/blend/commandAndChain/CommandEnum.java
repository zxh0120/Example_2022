package org.example.designPattern.blend.commandAndChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 命令配置对象
 */
public enum CommandEnum {

    ls("org.example.designPattern.blend.commandAndChain.LsCommand");
    private String value = "";

    /**
     * 定义构造函数,目的是Data(value)类型的相匹配
     */
    CommandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * 返回所有enum对象
     *
     * @return
     */
    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        CommandEnum[] commandEnums = CommandEnum.values();
        for (CommandEnum commandEnum : commandEnums) {
            names.add(commandEnum.name());
        }
        return names;
    }
}
