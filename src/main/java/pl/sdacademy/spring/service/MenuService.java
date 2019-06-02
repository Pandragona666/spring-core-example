package pl.sdacademy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import pl.sdacademy.spring.config.HibernateConfig;
import pl.sdacademy.spring.dao.UserDao;
import pl.sdacademy.spring.model.UserModel;

import java.util.Scanner;

@Service
public class MenuService {

    @Autowired
    private UserService userService;

    @Autowired
    private UserSerializer userSerializer;

    public void start(){

        int action;

        do {
            System.out.println("Wybierz 1 by dodać userów.");
            System.out.println("Wybierz 2 by wyświetlić wszystkich userów");
            System.out.println("Wybierz 0 by wyjść");
            Scanner scanner = new Scanner(System.in);

            action = scanner.nextInt();

            switch (action){
                case 1:
                    userSerializer.addUser();
                    break;
                case 2:
                    System.out.println(userService.list());
            }
        }while (action != 0);

    }

}
