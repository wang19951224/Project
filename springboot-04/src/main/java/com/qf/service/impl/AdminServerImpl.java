package com.qf.service.impl;

import com.qf.entity.Admin;
import com.qf.mapper.AdminMapper;
import com.qf.service.AdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
public class AdminServerImpl implements AdminServer {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }
}
