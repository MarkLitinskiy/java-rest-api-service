package com.pet.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    @Id
    private int id;

    private int userId;
    private String title;
    private String body;
}
