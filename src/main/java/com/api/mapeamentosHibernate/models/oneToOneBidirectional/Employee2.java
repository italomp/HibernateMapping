package com.api.mapeamentosHibernate.models.oneToOneBidirectional;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYEE2_ID")
    private long id;
    private String name;
    private Float Salary;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ADDRESS2_ID")
    private Address2 address;

    public Employee2(String name, Float salary, Address2 address) {
        this.name = name;
        Salary = salary;
        this.address = address;
    }

    public Employee2() {
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

    public Address2 getAddress() {
        return address;
    }

    public void setAddress(Address2 address) {
        this.address = address;
    }
}
