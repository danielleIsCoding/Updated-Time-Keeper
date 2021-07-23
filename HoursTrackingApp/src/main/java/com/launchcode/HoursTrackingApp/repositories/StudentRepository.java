package com.launchcode.HoursTrackingApp.repositories;

import com.launchcode.HoursTrackingApp.domain.Student;
import com.launchcode.HoursTrackingApp.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student findByUserId(User users);
}
