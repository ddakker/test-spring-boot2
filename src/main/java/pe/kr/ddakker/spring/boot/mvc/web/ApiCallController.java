package pe.kr.ddakker.spring.boot.mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@RestController
public class ApiCallController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test/api/call")
    public String index(HttpServletResponse res) throws IOException {
        String url = System.getenv("TEST_API_CALL_GET_URL");
        if (url == null) {
            url = "http://www.opennaru.com";
        }
        System.out.println("url: " + url);
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println("response: " + response.getStatusCode().toString());
        return url + ", " + response.getStatusCode().toString();

    }
}
