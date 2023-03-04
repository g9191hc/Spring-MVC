package hello.servlet.web.frontcontroller.v1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV1 {

    //서블릿의 service메서드와 동일한 객체를 입력받고 동일한 예외를 throws하는 메서드
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
