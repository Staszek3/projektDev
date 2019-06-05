package com.staszek.javadev.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
public class JavaDev {  // czyli dane kursu JavaDev
    @Id
    @GeneratedValue
    private Long id;
    private String title; // tytuł wykładu
    private String descript; // krotki opis wykładu

    private String lecturer;// Nazwisko prowadzącego

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "javaDev")
    //@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "students")
    private List<Student> students;


    public JavaDev() {
    }

    public JavaDev(String title, String descript, String lecturer, List<Student> students) {
        this.title = title;
        this.descript = descript;
        this.lecturer = lecturer;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }



    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "JavaDev{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descript='" + descript + '\'' +
                ", lecturer='" + lecturer + '\'' +
                ", students=" + students +
                '}';
    }
}
