package hello.servlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ResponseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Status line
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);


        // Headers

        // - header 편의메서드
        content(response);
        response.setHeader("Pragma", "no-cache");
        response.setHeader("My-Header", "hello");

        PrintWriter writer = response.getWriter();
        writer.println("안녕하세요");
    }
    private void content(HttpServletResponse response) {
        //Content-Type: text/plain;charset=utf-8
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }
}
