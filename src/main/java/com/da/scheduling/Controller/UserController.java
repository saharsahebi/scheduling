package com.da.scheduling.Controller;



import com.da.scheduling.Model.User;
import com.da.scheduling.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
public class UserController {


    @Autowired
    private UserRepo userRepo;



    @GetMapping("/users")
    List<User> all() {
        return (List<User>) userRepo.findAll();
    }

    @GetMapping("/users/{id}")
    Optional<User> one(@PathVariable int id) {
        return userRepo.findById(id);

    }


    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        return userRepo.save(newUser);
    }


    @PutMapping("/users/{id}")
    User replaceUser(@RequestBody User newUser , @PathVariable("id") int id) {
        System.out.println("ok");
        return userRepo.findById(id)
                .map(user -> {
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setPassword(newUser.getPassword());
                    user.setCode(newUser.getCode());
                    return userRepo.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepo.save(newUser);
                });
    }


    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Integer id) {
        userRepo.deleteById(id);
    }





}
