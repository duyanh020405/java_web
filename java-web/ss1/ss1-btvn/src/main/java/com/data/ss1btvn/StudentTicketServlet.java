package com.data.ss1btvn;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import com.data.ss1btvn.Student;


@WebServlet(name = "StudentTicketServlet", value = "/bt7")
public class StudentTicketServlet extends HttpServlet {
    private String message;
    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Student[] students = new Student[5];
        students[0] = new Student("Nguyễn Văn A", 20, "Xe máy", "29A-123.45");
        students[1] = new Student("Trần Thị B", 21, "Ô tô", "30B-456.78");
        students[2] = new Student("Lê Văn C", 19, "Xe đạp", "Không có");
        students[3] = new Student("Phạm Thị D", 22, "Xe buýt", "31C-789.01");
        students[4] = new Student("Hoàng Văn E", 20, "Xe máy", "33D-111.22");

        request.setAttribute("students", students);
        RequestDispatcher rd = request.getRequestDispatcher("listStudent.jsp");
        try {
            rd.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    public void destroy() {
    }
}