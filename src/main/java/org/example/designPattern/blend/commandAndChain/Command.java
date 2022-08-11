package org.example.designPattern.blend.commandAndChain;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zxh
 * @date 2022/8/10
 * @description 抽象命令
 */
@Slf4j
public abstract class Command {
    /**
     * @param commandVo
     * @return
     * @throws ClassNotFoundException
     */
    public abstract String execute(CommandVo commandVo) throws ClassNotFoundException;

    /**
     * 建立链表
     *
     * @return
     */
    protected final List<? extends CommandName> buildChina(Class<? extends CommandName> abstractClass) throws ClassNotFoundException {
        //取出所有的命令下的子类
        List<Class> classes = ClassUtils.getSonClasses(abstractClass);
        //存放命令的实例,并建立链表关联
        List<CommandName> commandNameList = new ArrayList<>();
        for (Class c : classes) {
            CommandName commandName = null;
            try {
                //产生实例
                commandName = (CommandName) Class.forName(c.getName()).newInstance();
            } catch (Exception e) {
                log.error("Exception:{}", e);
            }
            //建立链表
            if (commandNameList.size() > 0) {
                commandNameList.get(commandNameList.size() - 1).setNext(commandName);
            }
            commandNameList.add(commandName);

        }
        return commandNameList;
    }
}
