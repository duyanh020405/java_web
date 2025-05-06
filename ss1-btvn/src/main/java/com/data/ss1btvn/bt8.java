package com.data.ss1btvn;import java.io.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bt8", value = "/bt8")
public class bt8 extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        // Hello
        PrintWriter out = response.getWriter();
        ArrayList<Work> works = new ArrayList<>();

        String name = request.getParameter("name");
        boolean status = false;

        if (name != null && !name.trim().isEmpty()) {
            works.add(new Work(name, status));
        }

        request.setAttribute("works", works);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/bt8.jsp");
        try {
            rd.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

    public void destroy() {
    }
}