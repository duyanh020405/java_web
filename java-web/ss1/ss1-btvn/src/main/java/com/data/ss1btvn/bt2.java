package com.data.ss1btvn;import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "bt2", value = "/bt2")
public class bt2 extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.printf("<b>src/main/java/</b> : Chứa mã nguồn Java (Servlet, class xử lý logic, controller, v.v.)<br>");
        out.printf("<b>src/main/resources/</b> : Chứa các file cấu hình, tài nguyên (properties, xml, v.v.)<br>");
        out.printf("<b>src/main/webapp/</b> : Chứa tài nguyên web như JSP, HTML, CSS, JS<br>");
        out.printf("<b>src/main/webapp/index.jsp</b> : File giao diện chính, ví dụ: \"Hello, World!\"<br>");
        out.printf("<b>src/main/webapp/WEB-INF/</b> : Thư mục bảo mật, chứa file cấu hình <code>web.xml</code>, không truy cập trực tiếp được từ trình duyệt<br>");
        out.printf("<b>src/main/webapp/WEB-INF/web.xml</b> : File cấu hình servlet, servlet mapping, filter, listener,…<br>");

    }

    public void destroy() {
    }
}