//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import web.dao.UserDAOImpl;
//import web.model.User;
//import web.service.UserService;
//
//@Controller
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(@Qualifier("userServiceImpl") UserService userService) {
//        this.userService = userService;
//    }
//
//    // Список всех пользователей
//    @GetMapping(value = "/users") // путь в браузере (Model model,@ModelAttribute("flashMessage") String flashAttribute)
//    public String viewUsers(Model model) {
//        model.addAttribute("users", userService.getAllUser()); // users -> "${users}" в users.html файле
//        return "users"; //название файла -> users.html
//    }
//
//    //добавить пользователя
//    @GetMapping(value = "/add") // путь в браузере (@ModelAttribute("user") User user)
//    public String createUsers(@ModelAttribute("user") User user) { // user -> "${user}" в addUser.html файле
//        return "addUser"; //название файла -> addUser.html
//    }
//
//    //удалить пользователя
//    @GetMapping(value = "/delete") // путь в браузере (@RequestParam(value = "id", required = true, defaultValue = "") String id, RedirectAttributes attributes)
//    public String deleteUsers(@ModelAttribute("user") User user) { // user -> "${user}" в deleteUse.html файле
//        return "deleteUser"; //название файла -> addUser.html
//    }
//
//    //вернуть пользователя по id
//    @GetMapping(value = "/getById") // путь в браузере
//    public String getById(@ModelAttribute("user") User user) { // user -> "${user}" в getById.html файле
//        return "getById"; //название файла -> addUser.html
//    }
//
//    //редактировать пользователя
//    @GetMapping(value = "/edit") // путь в браузере (@RequestParam("id") int id, RedirectAttributes attributes, Model model)
//    public String editUser(@ModelAttribute("user") User user) { // user -> "${user}" в getById.html файле
//        return "editUser"; //название файла -> addUser.html
//    }
//
//    //ссылочный метод с параметрами
//    @GetMapping("/alhello")
//    public String helloAlishev(@RequestParam(value = "name", required = false) String name,
//                               @RequestParam(value = "surname", required = false) String surname,
//                               Model model) {
//        model.addAttribute("message", "Hello " + name + " " + surname);
//        return "alishev/hello";
//    }
//
//    //ссылочный метод на другую страницу
//    @GetMapping("/algoodbye")
//    public String goodbyeAlishev() {
//        return "alishev/goodbye";
//    }
//
//    //ссылка на конечную страницу
//    @GetMapping("/alexit")
//    public String exitAlishev() {
//        return "alishev/exit";
//    }
//
//
//    @GetMapping(value = "/tgusers") // путь в браузере
//    public String showAllUsers(Model model) {
//        model.addAttribute("users", userService.getAllUser()); // users -> "${users}" в users.html файле
//        return "tregulov/users"; //название файла -> users.html
//    }
//
//    @GetMapping()
//    public String index(Model model){
//        model.addAttribute("usersindex", userService.getAllUser());
//        return "alishev/useral";
//    }
//
////    @GetMapping("/{id}")
////    public String show(@PathVariable("id") int id, Model model) {
////        model.addAttribute("usershow", userService.show(id));
////        return "alishev/useral";
////    }
////
////    @GetMapping("/new")
////    public String newUser(Model model) {
////        model.addAttribute("user", new User);
////    }
//}
