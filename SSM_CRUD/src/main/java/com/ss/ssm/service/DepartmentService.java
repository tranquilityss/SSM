package com.ss.ssm.service;

import com.ss.ssm.bean.Department;
import com.ss.ssm.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ss
 * @create 2022-09-08 9:21
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getDepartment() {
        List<Department> departments = departmentMapper.selectByExample(null);
        return departments;
    }
}
