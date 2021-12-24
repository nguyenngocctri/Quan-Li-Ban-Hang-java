/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Van Tien
 */
public class EmployeeList {
    private ArrayList<Employee> List = new ArrayList<>();
    private int currentIndex = 0;
    public void first(){
        if (currentIndex >0 ){
            currentIndex =0; 
        }
    }
     public void previous(){
        if (currentIndex >0 ){
            currentIndex--; 
        }
    }
    public void next(){
        if (currentIndex< List.size() -1){
            currentIndex++; 
        }
    }
    public void last(){
        currentIndex = List.size() -1;
    }
    public int getCurrentEmployeeIndex(){
        return currentIndex;
    }
    public Employee getCurrentEmployee(){
        if (List.size()==0)
            return null;
        return List.get(currentIndex);
    }
    
    public void add(Employee emp){
        List.add(emp);
    }
    public boolean update (Employee emp){
        Employee existedemp = findById(emp.getEmployeeId());
        boolean  flag = false;
        if (existedemp!= null){
            existedemp.setName(emp.getName());
            existedemp.setNhom(emp.getNhom());
            existedemp.setSo(emp.getSo());
            existedemp.setGia(emp.getGia());
            flag = true;
        }
        return flag;
    }
    public void renderToTable(DefaultTableModel tblModel){
        tblModel.setRowCount (0);
        
        for (Employee employee : List){
                Object[] row = new Object[]{
                    employee.getEmployeeId(), employee.getName(), employee.getNhom(),
                    employee.getGia(), employee.getSo()
                };
                tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
    }
    public Employee findById(String employeeId){
        for (Employee employee : List){
            if (employee.getEmployeeId().equals(employeeId)){
                return employee;
            }
        }
        return null;
    }
    
    public boolean deleteById(String employeeId){
        for (Employee employee : List){
            if (employee.getEmployeeId().equals(employeeId)){
                List.remove(employee);
                return true;
            }
        }
        return false;
    }
}
