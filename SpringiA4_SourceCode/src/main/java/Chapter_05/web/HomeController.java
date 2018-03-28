package Chapter_05.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {

  @RequestMapping(value="/home",method = GET)
  public String home(Model model) {
    return "home";
  }

}
