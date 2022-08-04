package com.api.mapeamentosHibernate.models.oneToOneUnidirectional;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee1 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE1_ID")
    private long id;
    private String name;
    private Float Salary;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ADDRESS1_ID")
    private Address1 address;

    public Employee1(String name, Float salary, Address1 address) {
        this.name = name;
        Salary = salary;
        this.address = address;
    }

    public Employee1() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }
}
