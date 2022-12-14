package com.ss.ssm.dao;

import com.ss.ssm.bean.Department;
import com.ss.ssm.bean.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    long countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    Department selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_department
     *
     * @mbg.generated Mon Sep 05 13:55:24 CST 2022
     */
    int updateByPrimaryKey(Department record);
}