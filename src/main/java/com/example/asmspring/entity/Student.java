package com.example.asmspring.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "students")
public class Student {
    @Id
    @NotEmpty(message = "please enter your roll number")
    private String rollNumber;
    @NotEmpty(message = "please enter your full name")
    @Size(min = 5, max = 250)
    private String fullName;
    @NotEmpty
    @Email(message = "please enter a valid email address.")
    private String email;
    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",
            message = "enter valid password")
    private String password;
    private String gender;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;
    private String phone;
    private String status;
}
