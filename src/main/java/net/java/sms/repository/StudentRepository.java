package net.java.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.sms.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
