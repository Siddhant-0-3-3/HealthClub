package com.example.demo;
//import com.example.Registation.Dto.EmployeeDTO;
//import com.example.Registation.Dto.LoginDTO;
//import com.example.Registation.payload.response.LoginMesage;
public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginMesage loginEmployee(LoginDTO loginDTO);
}