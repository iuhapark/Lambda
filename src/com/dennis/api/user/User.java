package com.dennis.api.user;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phoneNumber;
    private String addressId;
    private String job;
    private double height;
    private double weight;
    @Builder(builderMethodName = "builder")

    public User(String username, String password, String name, String phoneNumber, String addressId, String job, double height, double weight) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

}
