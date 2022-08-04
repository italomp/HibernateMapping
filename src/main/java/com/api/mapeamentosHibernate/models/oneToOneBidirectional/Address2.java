package com.api.mapeamentosHibernate.models.oneToOneBidirectional;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS2_ID")
    private long id;
    private String street;
    private int number;
    private String district;
    private String city;
    private String state;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "address")
    private Employee2 employee2;

    public Address2(String street, int number, String district, String city, String state) {
        this.street = street;
        this.number = number;
        this.district = district;
        this.city = city;
        this.state = state;
    }

    public Address2() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
