package github.xusheng.spring.bus;

import github.xusheng.spring.event.MailSendEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-01-08 16:03
 * @Version 1.0
 **/
@Component("mailSender")
public class MailSender {
    @Autowired
    private ApplicationContext applicationContext;

    public void sendMail(String dest){
        System.out.println("MailSender开始发送邮件");
        MailSendEvent event = new MailSendEvent(applicationContext,dest);
        applicationContext.publishEvent(event);
    }
}
