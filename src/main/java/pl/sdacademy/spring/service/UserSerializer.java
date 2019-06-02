package pl.sdacademy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sdacademy.spring.model.UserModel;

import java.util.Scanner;

@Service
public class UserSerializer {

    @Autowired
    private UserService userService;

    Scanner scanner = new Scanner(System.in);

    public void addUser(){

            System.out.println("Podaj imię");
            UserModel user2 = new UserModel();
            String imie = scanner.next();
            user2.setName(imie);
            System.out.println("podaj email");
            String email = scanner.next();
            user2.setEmail(email);
            System.out.println(user2.getName() + " " + user2.getEmail());
            userService.save(user2);

    }

}
