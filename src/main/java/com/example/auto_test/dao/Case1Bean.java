package com.example.auto_test.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Case1Bean {

    private ArrayList<String> caseName;

    public ArrayList<String> getCaseName() {
        return caseName;
    }

    public void setCaseName(ArrayList<String> caseName) {
        this.caseName = caseName;
    }

}
