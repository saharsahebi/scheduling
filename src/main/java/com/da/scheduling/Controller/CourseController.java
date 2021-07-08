package com.da.scheduling.Controller;


import com.da.scheduling.Exceptions.UserNotFoundException;
import com.da.scheduling.Model.Announcement;
import com.da.scheduling.Model.Course;
import com.da.scheduling.Model.Day;
import com.da.scheduling.Repository.AnnouncementRepo;
import com.da.scheduling.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;

    @GetMapping("/courses")
    List<Course> all() {
        return (List<Course>) courseRepo.findAll();
    }

    @GetMapping("/courses/{id}")
    Course one(@PathVariable int id) throws UserNotFoundException {
        return courseRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PostMapping("/courses")
    Course newAnnouncement(@RequestBody Course newCourse) {
        return courseRepo.save(newCourse);
    }


    @PutMapping("/courses/{id}")
    Course replaceCourse(@RequestBody Course newCourse , @PathVariable("id") int id) {
        System.out.println("ok");
        return courseRepo.findById(id)
                .map(course -> {
                    course.setId(newCourse.getId());
                    course.setMasters(newCourse.getMasters());
                    course.setTimeTables(newCourse.getTimeTables());
                    course.setTitle(newCourse.getTitle());
                    course.setUnitsCount(newCourse.getUnitsCount());
                    return courseRepo.save(course);
                })
                .orElseGet(() -> {
                    newCourse.setId(id);
                    return courseRepo.save(newCourse);
                });
    }




    @DeleteMapping("/courses/{id}")
    void deleteCourse(@PathVariable Integer id) {
        courseRepo.deleteById(id);
    }

}
