package com.ss.ssm.test;

import com.ss.ssm.bean.Department;
import com.ss.ssm.bean.Employee;
import com.ss.ssm.dao.DepartmentMapper;
import com.ss.ssm.dao.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

/**
 * @author ss
 * @create 2022-09-02 20:42
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:ApplicationContext.xml"})*/
public class TestConnection {
    @Test
    public void testConnection() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        DepartmentMapper bean = ac.getBean(DepartmentMapper.class);
        bean.insert(new Department(1,"开发部"));
        bean.insert(new Department(2,"测试部"));

    }
    @Test
    public void testBatchInsertEmployee() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeMapper bean = context.getBean(EmployeeMapper.class);

        for (int i=1;i<=1000;i++){
            String substring = UUID.randomUUID().toString().substring(0,5);
            System.out.println(substring);
            int m = bean.insert(new Employee(null,substring, "M", substring + "@qq.com", 1));

        }
    }
    @Test
    public void testDepmentMapper() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeMapper bean = ac.getBean(EmployeeMapper.class);
        System.out.println(bean);
    }
    @Test
    public void testGgetEmp() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        EmployeeMapper bean = ac.getBean(EmployeeMapper.class);
        Employee employee = bean.selectByIdWithDepartment(1);
        System.out.println(employee);
    }
}
