package com.ss.ssm.Controller;

import com.ss.ssm.bean.Department;
import com.ss.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ss
 * @create 2022-09-08 9:20
 */
@Controller
public class DepartmentControlle {
    @Autowired
    DepartmentService departmentService;

    @ResponseBody
    @RequestMapping("/getDep")
    public List<Department> getDep(){
        List<Department> deps =  departmentService.getDepartment();
        return deps;
    }



}
