package com.da.scheduling.Repository;


import com.da.scheduling.Model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course,Integer> {

}

