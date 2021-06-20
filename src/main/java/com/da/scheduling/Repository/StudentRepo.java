package com.da.scheduling.Repository;


import com.da.scheduling.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

}

