/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jbrown99
 */
public class Practice2 {
    
    
    public static void main(String[] args) {
        Employee e1= new Employee("Brown","Josh","111-11-1111");
        Employee e2 = new Employee("Smith","Sally","555-55-5555");
        Employee e3 = new Employee("Greenhorn","Al","789-12-4567");
        
        List<Employee> employee = new ArrayList<>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        
        for(Employee e:employee){
            System.out.println(e);
        }
        
   
        
    }
}
