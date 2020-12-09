/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydupli;

import java.util.*;

/**
 *
 * @author vaishu
 */
public class Arraydupli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=s.nextInt();
        int i,j,t,v=0;
        int[] a=new int[n];
        int[] b= new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
            if(a[i]>a[j])
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
            }
        }
        for( i=0;i<n;i++)
        {
          if(a[i]!=v && a[i]!=0)
             b[i]=a[i];
          v=a[i];
        }
        System.out.println("Array elements after removing duplicates are:");
        for( i=0;i<b.length;i++)
        {
            if(b[i]!=0)
             System.out.println(b[i]);
        }
        
        
    }
    
}
