package com.example.conflict_tracker2.controller;

import com.example.conflict_tracker2.model.Conflict;
import com.example.conflict_tracker2.service.ConflictService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ConflictController {
    private ConflictService conflictService;

    public ConflictController(ConflictService conflictService) {
        this.conflictService = conflictService;
    }


    @GetMapping("/conflicts")
    public List<Conflict> findAll() {
        return conflictService.findAll();
    }

    @GetMapping("/conflicts/{id}")
    public Conflict findConflict(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/conflicts/add")
    public Conflict addConflict(@RequestBody Conflict conflict){
        return conflictService.addConflict(conflict);
    }
}
