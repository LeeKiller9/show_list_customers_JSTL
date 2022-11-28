package com.example.show_list_customers_jstl;

public class Employee {
    private String employeeName;
    private String employeeAddress;
    private String employeeBOD;
    private String employeeImg;

    public Employee(String employeeName, String employeeAddress, String employeeBOD, String employeeImg) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeBOD = employeeBOD;
        this.employeeImg = employeeImg;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeBOD() {
        return employeeBOD;
    }

    public void setEmployeeBOD(String employeeBOD) {
        this.employeeBOD = employeeBOD;
    }

    public String getEmployeeImg() {
        return employeeImg;
    }

    public void setEmployeeImg(String employeeImg) {
        this.employeeImg = employeeImg;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeBOD='" + employeeBOD + '\'' +
                ", employeeImg='" + employeeImg + '\'' +
                '}';
    }
}

