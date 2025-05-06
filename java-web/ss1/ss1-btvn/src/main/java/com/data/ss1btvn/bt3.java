package com.data.ss1btvn;import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bt3", value = "/bt3")
public class bt3 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = "Duy Anh" ;
        int age = 18;
        String gender = "Male" ;

        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("gender", gender);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/bt3.jsp");
        try {
            rd.forward(request , response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    public void destroy() {
    }
}