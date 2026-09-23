package com.SpringBoot1.model;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String emailId;
    }