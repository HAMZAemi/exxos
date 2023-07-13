package com.exosdata.data.backendexample.repositories;

import com.exosdata.data.backendexample.entities.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<Example, String> {
}
