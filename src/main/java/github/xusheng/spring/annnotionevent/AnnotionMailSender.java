package github.xusheng.spring.annnotionevent;

import github.xusheng.spring.event.MailSendEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Description 注解形式
 * @Author xusheng
 * @Create 2019-01-08 16:35
 * @Version 1.0
 **/
@Component("annotionMailSender")
public class AnnotionMailSender {

    @EventListener(MailSendEvent.class)
    public void onMailSend(MailSendEvent event){
        System.out.println("注解形式事件通知: "+event.getDestination());
    }
    @Async
    @EventListener(MailSendEvent.class)
    public void onAsyncMailSend(MailSendEvent event){

        System.out.println("异步注解注解形式事件通知: "+event.getDestination());

    }




}
