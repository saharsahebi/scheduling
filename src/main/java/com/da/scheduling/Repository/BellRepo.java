package com.da.scheduling.Repository;


import com.da.scheduling.Model.Bell;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BellRepo extends CrudRepository<Bell,Integer> {

}
