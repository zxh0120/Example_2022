package org.example.designPattern.structure.bridge;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zxh
 * @date 2022/8/1
 * @description 邮件模板
 * 抽象类没有抽象方法，设置为抽象类有什么意义？
 * 有意义，这里定义一个这样的抽象类：它具有邮件的所有属性，但不是一个具体可以被实例化的对象。
 * 例如：你对邮件服务器说：“给我制造一封邮件”，邮件服务器肯定会拒绝，为什么？你要什么邮件？什么格式？
 * 邮件对邮件服务器来说是一个抽象表示，是一个可描述但不可形象化的事物。你可以这样说：”我要一封标题为XXX,发件人是XXX的文本格式的邮件“,这就是一个可实例化的对象，因此我们的设计就产生了两个子类以具体化邮件,
 * 而且每种邮件格式对邮件的内容都有不同的处理。 文本邮件，超文本邮件
 */
@Data
public abstract class MainTemplate {
    /**
     * 邮件发件人
     */
    private String from;
    /**
     * 收件人
     */
    private String to;
    /**
     * 邮件标题
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String content;

    /**
     * 通过构造函数传递邮件信息
     *
     * @param from
     * @param to
     * @param subject
     * @param content
     */
    public MainTemplate(String from, String to, String subject, String content) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
    }

    /**
     * 允许增加邮件发送标识
     *
     * @param sendInfo
     */
    public void add(String sendInfo) {
        content = sendInfo + content;
    }

}
