/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacc.examen;

/**
 *
 * @author intel
 */
public class JACCordenamiento1 {
         public static void main(String[] args) {
        
        JACCordenamiento2 o = new JACCordenamiento2();
		int vector[]={56,-7,0,65,12,20,6,33};
		o.ordenamiento(vector, 0 ,vector.length-1);
		
		for(int i =0; i<vector.length; i++){
			System.out.print(vector[i]+ " ");
		}
	}
}
