package in.Abhi.controller;

import in.Abhi.dto.LoginRequest;
import in.Abhi.entity.Counseller;
import in.Abhi.service.CounsellorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CounsellorController {

    @Autowired
    private CounsellorService service;

    @PostMapping("/register")
    public String register(@RequestBody Counseller c) {
        System.out.println("Login Request");
        System.out.println("Incoming Data: " + c);
        return service.register(c);
        
    }

    

    @PostMapping("/login")
    public Counseller login(@RequestBody LoginRequest req) {
        return service.login(req.getEmail(), req.getPassword());
    }

    @GetMapping("/dashboard/{id}")
    public Map<String, Integer> dashboard(@PathVariable Integer id) {
        return service.getDashboard(id);
    }
}