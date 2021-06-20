package com.da.scheduling.Repository;


import com.da.scheduling.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {

}
