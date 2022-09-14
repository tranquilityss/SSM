package com.ss.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ss.ssm.bean.Employee;
import com.ss.ssm.bean.EmployeeExample;
import com.ss.ssm.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ss
 * @create 2022-09-05 12:04
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    public List<Employee> queryAll(){
        EmployeeExample example = new EmployeeExample();
        example.setOrderByClause("id");
        List<Employee> employees = employeeMapper.selectByExampleWithDepartment(example);

        return employees;

    }

    public void saveEmp(Employee emp) {
        employeeMapper.insert(emp);
    }

    public Boolean checkuser(String lastName) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andLastNameEqualTo(lastName);
        long l = employeeMapper.countByExample(example);
        System.out.println(l);
        if( l > 0){
            return false;
        }else {
            return true;
        }
    }

    public Employee queryById(Integer empId) {
        return employeeMapper.selectByIdWithDepartment(empId);
    }

    public void update(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public void delete(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);
    }
}
