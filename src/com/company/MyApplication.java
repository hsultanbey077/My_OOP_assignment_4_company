package com.company;
import com.company.Controller.EmployeeController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication { //frontend of our application
    private final EmployeeController controller;
    private final Scanner scanner;

    public MyApplication(EmployeeController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }

    public void start() {//options of my applications
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all employees");
            System.out.println("2. Get employee by id");
            System.out.println("3. Create employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Select frontend employees");
            System.out.println("6. Select backend employees");
            System.out.println("7. The sum of prices");
            System.out.println("0. Exit");
            System.out.println();
            try {//it is how works my options
                System.out.print("Enter option (1-7): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllEmployeesMenu();
                } else if (option == 2) {
                    getEmployeesByIdMenu();
                } else if (option == 3) {
                    createEmployeeMenu();
                } else if (option == 4) {
                    DeleteEmployeeByIdMenu();
                } else if (option == 5) {
                    SelectFrontends();
                } else if (option == 6) {
                    SelectBackends();
                } else if(option==7){
                    totalCost();
                }else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine(); // to ignore incorrect input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("----------------------------");

        }
    }
    //it is functions for working application
    public void getAllEmployeesMenu() {
        String response = controller.getAllEmployees();
        System.out.println(response);
    }

    public void getEmployeesByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        int response = controller.getEmployeeById(id);
        System.out.println(response);
    }

    public void DeleteEmployeeByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        int response = controller.deleteEmployeeById(id);
        System.out.println(response);
    }

    public void createEmployeeMenu() {
        System.out.println("Please enter id");
        int id = scanner.nextInt();

        System.out.println("Please enter age");
        int age = scanner.nextInt();

        System.out.println("Please enter name");
        String name = scanner.next();

        System.out.println("Please enter price");
        int price = scanner.nextInt();

        System.out.println("Please enter job");
        String job = scanner.next();

        String response = controller.createEmployee(id, age, name, price, job);
        System.out.println(response);
    }

    public void SelectFrontends() {

        String response = controller.selectFrontend();
        System.out.println(response);
    }

    public void SelectBackends() {

        String response = controller.selectBackend();
        System.out.println(response);
    }
    public void totalCost(){
        int response = controller.totalCost();
        System.out.println("The sum of prices: " + response);
    }
}
