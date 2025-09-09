package com.restfulcrud.crudoperations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String stu_Name;
    private String stu_email;
    private String address;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getStu_Name() {
        return stu_Name;
    }

    public void setStu_Name(String stu_Name) {
        this.stu_Name = stu_Name;
    }

    public String getStu_email() {
        return stu_email;
    }

    public void setStu_email(String stu_email) {
        this.stu_email = stu_email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(long id, String stu_Name, String stu_email, String address) {
        this.id = id;
        this.stu_Name = stu_Name;
        this.stu_email = stu_email;
        this.address = address;
    }

    public Student() {
        super();

    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stu_Name='" + stu_Name + '\'' +
                ", stu_email='" + stu_email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
