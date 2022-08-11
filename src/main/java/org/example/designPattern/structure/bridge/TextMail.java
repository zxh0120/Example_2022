package org.example.designPattern.structure.bridge;

/**
 * @author zxh
 * @date 2022/8/1
 * @description 文本邮件
 */
public class TextMail extends MainTemplate {

    public TextMail(String from, String to, String subject, String content) {
        super(from, to, subject, content);
    }


    @Override
    public String getContent() {
        String content = "\n Context-Type: text/plain; charset=GB2312\n " + super.getContent();
        content = content + "\n 邮件格式为：文本格式";
        return content;
    }
}
