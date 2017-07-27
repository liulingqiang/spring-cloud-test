package hello; /**
 * Created by liulq on 2017-07-27 .
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @Value("${mysqldb.datasource.username: Hello Word}")
    String msg;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "result: " + msg;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
