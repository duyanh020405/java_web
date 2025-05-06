package com.data.ss1btvn;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bt5", value = "/bt5")
public class bt5 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try {
            int a = 0;
            int b = 2;
            int c = b / a;

            PrintWriter out = response.getWriter();
            out.println(c);

        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            try {
                rd.forward(request , response);
            } catch (ServletException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void destroy() {
    }
}
