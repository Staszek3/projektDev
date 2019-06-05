package com.staszek.javadev.model;

import com.staszek.javadev.model.enums.PresentStudent;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {
    @Id
    @GeneratedValue

    private Long id;
    private String nameSurname; //imie i nazwisko
    private String email;  // email
    private String password; //hasło do logowania
    private String yearOfStudy; //rok i kierunek studiów
    private String indexNr;  // numer indexu

    @Enumerated(EnumType.STRING)
    private PresentStudent presentStudent; //obecność studenta (O-obecny/N- nieobecny/S-spóźnoiny)

    @ManyToOne
    @JoinColumn(name = "javDev_id")
    private JavaDev javaDev;

    public Student(String nameSurname, String email, String password, String yearOfStudy, String indexNr,
                   PresentStudent presentStudent, JavaDev javaDev) {
        this.nameSurname = nameSurname;
        this.email = email;
        this.password = password;
        this.yearOfStudy = yearOfStudy;
        this.indexNr = indexNr;
        this.presentStudent = presentStudent;
        this.javaDev = javaDev;
    }


    public String getIndexNr() {
        return indexNr;
    }

    public void setIndexNr(String indexNr) {
        this.indexNr = indexNr;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PresentStudent getPresentStudent() {
        return presentStudent;
    }

    public void setPresentStudent(PresentStudent presentStudent) {
        this.presentStudent = presentStudent;
    }

    public JavaDev getJavaDev() {
        return javaDev;
    }

    public void setJavaDev(JavaDev javaDev) {
        this.javaDev = javaDev;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nameSurname='" + nameSurname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", indexNr='" + indexNr + '\'' +
                ", presentStudent=" + presentStudent +
                ", javaDev=" + javaDev +
                '}';
    }
}
