package com.da.scheduling.Repository;


import com.da.scheduling.Model.Announcement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepo extends CrudRepository<Announcement,Integer> {

}
