package com.qf.controller;

import com.qf.entity.Admin;
import com.qf.service.impl.AdminServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminServerImpl adminServerImpl;
    @RequestMapping("/findAll")
    public List<Admin> findAll(){
        return adminServerImpl.findAll();
    }
}
