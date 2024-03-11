package com.pet.rest.entity;

import com.fasterxml.jackson.annotation.JsonSetter;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id
    private int id;
    @JsonSetter("name")
    private String name;
    private String username;
    private String email;
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    private String phone;
    private String website;
    @OneToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;
}
