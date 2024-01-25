package kr.ac.catholic.sessiontesting.entity;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 8986544052015350952L;

    private String uid;

    public Person() {}

    public Person(String uid) {
        this.uid = uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "uid='" + uid + '\'' +
                '}';
    }
}
