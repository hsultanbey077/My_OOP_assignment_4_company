package com.company.Repositories;
import com.company.DATA.interfaces.IDB;
import com.company.Employees;
import com.company.Repositories.IRepo.IEmployeeRepo;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
public class EmployeesRepo implements IEmployeeRepo {
    private final IDB db;

    public EmployeesRepo(IDB db) {
        this.db = db;
    }


    @Override
    public boolean createEmployee(Employees employee) {// method fro creating user
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO employee(id,age,name,price,job) VALUES (?,?,?,?,?)";//query for creating user
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1,employee.getId());
            st.setInt(2, employee.getAge());
            st.setString(3, employee.getName());
            st.setInt(4,employee.getPrice());
            st.setString(5,employee.getJob());
            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Employees getEmployeeById(int id) {//method for getting information by id
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,age,name,price,job FROM employee WHERE id=?";//query for this method
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Employees employee = new Employees(rs.getInt("id"),
                        rs.getInt("age"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("job"));
                return employee;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Employees> getAllEmployees() {//getting all users from table
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,age,name,price,job FROM employee";//query for this method
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Employees> employees = new LinkedList<>();
            while (rs.next()) {//getting all columns
                Employees employee = new Employees(rs.getInt("id"),
                        rs.getInt("age"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("job"));

                employees.add(employee);
            }

            return employees;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Employees deleteById(int id) {//method for deleting users from table
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "DELETE FROM employee WHERE id=?";//it is query for this method
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);//specify which id

            st.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Employees> getAllFrontends() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,age,name,price,job FROM employee WHERE job='frontend'";// it is query for getting frontend developers
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Employees> employees = new LinkedList<>();
            while (rs.next()) {//loop for getting information from table
                Employees employee = new Employees(rs.getInt("id"),
                        rs.getInt("age"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("job"));

                employees.add(employee);
            }

            return employees;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Employees> getAllBackends() { // method for getting all backend developers
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id,age,name,price,job FROM employee WHERE job='backend'";// it is query fro getting infromation
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Employees> employees = new LinkedList<>();
            while (rs.next()) {// loop for getting information from table
                Employees employee = new Employees(rs.getInt("id"),
                        rs.getInt("age"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("job"));

                employees.add(employee);
            }

            return employees;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert con != null;
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public int TotalCost() { // method for getting sum of  salaries from table
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT price FROM employee"; // it is query
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int response = 0;
            while (rs.next()) { //loop for getting salaries
                response=response+rs.getInt("price");
            }return response;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }finally {
            try{
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return 0;
    }

}


