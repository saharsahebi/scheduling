package com.da.scheduling.Controller;


import com.da.scheduling.Model.OkUser;
import com.da.scheduling.Model.User;
import com.da.scheduling.Token.Security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/login")
@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
public class AuthController {



    private JwtGenerator jwtGenerator;

    public AuthController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public OkUser generate(@RequestBody final User jwtUser) {
        System.out.println(jwtUser.getCode());
        System.out.println(jwtUser.getRole());
        System.out.println(jwtUser.getPassword());
        return jwtGenerator.generate(jwtUser);

    }

}
