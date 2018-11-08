package yang.springframework.chucknorrisforactuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class JokesController {


    @RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView chucknorris(){
        ModelAndView modelAndView = new ModelAndView("chucknorris");
        modelAndView.addObject("joke","joke");
        return modelAndView;
    }
}
