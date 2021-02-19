package com.company;
import com.company.Controller.EmployeeController;
import com.company.DATA.interfaces.IDB;
import com.company.DATA.Postgre;
import com.company.Repositories.EmployeesRepo;
import com.company.Repositories.IRepo.IEmployeeRepo;

public class MyApp {
    public static void main(String[] args) throws Exception {
        // running of our application
        IDB db = new Postgre();
        IEmployeeRepo repo = new EmployeesRepo(db);
        EmployeeController controller = new EmployeeController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();

    }
}
