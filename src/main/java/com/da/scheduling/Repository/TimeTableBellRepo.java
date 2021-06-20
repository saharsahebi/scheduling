package com.da.scheduling.Repository;

import com.da.scheduling.Model.TimeTableBell;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableBellRepo extends CrudRepository<TimeTableBell,Integer> {

}
