package com.example.Quickr.Repository;

import com.example.Quickr.Entities.ErrorLogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorLoggerRepository extends JpaRepository<ErrorLogger,Long> {
}
