package pl.sdacademy.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sdacademy.spring.beans.RepositoryConfiguration;
import pl.sdacademy.spring.beans.UserRepository;
import pl.sdacademy.spring.beans.UserView;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(RepositoryConfiguration.class);

        UserView userView = context
                .getBean(UserView.class);
        System.out.println(userView);

        ((AnnotationConfigApplicationContext) context).registerShutdownHook();
    }

}
