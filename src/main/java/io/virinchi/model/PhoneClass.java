package io.virinchi.model;

import jakarta.persistence.*;

@Entity
public class PhoneClass {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String phoneNo;


    public UserClass getUserClass() {
        return userClass;
    }

    public void setUserClass(UserClass userClass) {
        this.userClass = userClass;
    }

    @OneToOne
    @JoinColumn(name="userId")
    private UserClass userClass;


}
