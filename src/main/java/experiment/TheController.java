package experiment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by victorbasso on 13/02/16.
 */
@RestController
public class TheController {

    @RequestMapping("/hi")
    public String endpoint() {
        return "Hello";
    }

}
