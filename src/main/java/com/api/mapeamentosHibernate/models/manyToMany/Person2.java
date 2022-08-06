package com.api.mapeamentosHibernate.models.manyToMany;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* Essa entidade é o lado forte da relação */
@Entity
public class Person2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PERSON2_ID")
    private long id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PERSON2_PROJECT",
            joinColumns = @JoinColumn(name = "PERSON2_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
    private List<Project> projectList;

    public Person2(String name, List<Project> projectList) {
        this.name = name;
        this.projectList = projectList;
    }

    public Person2() {
        this.projectList = new ArrayList<>();
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

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }
}