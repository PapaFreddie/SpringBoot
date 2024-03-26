package com.fred;

import jakarta.persistence.*;

import javax.swing.*;
import java.util.Objects;

@Entity

public class Customer { //the customer will have customer id, name, email and age.

    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public Customer(Integer id,   //constructor. it initializes state & value when object is created
                    String name,
                    String email,
                    Integer age
                    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Customer(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, email);

    }
    @Override
    public int hashCode(){
        return Objects.hash(id, name, email, age);
    }
    @Override
    public String toString(){
        return "Customer {" +
                "id= " + id +
                ", name='" + name + '\'' +
                ", email ='" + email + '\'' +
                ", age =" + age +
                '}';
    }

}
/*
Spring Data JPA
(Jakarta Persistence API) - it allows mapping of java classes to data tables.

DAO(DATA ACCESS OBJECT) - structural pattern that allows isolation of app/busines layer from persistence
 */
