package com.da.scheduling.Repository;

import com.da.scheduling.Model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends CrudRepository<Admin,Integer> {

}





