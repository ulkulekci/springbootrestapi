package com.innova.springbootrestapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "kullanicilar")
@Data

public class User extends BaseEntity {
    @Id
    @SequenceGenerator(name ="user_seq_gen",sequenceName = "user_gen",initialValue =  100,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq_gen")
    @Column(name = "ID")
    private long id;
    @Column(name="isim",length = 100)
    private String firstName;
    @Column(name="soyisim",length = 100)
    private String lastName;

}
