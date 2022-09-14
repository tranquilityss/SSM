package com.ss.ssm.Controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ss.ssm.bean.Department;
import com.ss.ssm.bean.Employee;
import com.ss.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ss
 * @create 2022-09-05 12:03
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @ResponseBody
    @RequestMapping(value = "/emps" )
    public PageInfo get(@RequestParam(value = "pn" , defaultValue = "1")Integer pn){
        PageHelper.startPage(pn, 5);
        List<Employee> employees = employeeService.queryAll();
        PageInfo pageInfo = new PageInfo(employees,5);
        System.out.println(pageInfo.getNavigatepageNums());
        return pageInfo;
    }

    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveEmployee(Employee emp){
        employeeService.saveEmp(emp);
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/check")
    public Map<String,Boolean> checkLastName(@RequestParam("lastName")String lastName){
        Boolean flag = employeeService.checkuser(lastName);
        Map map = new HashMap();
        map.put("flag",flag);
        return map;
    }
    @ResponseBody
    @RequestMapping(value = "/getEmp", method=RequestMethod.GET)
    public Employee getEmp(@RequestParam(value="empId")Integer empId){
        Employee employee = employeeService.queryById(empId);
        return employee;
    }


    /*/{email}/{gender}/{department}*/
    @ResponseBody
    @RequestMapping(value = "/updateEmp/{id}/{email}/{gender}/{department}" ,method = RequestMethod.PUT)
    public String update(
            /*@RequestParam( "id")Integer id,@RequestParam(value = "email")String email,@RequestParam(value = "gender")String gender,@RequestParam(value = "department")Integer department*/
            @PathVariable("id")Integer id,@PathVariable("email")String email,@PathVariable("gender")String gender,@PathVariable("department")Integer department
//            Employee employee
    ){
        System.out.println("11111111");
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEmail(email);
        employee.setGender(gender);
        employee.setDepartment(department);
        System.out.println(employee);
        employeeService.update(employee);
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{deleteId}", method=RequestMethod.DELETE)
    public String delete(@PathVariable("deleteId")Integer id){
        employeeService.delete(id);
        return "删除成功";
    }
    @ResponseBody
    @RequestMapping(value = "/bachDelete/{deleteId}", method=RequestMethod.DELETE)
    public String bachDelete(@PathVariable("deleteId")String bachDelete){
        String[] bach = bachDelete.split(",");
        for (String item:bach) {
            Integer value=Integer.parseInt(item);
            System.out.println(value);
            employeeService.delete(value);
        }
        return "删除成功！";
    }


}
