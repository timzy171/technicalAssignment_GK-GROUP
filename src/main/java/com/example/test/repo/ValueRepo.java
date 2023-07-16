package com.example.test.repo;

import com.example.test.entity.Value;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValueRepo extends JpaRepository<Value,Long> {

}
