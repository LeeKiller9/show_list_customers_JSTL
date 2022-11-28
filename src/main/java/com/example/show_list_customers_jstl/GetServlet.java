package com.example.show_list_customers_jstl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GetServlet", value = "")
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee1 = new Employee("Mai Văn Hoàn","1983-08-20","Hà Nội","avatar1.png");
        employeeList.add(employee1);
        Employee employee2 = new Employee("Nguyễn Văn Nam","1983-08-21","Bắc Giang","avatar2.png");
        employeeList.add(employee2);
        Employee employee3 = new Employee("Nguyễn Thái Hòa","1983-08-22","Nam Định","avatar3.png");
        employeeList.add(employee3);
        Employee employee4 = new Employee("Trần Đăng Khoa","1983-08-17","Hà Tây","avatar4.png");
        employeeList.add(employee4);
        Employee employee5 = new Employee("Nguyễn Đình Thi","1983-08-19","Hà Nội","avatar5.png");
        employeeList.add(employee5);

        request.setAttribute("empList",employeeList);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
