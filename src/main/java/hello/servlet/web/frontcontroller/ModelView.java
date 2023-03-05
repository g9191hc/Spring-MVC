package hello.servlet.web.frontcontroller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@RequiredArgsConstructor
@Getter @Setter
public class ModelView {
    private final String viewName; //View의 물리적위치에 대한 논리적이름
    private Map<String, Object> model = new HashMap<>();
}
