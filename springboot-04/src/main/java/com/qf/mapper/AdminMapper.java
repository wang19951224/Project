package com.qf.mapper;

import com.qf.entity.Admin;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AdminMapper {
    public List<Admin> findAll();
}
