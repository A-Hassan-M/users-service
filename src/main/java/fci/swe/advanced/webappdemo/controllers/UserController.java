package fci.swe.advanced.webappdemo.controllers;

import fci.swe.advanced.webappdemo.models.User;
import fci.swe.advanced.webappdemo.service.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return usersService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return usersService.getUsers();
    }

    @PutMapping("/users/{userId}")
    public String addUser(@RequestBody User user, @PathVariable("userId") String userId){
        if(usersService.updateUser(userId, user)){
            return "User Updated successfully";
        }
        return "Failed to update user";
    }
}
