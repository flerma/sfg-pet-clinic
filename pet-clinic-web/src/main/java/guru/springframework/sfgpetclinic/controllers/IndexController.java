package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author flerma
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html"})
    public String index() {
        return "index";
    }
}
