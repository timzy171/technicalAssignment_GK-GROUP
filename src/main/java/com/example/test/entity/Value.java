package com.example.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "values")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Value {
    @Id
    public Integer id;
    @Column(name = "value")
    public Integer value;
}