package com.spring_vue.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id
    private Integer Id;
    private Integer gender;
//    jpa有生成规则,虽然不区分大小写
    private Integer birthdate;
    private Integer mileage;
    private Integer time;

}
