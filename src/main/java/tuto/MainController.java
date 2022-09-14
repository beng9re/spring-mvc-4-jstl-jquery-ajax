package tuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    private ActorService actorService;

    @RequestMapping("/main")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("test", "data");

        return modelAndView;
    }

    @RequestMapping("/main/profile")
    public ModelAndView profile(@RequestParam("id") Long id) {
        ModelAndView mv = new ModelAndView("/profile");
        mv.addObject("profile", actorService.findById(id));
        return mv;
    }

    @RequestMapping("/main/profileAll")
    public ModelAndView profileAll() {
        ModelAndView mv = new ModelAndView("/profileAll");
        mv.addObject("profiles", actorService.findByAll());
        return mv;
    }

}
