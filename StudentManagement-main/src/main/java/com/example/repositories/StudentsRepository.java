package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Students;


@Repository

public interface StudentsRepository extends JpaRepository<Students,Long> {

}
