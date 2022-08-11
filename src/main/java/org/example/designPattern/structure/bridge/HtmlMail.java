package org.example.designPattern.structure.bridge;

/**
 * @author zxh
 * @date 2022/8/1
 * @description 超文本邮件
 */
public class HtmlMail extends MainTemplate {

    public HtmlMail(String from, String to, String subject, String context) {
        super(from, to, subject, context);
    }


    @Override
    public String getContent() {
        String content = "\n Context-Type: multipart/mixed; charset=GB2312\n " + super.getContent();
        content = content + "\n 邮件格式为:超文本格式";
        return content;
    }


}
