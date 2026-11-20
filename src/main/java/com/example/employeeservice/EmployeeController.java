package com.example.employeeservice;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public List<Map<String, Object>> employees() {
        return List.of(
            Map.of("id", 101, "name", "Srini", "role", "Platform Engineer"),
            Map.of("id", 102, "name", "Srini", "role", "Java Developer"),
            Map.of("id", 103, "name", "Srini", "role", "QA Engineer")
        );
    }
}
