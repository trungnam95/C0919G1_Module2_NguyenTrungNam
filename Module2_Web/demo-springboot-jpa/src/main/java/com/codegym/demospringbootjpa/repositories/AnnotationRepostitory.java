package com.codegym.demospringbootjpa.repositories;

import com.codegym.demospringbootjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface AnnotationRepostitory extends JpaRepository<Employee, Integer> {
    @Query("select employee from Employee employee")
    List<Employee> findAll();
    //Cau lenh truy van tim ra theo ten va tuoi
    @Query("select employee from Employee employee where employee.name=?1 and employee.age=?2")
    Employee findByNameAndAge(String employeeName,int employeeAge);
}
