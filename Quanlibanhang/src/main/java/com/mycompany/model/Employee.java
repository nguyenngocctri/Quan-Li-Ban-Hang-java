/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;

/**
 *
 * @author Van Tien
 */
public class Employee implements Serializable{
    private String EmployeeId, Name, Nhom;
    private float Gia;
    private int So;

    public Employee() {
    }

    public Employee(String EmployeeId, String Name, String Nhom, float Gia, int So) {
        this.EmployeeId = EmployeeId;
        this.Name = Name;
        this.Nhom = Nhom;
        this.Gia = Gia;
        this.So = So;
    }

    
    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNhom() {
        return Nhom;
    }

    public void setNhom(String Nhom) {
        this.Nhom = Nhom;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public int getSo() {
        return So;
    }

    public void setSo(int So) {
        this.So = So;
    }
    
}
