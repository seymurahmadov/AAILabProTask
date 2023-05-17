package com.example.aailabprotask.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


//    @NotBlank
//    @Column(unique = true)
//    @Size(min = 1, max = 100)
    private String username;

//    @NotBlank
//    @Size(max = 50)
    private String firstName;

//    @Size(max = 50)
    private String lastName;
}
