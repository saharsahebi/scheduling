package com.da.scheduling.Controller;


import com.da.scheduling.Model.Admin;
import com.da.scheduling.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/v1")
public class AdminController {



    @Autowired
    AdminRepo adminRepo;


    @GetMapping("/admins")
    List<Admin> all() {
        return (List<Admin>) adminRepo.findAll();
    }

}
