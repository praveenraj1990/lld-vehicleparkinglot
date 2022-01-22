package com.parking.service;

import com.parking.model.Admin;

public interface AdminService {
    Admin createAdmin(String name);
    Admin getAdmin(String admin);
}
