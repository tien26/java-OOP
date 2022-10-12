package programmer.zaman.now.aplication;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("kaka");

        Company.Employee employee = company.new Employee();
        employee.setName("kuku");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
