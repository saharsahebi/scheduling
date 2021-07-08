package com.da.scheduling.Controller;


import com.da.scheduling.Model.Admin;
import com.da.scheduling.Model.User;
import com.da.scheduling.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminRepo adminRepo;


    @GetMapping("/admins")
    List<Admin> all() {
        return (List<Admin>) adminRepo.findAll();
    }


    @PutMapping("/admins/{id}")
    Admin replaceAdmin(@RequestBody Admin newAdmin , @PathVariable("id") int id) {
        System.out.println("ok");
        return adminRepo.findById(id)
                .map(admin -> {
                    User user=newAdmin.getUser();
                    admin.setId(id);
                    admin.setUsersId(admin.getUsersId());
                    return adminRepo.save(admin);
                })
                .orElseGet(() -> {
                    newAdmin.setId(id);
                    return adminRepo.save(newAdmin);
                });
    }
}
