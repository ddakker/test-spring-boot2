package pe.kr.ddakker.spring.boot.mvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@Controller
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);


    @GetMapping("/")
    public void index(HttpServletResponse res) throws IOException {
        logger.info("===== mai1");
        PrintWriter out = res.getWriter();
        out.println("index 1");
        return;
    }
}
