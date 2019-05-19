/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JACC.examen;

import java.util.Scanner;

public class JACC {


    public static void PrimerJACC(){
        int nVehiculos,inc=1;
        double precio1=1,precio2=1, precio3=1,Total=1;
        Scanner i=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de categorias : ");
        nVehiculos=i.nextInt();
        while(inc<=nVehiculos){
            System.out.println("ingrese la categoria: "+inc);
            int cater=i.nextInt();
            System.out.println("ingrese el valor de la categoria: ");
            int cate1=i.nextInt();
            if(cater==1){
                precio1=cate1*0.10;
            }else if(cater==2){
                precio2=cate1*0.07;
            }else if(cater==3){
                precio3=cate1*0.05;
            }
          inc++; 
          Total=precio1+precio2+precio3;
        }
        System.out.println("El impuesto total: "+Total);
        System.out.println("El impuesto de la categoria 1: "+precio1);
        System.out.println("El impuesto de la categoria 2: "+precio2);
        System.out.println("El impuesto de la categoria 3: "+precio3);
        
        
    }
    public static void main(String[] args) {
        PrimerJACC();
    
    }
    
}
