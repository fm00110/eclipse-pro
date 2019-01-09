package com.ncu.daos;

import org.apache.ibatis.annotations.Param;

import com.ncu.beans.Student;

public interface IStudentDao {

	Student checkLogin(@Param("name")String name, @Param("password")String password);

}
