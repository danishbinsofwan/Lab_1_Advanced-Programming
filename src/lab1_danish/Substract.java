/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_danish;

import java.util.Scanner;
/**
 *
 * @author test1
 */
public class Substract {
    int r1;
    int c1;
    int r2;
    int c2;
    int x;
    int y;
    int a[][];
    int b[][];
    int sum[][] ;
    takeInput obj1;
    takeInput obj2;
    
    Substract(takeInput obj1,takeInput obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
        r1 = obj1.r;
        c1 = obj1.c;
        r2 = obj2.r;
        c2 = obj2.c;
        a = obj1.a;
        b = obj2.a;
        sum = new int[r1][c1];
    }
    
    public int[][] Sub()
    {
        if (obj1.r != obj2.r || obj1.c != obj2.c)
        {
            System.out.println("Cannot be Substracted , row and column numbers imcompatible");
        }
        else
        {
            for ( int x = 0 ; x < r1 ; x++ )
                for ( int y = 0 ; y < c1 ; y++ )
                    sum[x][y] = a[x][y] + b[x][y]; 
        }
        
        return sum;
    }
    public void viewMatrix()
            {
                System.out.print("\nThe Resultant Matrix\n");
                for(x=0;x<r1;x++)
                {
                    for(y=0;y<c1;y++)
                        System.out.print(sum[x][y]+" ");
                    System.out.print("\n");
                }
            }
    
}
