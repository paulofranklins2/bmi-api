package com.imcApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @NotEmpty(message = "First Name Should Not Be Empty")
    private String firstName;
    @NotEmpty(message = "Last Name Should Not Be Empty")
    private String lastName;
    @NonNull
    private double height;
    @NonNull
    private double weight;
    private double imc;
    private HealthStatus healthStatus;
    private Date date;

}
