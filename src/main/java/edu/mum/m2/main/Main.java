package edu.mum.m2.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    public final static String[] configFiles = {
            "/META-INF/spring/context/application-context.xml",
            "/META-INF/spring/context/data-access-context.xml",
            "/META-INF/spring/integration/amqp-context.xml",
            "/META-INF/spring/context/security-context.xml",
            "/META-INF/spring/context/validation-context.xml",
            "/META-INF/spring/batch/batch-config.xml",
            "/META-INF/spring/batch/dailytransaction-job.xml",
            "/META-INF/spring/batch/monthlyStatement-job.xml"
    };

    public static void main(String[] args) throws Throwable {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configFiles, Main.class);
        applicationContext.getBean(Main.class).mainInternal(applicationContext);
    }

    private void mainInternal(ApplicationContext applicationContext) throws Exception {

    }
}
