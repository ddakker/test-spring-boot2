package pe.kr.ddakker.spring.boot.mvc.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.kr.ddakker.spring.boot.mvc.model.EventSend;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EventProcessorTestController {
    private static Logger logger = LoggerFactory.getLogger(EventProcessorTestController.class);


    @Autowired
    private HttpServletRequest request;

    @PostMapping("/test/event/send")
    public Object eventSend(@RequestBody EventSend eventSend) {
        Map<String, Object> map = null;

        map = new HashMap<>();


        try {
            logger.info("===== eventSend: {}", eventSend);

            String authorization = request.getHeader("Authorization");
            logger.info("===== authorization: {}", authorization);


            map.put("eventSend", eventSend);
            map.put("authorization", authorization);
            map.put("message", "성공");
        } catch (Exception e) {
            map.put("message", e.getMessage());
        }
        return map;
    }
}
