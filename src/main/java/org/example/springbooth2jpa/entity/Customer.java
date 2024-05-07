package org.example.springbooth2jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data   // 롬복에서 getter,setter 자동으로 만들어줌
@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    @Column(length=1024)
    private String address;
}
