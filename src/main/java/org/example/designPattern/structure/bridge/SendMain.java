package org.example.designPattern.structure.bridge;

/**
 * @author zxh
 * @date 2022/8/1
 * @description
 */
public class SendMain extends MailServer {


    public SendMain(MainTemplate mainTemplate) {
        super(mainTemplate);
    }

    /**
     * 修正邮件发送程序
     */
    @Override
    public void sendMail() {
        //增加邮件服务器信息
        String context = "Received :sendMail  (2022-08-01) ";
        super.mainTemplate.add(context);
        super.sendMail();
    }
}
