package com.digitalfuturesacademy.secretdiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private List<Entry> entries = new ArrayList<>();

    public List<Entry> getEntries(){
        return entries;
    }

    public void addEntry(Entry entry){
        if(entry == null) throw new IllegalArgumentException("entry must not be null");
        entries.add(entry);
    }

    public Entry getEntry(int id){
        for(Entry entry: entries){
            if(entry.getId() == id) return entry;
        }
        return null;
    }

}
