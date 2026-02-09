package com.nerdlab.bank.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "created_at")
    private LocalDateTime createdAt;


    public Users(
            String firstName,
            String lastName,
            String email){
        this.setFisrtName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public Users(){

    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return  this.lastName;
    }

    private void setFisrtName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

}
