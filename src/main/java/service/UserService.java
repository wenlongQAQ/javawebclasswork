package service;

import domain.User;

import java.sql.*;

public class UserService {
    public boolean confirmUser(String userName,String userPassword) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Liwenlong.0328");
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from userdata where user_name=? and user_password=?;");
        preparedStatement.setString(1,userName);
        preparedStatement.setString(2,userPassword);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
    public User selectByUserName(String userName) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Liwenlong.0328");
        Statement statement = connection.createStatement();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from userdata where user_name=? ;");
        preparedStatement.setString(1,userName);
        ResultSet resultSet = preparedStatement.executeQuery();
        User user = new User();
        while (resultSet.next()){
            user.setUserName(resultSet.getString("user_name"));
            user.setUserPassword(resultSet.getString("user_password"));
            user.setUserIdentity(resultSet.getString("identity"));
        }
        return user;
    }
}
