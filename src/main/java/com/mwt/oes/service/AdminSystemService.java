package com.mwt.oes.service;

import com.mwt.oes.domain.Admin;

import java.util.List;

public interface AdminSystemService {
    public List<Admin> adminLogin(String ano, String psw);
    public boolean updateAdmin(Admin admin);
}
