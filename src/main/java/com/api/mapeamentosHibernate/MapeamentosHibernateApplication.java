package com.api.mapeamentosHibernate;

import com.api.mapeamentosHibernate.models.manyToMany.Person2;
import com.api.mapeamentosHibernate.models.manyToMany.Project;
import com.api.mapeamentosHibernate.models.oneToManyAndManyToOne.Person;
import com.api.mapeamentosHibernate.models.oneToManyAndManyToOne.Phone;
import com.api.mapeamentosHibernate.models.oneToOneBidirectional.Address2;
import com.api.mapeamentosHibernate.models.oneToOneBidirectional.Employee2;
import com.api.mapeamentosHibernate.models.oneToOneUnidirectional.Address1;
import com.api.mapeamentosHibernate.models.oneToOneUnidirectional.Employee1;
import com.api.mapeamentosHibernate.repositories.manyToMany.Person2Repository;
import com.api.mapeamentosHibernate.repositories.manyToMany.ProjectRepository;
import com.api.mapeamentosHibernate.repositories.oneToManyAndManyToOne.PersonRepository;
import com.api.mapeamentosHibernate.repositories.oneToOneBidirectional.Employee2Repository;
import com.api.mapeamentosHibernate.repositories.oneToOneUnidirectional.Employee1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MapeamentosHibernateApplication implements CommandLineRunner {

	@Autowired
	Employee1Repository employee1Repository;
	@Autowired
	Employee2Repository employee2Repository;
	@Autowired
	PersonRepository personRepository;
	@Autowired
	Person2Repository person2Repository;
	@Autowired
	ProjectRepository projectRepository;

	public static void main(String[] args) {
		SpringApplication.run(MapeamentosHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// ONE TO ONE UNIDIRECTIONAL
		Address1 addressEmp1 = new Address1("Rua da paz", 20, "Centro", "Campina Grande", "PB");
		Employee1 emp1 = new Employee1("Italo Modesto", 5500.00f, addressEmp1);

		this.employee1Repository.save(emp1);


		// ONE TO ONE BIDIRECTIONAL
		Address2 addressEmp2 = new Address2("Rua da guerra", 15, "Alto Branco", "Campina Grande", "PB");
		Employee2 emp2 = new Employee2("Anelise Cabral", 9500.00f, addressEmp2);

		this.employee2Repository.save(emp2);

		// ONE TO MANY AND MANY TO ONE
		Person person = new Person();
		Phone phone = new Phone("87 9 9999 9999", person);
		List<Phone> phoneList = new ArrayList<>();
		phoneList.add(phone);
		person.setName("Maria de Fatima");
		person.setPhoneList(phoneList);

		this.personRepository.save(person);

		// MANY TO MANY
		/**
		 * Ambas as entidades precisam ser persistidas e resgatados.
		 * Em seguida, ao salvar a entidade owner, a entidade fraca também
		 * será salva, pois configurei o salvamento em cascata.
		 */
		Person2 personThomas = new Person2();
		Person2 personJose = new Person2();
		List<Project> projectsPersonThomas = new ArrayList<>();
		List<Project> projectsPersonJose = new ArrayList<>();

		Project projectBack = new Project();
		Project projectFront = new Project();

		personThomas = this.person2Repository.save(personThomas);
		personJose = this.person2Repository.save(personJose);
		projectFront = this.projectRepository.save(projectFront);
		projectBack =this.projectRepository.save(projectBack);

		personThomas.setName("Thomas Modesto");
		personJose.setName("Jośe Leite");

		projectBack.setName("Projeto Back-end");
		projectFront.setName("Projeto Front-end");

		projectsPersonThomas.add(projectBack);
		projectsPersonThomas.add(projectFront);

		projectsPersonJose.add(projectBack);

		personThomas.setProjectList(projectsPersonThomas);
		personJose.setProjectList(projectsPersonJose);

		this.person2Repository.save(personThomas);
		this.person2Repository.save(personJose);
	}
}
