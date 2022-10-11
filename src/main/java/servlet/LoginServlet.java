package servlet;

import domain.User;
import service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService us =new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        System.out.println(userName);
        String userPassword = request.getParameter("userpassword");
        try {
            if(us.confirmUser(userName,userPassword)){
                System.out.println("login success!");
                HttpSession session = request.getSession();
                session.setAttribute("username","李文龙");
                User user = us.selectByUserName(userName);
                session.setAttribute("userPassword",user.getUserPassword());
                session.setAttribute("userIdentity",user.getUserIdentity());
                System.out.println(user.getUserIdentity());
                response.sendRedirect("success.jsp");
            }
            else{
                request.getSession().setAttribute("loginCode","error");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
