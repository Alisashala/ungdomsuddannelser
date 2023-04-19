package com.example.ungdomsuddannelser;
import java.util.ArrayList;

public class StudyProgramme {
    private String name;
    private String description;
    private String category;
    private ArrayList<String> courseList;

    public StudyProgramme(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.courseList = courseList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

