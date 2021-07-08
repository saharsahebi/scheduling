package com.da.scheduling.Controller;

import com.da.scheduling.Exceptions.UserNotFoundException;
import com.da.scheduling.Model.Bell;
import com.da.scheduling.Model.Course;
import com.da.scheduling.Model.User;
import com.da.scheduling.Repository.BellRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
public class BellController {

    @Autowired
    private BellRepo bellRepo;

    @GetMapping("/bells")
    List<Bell> all() {
        return (List<Bell>) bellRepo.findAll();
    }

    @GetMapping("/bells/{id}")
    Bell one(@PathVariable int id) throws UserNotFoundException {
        return bellRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }


    @PutMapping("/bells/{id}")
    Bell replaceBell(@RequestBody Bell newBell , @PathVariable("id") int id) {
        System.out.println("ok");
        return bellRepo.findById(id)
                .map(bell -> {
                    bell.setId(id);
                    bell.setBellOfDay(newBell.getBellOfDay());
                    bell.setLabel(newBell.getLabel());
                    return bellRepo.save(bell);
                })
                .orElseGet(() -> {
                    newBell.setId(id);
                    return bellRepo.save(newBell);
                });
    }






    @PostMapping("/bells")
    Bell newBell(@RequestBody Bell newBell) {
        return bellRepo.save(newBell);
    }


    @DeleteMapping("/bells/{id}")
    void deleteBell(@PathVariable Integer id) {
        bellRepo.deleteById(id);
    }

}
