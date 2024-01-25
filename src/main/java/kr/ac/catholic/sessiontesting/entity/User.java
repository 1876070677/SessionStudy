package kr.ac.catholic.sessiontesting.entity;

import lombok.Builder;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 8986544052015350952L;

    private String name;
    private String email;

    public User() {}
    @Builder
    public User(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
