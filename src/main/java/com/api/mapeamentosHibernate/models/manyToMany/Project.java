package com.api.mapeamentosHibernate.models.manyToMany;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* Essa entidade é o lado fraco da relação */
@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROJECT_ID")
    private long id;
    private String name;
    @ManyToMany(mappedBy = "projectList")
    private List<Person2> personList;

    public Project(String name, List<Person2> personList) {
        this.name = name;
        this.personList = personList;
    }

    public Project() {
        this.personList = new ArrayList<>();
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

    public List<Person2> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person2> personList) {
        this.personList = personList;
    }
}
