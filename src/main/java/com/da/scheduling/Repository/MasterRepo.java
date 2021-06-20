package com.da.scheduling.Repository;

import com.da.scheduling.Model.Master;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepo extends CrudRepository<Master,Integer> {
}
