package com.example.ungdomsuddannelser;
import java.util.ArrayList;

public class StudyProgramme {
    private String name;
    private String description;
    private String category;
    private ArrayList<String> courses;

    public StudyProgramme(String name, String description, String category, ArrayList<String> courses) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.courses = courses;
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
        return courses;
    }

    public void addCourse(String course){
        this.courses.add(course);
    }
    public void removeCourse(String course) {
        this.courses.remove(course);
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "StudyProgramme{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", courses=" + courses +
                '}';
    }
}


