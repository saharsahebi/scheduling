package com.da.scheduling.Model;



import javax.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int id;
    private int usersId;
    @OneToOne
    private User user;

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
