package com.javarzn.annotation.step5;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private String color;
    private String name;
    private String surName;
    private int age;
    private String sex;
    private String phone;
}
