package com.da.scheduling.Token.Security;

import com.da.scheduling.Model.OkUser;
import com.da.scheduling.Model.User;
import com.da.scheduling.Repository.UserRepo;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Component
public class JwtGenerator {


    @Autowired
    private UserRepo userRepo;


    public OkUser generate(User jwtUser) {


            Optional<User> user=userRepo.findById(jwtUser.getId());
            User ok=user.get();
            //System.out.println(ok.getFirstName());
           if (ok.getCode().equals(jwtUser.getCode())&& ok.getRole().equals(jwtUser.getRole())&&ok.getPassword().equals(jwtUser.getPassword())) {
               Claims claims = Jwts.claims()
                       .setSubject(jwtUser.getUsername());
               claims.put("userId", String.valueOf(jwtUser.getId()));
               claims.put("role", jwtUser.getRole());

               JwtBuilder jwtBuilder=Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512, "youtube");
               OkUser okUser=new OkUser();
               okUser.setToken(jwtBuilder.compact());
               //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
               Date date = new Date();
               okUser.setExpireAt(date);
               okUser.setUser(ok);
               return okUser;
           }

           return null;

    }
}
