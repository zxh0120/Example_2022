package org.example.designPattern.blend.commandAndChain;

/**
 * @author zxh
 * @date 2022/8/10
 * @description
 */
public class LsA extends AbstractLs {
    @Override
    protected String getOperateParam() {
        return A_PARAM;
    }

    @Override
    protected String echo(CommandVo commandVo) {
        return FileManage.ls_a(commandVo.formatData());
    }
}
