/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listandsetpractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author joshuabrown
 */
public class Practice4 {
    
    public static void main(String[] args) {
        
    
    
        Employee e1= new Employee("Brown","Josh","111-11-1111");
        Employee e2 = new Employee("Greenhorn","Al","789-12-4567");
        Employee e3 = new Employee("Smith","Sally","555-55-5555");
        Employee e4 = new Employee("Greenhorn","Al","789-12-4567");
        
        
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
    
        for(Employee e : employees) {
            System.out.println(e);
        }
        
    }
}
