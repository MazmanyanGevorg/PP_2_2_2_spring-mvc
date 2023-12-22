package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserService;

@Controller
public class UserEMController {

    private final UserService userService;

    @Autowired
    public UserEMController(@Qualifier("userServiceEMImpl") UserService userService) {
        this.userService = userService;
    }

    //Список всех users
    @GetMapping(value = "/usersem") // путь в браузере (Model model,@ModelAttribute("flashMessage") String flashAttribute)
    public String viewUsers(Model model) {
        model.addAttribute("usersAll", userService.getAllUser()); // usersAll -> "${usersAll}" в users.html файле
        return "usersem"; //название файла -> usersem.html
    }
}
