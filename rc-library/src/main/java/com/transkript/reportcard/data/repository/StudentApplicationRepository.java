package com.transkript.reportcard.data.repository;


import com.transkript.reportcard.data.entity.StudentApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentApplicationRepository extends JpaRepository<StudentApplication, Long> {
}
