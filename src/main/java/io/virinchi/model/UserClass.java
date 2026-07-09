package io.virinchi.model;

import jakarta.persistence.*;

//@annotations
@Entity  // this needs to a table in db no usage
public class UserClass
{
    @Id // PRIMARY KEY
    //auto increment
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name="addressId")
    private AddressClass addressClass;

    public AddressClass getAddressClass() {
        return addressClass;
    }

    public void setAddressClass(AddressClass addressClass) {
        this.addressClass = addressClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
