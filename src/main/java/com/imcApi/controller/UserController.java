package com.imcApi.controller;

import com.imcApi.model.Response;
import com.imcApi.model.User;
import com.imcApi.service.user.UserImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserImplementation userImplementation;

    @GetMapping("/list")
    public ResponseEntity<Response> getUserList() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("user", userImplementation.userList(10)))
                        .message("Users retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Response> getUser(@PathVariable("id") String id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("user", userImplementation.getUser(id)))
                        .message("User retrieved")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @PostMapping("/save")
    public ResponseEntity<Response> saveUser(@RequestBody @Valid User user) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("user", userImplementation.saveUser(user)))
                        .message("User created successfully")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response> deleteUser(@PathVariable("id") String id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(now())
                        .data(of("user", userImplementation.deleteUser(id)))
                        .message("User deleted successfully")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }
}
