package yang.springframework.jokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import yang.springframework.jokes.service.JokeService;

@Controller
@RequestMapping("/")
public class JokesController {
    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value={"/",""},method = RequestMethod.GET)
    public ModelAndView joke(){
        ModelAndView modelAndView = new ModelAndView("chucknorris");
        modelAndView.addObject("joke",jokeService.getJoke());
        return modelAndView;
    }
}
