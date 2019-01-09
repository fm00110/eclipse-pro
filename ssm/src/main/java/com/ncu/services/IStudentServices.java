package com.ncu.services;

import com.ncu.beans.Student;

public interface IStudentServices {

	Student checkLogin(String name, String password);

}
