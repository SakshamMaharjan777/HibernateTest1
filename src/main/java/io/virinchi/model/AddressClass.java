package io.virinchi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AddressClass {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String addressName;


    public List<UserClass> getUserClass() {
        return userClass;
    }

    public void setUserClass(List<UserClass> userClass) {
        this.userClass = userClass;
    }

    @OneToMany(mappedBy = "addressClass")
        private List<UserClass> userClass;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String  getAddressName() {
            return addressName;
        }

        public void setAddressName(String addressName) {
            this.addressName = addressName;
        }
    }

