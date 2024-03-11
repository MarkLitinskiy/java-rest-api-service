package com.pet.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "albums")
@AllArgsConstructor
@NoArgsConstructor
public class Albums {
    @Id
    private int id;

    private int userId;
    private String title;
}
