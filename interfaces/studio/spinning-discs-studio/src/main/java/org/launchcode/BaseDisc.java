package org.launchcode;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDisc {
//  Shared, and the same
//  Share basic info

//  name(String)
//  capacity (int)
//  content(ArrayLIst<String>)

    private String name;
    private int capacity;
    private List<String> content = new ArrayList();

    public BaseDisc(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public BaseDisc(String name, int capacity, List<String> content) {
        this(name,capacity);
        this.content = content;
    }

    public String writeData(String input){
        return "Data written: " + input;
    }

    public String getBasicInfo(){
        return "Name: " + name + " Capacity: " + capacity;
    }
}

