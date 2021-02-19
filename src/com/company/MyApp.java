package com.company.MyApp;
import com.company.MyApp.Controller.EmployeeController;
import com.company.MyApp.DATA.interfaces.IDB;
import com.company.MyApp.DATA.Postgre;
import com.company.MyApp.Repositories.EmployeesRepo;
import com.company.MyApp.Repositories.IRepo.IEmployeeRepo;

public class MyApp {
    public static void main(String[] args) throws Exception {

        IDB db = new Postgre();
        IEmployeeRepo repo = new EmployeesRepo(db);
        EmployeeController controller = new EmployeeController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();

    }
}
