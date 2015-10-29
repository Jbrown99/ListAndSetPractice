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
public class Practice3 {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Brown","Josh","111-11-1111");
        Employee e2 = new Employee("Doe","Jane","456-02-2345");
        
        Dog d1 = new Dog("Ralphie",765);
        Dog d2 = new Dog("Lucy",214);
        
        
        List employeesAndDogs = new ArrayList();
        employeesAndDogs.add(e1);
        employeesAndDogs.add(e2);
        employeesAndDogs.add(d1);
        employeesAndDogs.add(d2);
        
        
        
         for(int i=0;i< employeesAndDogs.size();i++){
            String h = (String)employeesAndDogs.get(i);
            System.out.println(h);
        }
        
        
    }
    
    
}
