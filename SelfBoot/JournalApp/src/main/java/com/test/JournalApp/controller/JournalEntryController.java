package com.test.JournalApp.controller;

import com.test.JournalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntry> JournalEntries = new HashMap<>();

    @GetMapping  //localhost:9600/journal GET method
    public List<JournalEntry> getAll() {
        return new ArrayList<>(JournalEntries.values());
    }

    @PostMapping
    public boolean requestEntry(@RequestBody JournalEntry myEntry){ //localhost:9600/journal POST method
        JournalEntries.put(myEntry.getId(), myEntry);
        return  true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getElementById(@PathVariable Long myId){
        return JournalEntries.get(myId);
    }
}
