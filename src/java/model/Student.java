/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ekaranja
 */
public class Student {
   
    private String name;
    private String restrationNumber;
    private String gender;
    private String username;
    private String password;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestrationNumber() {
        return restrationNumber;
    }

    public void setRestrationNumber(String restrationNumber) {
        this.restrationNumber = restrationNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", restrationNumber=" + restrationNumber + ", gender=" + gender + ", username=" + username + ", password=" + password + ", course=" + course + '}';
    }
    
    
}
