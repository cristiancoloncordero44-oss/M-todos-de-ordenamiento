/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellsortejemplo2;

/**
 *
 * @author Cristian Colon
 */
public class Shellsortejemplo2 {
 public static void shellsort (int []arr){
     int n = arr.length;
     int gap = in/2;
     while (gap > 0) {
         for (int i = gap; i < n; i++){
             int temp = arr [i]; 
             int j= i;
             while (j> gap && arr [j-gap]> temp){
                 arr  [j] = arr [j-gap];
                 j -= gap;
                 
             }
         arr [j]= temp;
         }
         gap/=2;
         }
     }
     
 }
  
    public static void main(String[] args) {
       int []arr={12,40,34,56,76,34};
    
}
