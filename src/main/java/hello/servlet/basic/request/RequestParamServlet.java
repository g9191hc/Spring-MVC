package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("[전체파라미터 조회 start]");
        request.getParameterNames().asIterator().forEachRemaining(parameter ->
                System.out.println(parameter + " = " + request.getParameter(parameter)));
        System.out.println("[전체파라미터 조회 end]");
        System.out.println();
        System.out.println("[단일파라미터 조회 start]");
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        String age = request.getParameter("age");
        System.out.println("age = " + age);
        System.out.println("[단일파라미터 조회 end]");
        System.out.println();
        System.out.println("[파라미터가 동일한 값들 조회 start]");
        String[] usernames = request.getParameterValues("username");
        for (String s : usernames) {
            System.out.println("username = " + s);
        }
        System.out.println("[파라미터가 동일한 값들 조회 end]");
        System.out.println();

    }
}
