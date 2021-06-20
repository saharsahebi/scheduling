package com.da.scheduling.Repository;


import com.da.scheduling.Model.TimeTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepo extends CrudRepository<TimeTable,Integer> {

}

