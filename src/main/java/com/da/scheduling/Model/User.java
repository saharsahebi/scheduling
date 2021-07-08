package com.da.scheduling.Model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String lastName;
    private String firstName;
    private String password;
    private String code;
    private String role;
    private int mastersId;
    @OneToOne
    private Master master;
    private int adminsId;
    @OneToOne
    private Admin admin;
    private int studentsId;
    @OneToOne
    private Student student;

    private String username;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId(){ return id;}
    public void setId(int id){ this.id=id;}

    public String getLastName(){return lastName;}
    public void setLastName(String lastName){this.lastName=lastName;}

    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName){this.firstName=firstName; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getMastersId() {
        return mastersId;
    }

    public void setMastersId(int mastersId) {
        this.mastersId = mastersId;
    }

    public int getAdminsId() {
        return adminsId;
    }

    public void setAdminsId(int adminsId) {
        this.adminsId = adminsId;
    }

    public int getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(int studentsId) {
        this.studentsId = studentsId;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(com.da.scheduling.Model.Master master) {
        this.master = master;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
