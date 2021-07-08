package com.da.scheduling.Controller;


import com.da.scheduling.Exceptions.UserNotFoundException;
import com.da.scheduling.Model.Bell;
import com.da.scheduling.Model.Day;
import com.da.scheduling.Model.User;
import com.da.scheduling.Repository.BellRepo;
import com.da.scheduling.Repository.DayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
public class DayController {
    @Autowired
    private DayRepo dayRepo;

    @GetMapping("/days")
    List<Day> all() {
        return (List<Day>) dayRepo.findAll();
    }

    @GetMapping("/days/{id}")
    Day one(@PathVariable int id) throws UserNotFoundException {
        return dayRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }


    @PostMapping("/days")
    Day newDay(@RequestBody Day newDay) {
        return dayRepo.save(newDay);
    }




    @PutMapping("/days/{id}")
    Day replaceDay(@RequestBody Day newDay , @PathVariable("id") int id) {
        System.out.println("ok");
        return dayRepo.findById(id)
                .map(day -> {
                    day.setId(id);
                    day.setDayOfWeek(newDay.getDayOfWeek());
                    day.setLabel(newDay.getLabel());
                    return dayRepo.save(day);
                })
                .orElseGet(() -> {
                    newDay.setId(id);
                    return dayRepo.save(newDay);
                });
    }




    @DeleteMapping("/days/{id}")
    void deleteDay(@PathVariable Integer id) {
        dayRepo.deleteById(id);
    }

}
