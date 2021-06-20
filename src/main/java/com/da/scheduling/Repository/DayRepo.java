package com.da.scheduling.Repository;


import com.da.scheduling.Model.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepo extends CrudRepository<Day,Integer> {

}

