package com.example.simplelist;

import java.util.ArrayList;
import java.util.List;

public class PeopleDataProvider {

    public List<People> getPeopleList() {
        List<People> peopleList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            peopleList.add(new People(i, Integer.toString(i)));
        }

        return peopleList;
    }
}
