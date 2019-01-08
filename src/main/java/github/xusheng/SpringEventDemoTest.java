package github.xusheng;

import github.xusheng.spring.bus.MailSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author xusheng
 * @Create 2019-01-08 15:57
 * @Version 1.0
 **/
public class SpringEventDemoTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        MailSender sender  = (MailSender)context.getBean("mailSender");
        sender.sendMail("北京");
    }
}
