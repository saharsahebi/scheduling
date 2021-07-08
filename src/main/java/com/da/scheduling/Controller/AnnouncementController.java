package com.da.scheduling.Controller;


import com.da.scheduling.Exceptions.UserNotFoundException;
import com.da.scheduling.Model.Announcement;
import com.da.scheduling.Model.Bell;
import com.da.scheduling.Model.Course;
import com.da.scheduling.Repository.AnnouncementRepo;
import com.da.scheduling.Repository.BellRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
public class AnnouncementController {
    @Autowired
    private AnnouncementRepo announcementRepo;

    @GetMapping("/announcements")
    List<Announcement> all() {
        return (List<Announcement>) announcementRepo.findAll();
    }

    @GetMapping("/announcements/{id}")
    Announcement one(@PathVariable int id) throws UserNotFoundException {
        return announcementRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PostMapping("/announcements")
    Announcement newAnnouncement(@RequestBody Announcement newAnnouncement) {
        return announcementRepo.save(newAnnouncement);
    }

    @PutMapping("/announcements/{id}")
    Announcement replaceAnnouncement(@RequestBody Announcement newAnnouncement , @PathVariable("id") int id) {
        System.out.println("ok");
        return announcementRepo.findById(id)
                .map(announcement -> {
                    announcement.setId(id);
                    announcement.setMessage(newAnnouncement.getMessage());
                    announcement.setTimeTable(newAnnouncement.getTimeTable());
                    announcement.setTimeTablesId(newAnnouncement.getTimeTablesId());

                    return announcementRepo.save(announcement);
                })
                .orElseGet(() -> {
                    newAnnouncement.setId(id);
                    return announcementRepo.save(newAnnouncement);
                });
    }






    @DeleteMapping("/announcements/{id}")
    void deleteAnnouncement(@PathVariable Integer id) {
        announcementRepo.deleteById(id);
    }



}
