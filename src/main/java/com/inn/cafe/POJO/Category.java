package com.inn.cafe.POJO;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.io.Serializable;



@NamedQuery(name = "Category.getAllCategory", query = "SELECT c FROM Category c WHERE c.id IN (SELECT p.category FROM Product p WHERE p.status = 'true')")



@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="category")
public class Category implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;
}