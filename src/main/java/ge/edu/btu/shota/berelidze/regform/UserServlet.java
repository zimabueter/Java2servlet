package ge.edu.btu.shota.berelidze.regform;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/userservlet")
public class UserServlet extends HttpServlet {

    public static final String VIEW = "/showUser.jsp";
    User user = new User();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("user", user);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

        user.setName(req.getParameter("name"));
        user.setBreed(req.getParameter("breed"));
        user.setAge(Integer.valueOf(req.getParameter("age")));
        user.setGender(req.getParameter("gender"));


        System.out.println("sakheli : " + user.getName());
        System.out.println("jishi : " + user.getBreed());
        System.out.println("skesi : " + user.getGender());
        System.out.println("asaki : " + user.getAge());

    }
}