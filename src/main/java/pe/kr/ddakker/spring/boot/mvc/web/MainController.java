package pe.kr.ddakker.spring.boot.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Controller
public class MainController {

    @GetMapping("/")
    public void index(HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("index");
        return;
    }
}
