package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.UserDAOImpl;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users") // путь в браузере
    public String viewUsers(Model model) {
        model.addAttribute("users", userService.getAllUser()); // users -> "${users}" в users.html файле
        return "users"; //название файла -> users.html
    }

    @GetMapping(value = "/add") // путь в браузере
    public String createUsers(@ModelAttribute("user") User user) { // user -> "${user}" в addUser.html файле
        return "addUser"; //название файла -> addUser.html
    }

    @GetMapping(value = "/delete") // путь в браузере
    public String deleteUsers(@ModelAttribute("user") User user) { // user -> "${user}" в deleteUse.html файле
        return "deleteUser"; //название файла -> addUser.html
    }

    @GetMapping(value = "/getById") // путь в браузере
    public String getById(@ModelAttribute("user") User user) { // user -> "${user}" в getById.html файле
        return "getById"; //название файла -> addUser.html
    }

    @GetMapping(value = "/edit") // путь в браузере
    public String editUser(@ModelAttribute("user") User user) { // user -> "${user}" в getById.html файле
        return "editUser"; //название файла -> addUser.html
    }



    @GetMapping("/alhello")
    public String helloAlishev(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "surname", required = false) String surname,
                               Model model) {
        model.addAttribute("message", "Hello " + name + " " + surname);
        return "alishev/hello";
    }

    @GetMapping("/algoodbye")
    public String goodbyeAlishev() {
        return "alishev/goodbye";
    }

    @GetMapping("/alexit")
    public String exitAlishev() {
        return "alishev/exit";
    }


//    @GetMapping(value = "/tgusers") // путь в браузере
//    public String showAllUsers(Model model) {
//        model.addAttribute("users", userService.getAllUser()); // users -> "${users}" в users.html файле
//        return "tregulov/users"; //название файла -> users.html
//    }

}
