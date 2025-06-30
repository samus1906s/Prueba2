/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;


/**
 *
 * @author samue
 */
public class EmployeeList implements List<Employee> {
   private Employee employees[];

    public EmployeeList() {
        this.employees = new Employee[100];
    }

    @Override
    public void showAll() {
        for (Employee empleado : employees){
            if(empleado != null){
                break;
            }
        }
        
    }

    @Override
    public boolean add(Employee t) {
        if (find(t.getId())!= null){
            return false;
        }
        for(int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = t;
                return true;
            }
        }
        return false;
    }

    @Override
    public Employee find(Object id) {
        for(Employee empleado : employees){
            if (empleado != null && empleado.getId().equals(id)){
                return empleado;
            }
        }
        return null;
    }

    @Override
    public boolean remove(Employee t) {
        for (int i = 0; i < employees.length; i++){
            if(employees[i] != null && employees[i].equals(t)){
                employees[i] = null;
                return true;
            }
        }
        return false;
    }  
}
