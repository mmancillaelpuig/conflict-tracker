package com.example.conflict_tracker2.service;

import com.example.conflict_tracker2.model.Conflict;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConflictService {

    ArrayList<Conflict> conflicts = new ArrayList<>();

    public List<Conflict> findAll(){
        return conflicts;
    }

    public Conflict addConflict(Conflict conflict){
        conflicts.add(conflict);
        return conflict;
    }
}
