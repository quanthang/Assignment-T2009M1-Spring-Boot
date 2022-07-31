package com.example.asmspring.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "admins")
public class AdminStudent {
@Id
    private int id;
    private String buy_Name;
    private int phone_Number;
    private  String email;
    private String product_Name;
    private LocalDateTime oder_Time;
    private  int status;
}
