package pl.miloszkajetan.serwisAukcyjny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.miloszkajetan.serwisAukcyjny.user.UserRegistration;
import pl.miloszkajetan.serwisAukcyjny.user.UserRegistrationService;

@Controller
public class MainController {
    private UserRegistrationService userRegistrationService;

    @Autowired
    public MainController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/register")
    public String registerForm(Model model) {
        model.addAttribute("customerFormData", new UserRegistration());

        return "registerForm";
    }

}
