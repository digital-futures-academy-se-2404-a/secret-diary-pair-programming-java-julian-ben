package com.digitalfuturesacademy.secretdiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private List<String> entries = new ArrayList<>();

    public List<String> getEntries(){
        return entries;
    }

    public void addEntry(String entry){
        if(entry == null) throw new IllegalArgumentException("entry must not be null");
        entries.add(entry);
    }

}
