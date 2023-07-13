package com.exosdata.data.backendexample.controllers;

import com.exosdata.data.backendexample.entities.Example;
import com.exosdata.data.backendexample.repositories.ExampleRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class ExampleController {
    ExampleRepository exampleRepository;

    @GetMapping(path = "/")
    public ResponseEntity<List<Example>> getAll() {
        log.info("REST request to get all Example Records");

        List<Example> result = exampleRepository.findAll();

        return ResponseEntity.ok().body(result);
    }
}
