package github.xusheng.spring.listener;

import github.xusheng.spring.event.MailSendEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-01-08 16:00
 * @Version 1.0
 **/
@Component
public class MailSendListener implements ApplicationListener<MailSendEvent> {

    @Override
    public void onApplicationEvent(MailSendEvent mailSendEvent) {
        MailSendEvent event = mailSendEvent;
        System.out.println("MailSender向" + event.getDestination() + "发送了邮件");
    }
}
