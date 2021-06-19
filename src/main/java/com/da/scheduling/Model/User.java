package com.da.scheduling.Model;

public class User {
    private int id;
    private String lastName;
    private String firstName;
    private String password;
    private String code;
    private String rule;
    private int masterId;
    private Master master;
    private int adminId;
    private Admin admin;
    private int studentId;
    private Student student;

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
    
    public int getMasterId() {
        return masterId;
    }

    public void setMasterId(int masterId) {
        this.masterId = masterId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
