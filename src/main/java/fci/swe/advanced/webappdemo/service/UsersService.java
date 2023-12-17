package fci.swe.advanced.webappdemo.service;

import fci.swe.advanced.webappdemo.models.User;
import fci.swe.advanced.webappdemo.repos.UsersRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UsersRepo usersRepo;

    public UsersService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public User addUser(User user){
        return usersRepo.save(user);
    }

    public boolean updateUser(String userId, User user) {
        return false;
    }

    public List<User> getUsers() {
        return usersRepo.findAll();
    }
}
