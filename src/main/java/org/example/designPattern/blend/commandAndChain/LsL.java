package org.example.designPattern.blend.commandAndChain;

/**
 * @author zxh
 * @date 2022/8/10
 * @description ls -L
 */
public class LsL extends AbstractLs {
    @Override
    protected String getOperateParam() {
        return L_PARAM;
    }

    @Override
    protected String echo(CommandVo commandVo) {
        return FileManage.ls_l(commandVo.formatData());
    }
}
