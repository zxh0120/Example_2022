package org.example.designPattern.create.factory.abst;

/**
 * @author zxh
 * @date 2022/6/28
 * @description 人种接口
 */
public interface Human {
    /**
     * 每个人种都有相应肤色
     */
    public void getColor();

    /**
     * 人类会说话
     */
    public void talk();

    /**
     * 每个人都有性别
     */
    public void getSex();

}
