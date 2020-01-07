package com.qf.service;

import com.qf.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminServer {
    public List<Admin> findAll();
}
