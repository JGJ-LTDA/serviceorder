package com.jgj.serviceorder.datasource.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class OrderEntity {

    @Id
    private Long id;
}
