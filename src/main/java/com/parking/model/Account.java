package com.parking.model;

import java.time.Instant;

public class Account {
    private String id;
    private String name;
    private String username;
    private String password;
    private Instant lastAccessed;
    private Contact contact;
    private PersonalInfo personalInfo;
    private AccountStatus accountStatus;
}
