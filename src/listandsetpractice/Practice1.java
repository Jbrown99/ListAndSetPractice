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
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List hobbyItemList = new ArrayList();
        hobbyItemList.add("Longboard");
        hobbyItemList.add("basketball");
        hobbyItemList.add("barbell");
        
        System.out.println("Original Hobby Item list: ");
        for(int i=0;i< hobbyItemList.size();i++){
            String h = (String)hobbyItemList.get(i);
            System.out.println(h);
        }
        
        hobbyItemList.add("Football");
        hobbyItemList.add("Dvd player");
        
        System.out.println("Revised Hobby Item list: ");
        for(int i=0;i< hobbyItemList.size(); i++){
            String rhl = (String)hobbyItemList.get(i);
            System.out.println(rhl);
        }
        
        hobbyItemList.remove("Football");
        hobbyItemList.remove("Longboard");
        
        System.out.println("Second Revised Hobby Item list: ");
        for(int i=0;i< hobbyItemList.size(); i++){
            String srhl = (String)hobbyItemList.get(i);
            System.out.println(srhl);
        }
        
        
        
    }
    
}
