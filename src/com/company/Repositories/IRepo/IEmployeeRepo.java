package com.company.MyApp.Repositories.IRepo;
import com.company.MyApp.Employees;

import java.util.List;

public interface IEmployeeRepo {
    boolean createEmployee(Employees employee);
    Employees getEmployeeById(int id);
    List<Employees> getAllEmployees();
    Employees deleteById(int id);
    List<Employees> getAllFrontends();
    List<Employees> getAllBackends();
    int TotalCost();

}
