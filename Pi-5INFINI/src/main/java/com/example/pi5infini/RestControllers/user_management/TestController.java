package com.example.pi5infini.RestControllers.user_management;

import com.example.pi5infini.DAO.Repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private IUserRepo iUserRepo ;

    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }


    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable("id") int id){
        iUserRepo.deleteById(id);
    }
}