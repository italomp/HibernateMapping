package com.api.mapeamentosHibernate.models.oneToManyAndManyToOne;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Phone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PHONE_ID")
    private long id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "PERSON_ID")
    private Person owner;

    public Phone(String number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Phone() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
