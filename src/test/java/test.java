import domain.User;
import service.UserService;

import java.sql.SQLException;

public class test {


    public static void main(String[] args) throws SQLException {
        UserService us = new UserService();
        boolean b = us.confirmUser("龙", "1");
        System.out.println(b);
        User user = us.selectByUserName("2082841288");
        System.out.println(user);
    }

}
