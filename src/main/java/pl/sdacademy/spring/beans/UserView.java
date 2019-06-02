package pl.sdacademy.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userView")
public class UserView {

    private UserRepository userRepository;

    @Autowired
    public UserView(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public String toString() {
        return "UserView{" +
                "userRepository=" + userRepository +
                '}';
    }


}
