package github.xusheng.spring.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @Description 继承了ApplicationContextEvent，就是个容器事件
 * @Author xusheng
 * @Create 2019-01-08 15:58
 * @Version 1.0
 **/
@Data
public class MailSendEvent extends ApplicationEvent {
    private String destination;

    public MailSendEvent(Object source,String destination) {
        super(source);
        this.destination = destination;
    }
}
