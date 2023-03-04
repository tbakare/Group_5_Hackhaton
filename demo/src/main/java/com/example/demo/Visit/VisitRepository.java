package com.example.demo.Visit;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.User.User;


public interface VisitRepository extends JpaRepository<Visit, Integer> {

    //Optional<Visit> findByIdWithUser(Integer id);
    List<Visit> findByUser(User user);

}
