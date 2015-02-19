/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_danish;

/**
 *
 * @author test2
 */
public class Multiply {
    int r1;
    int c1;
    int r2;
    int c2;
    int m;
    int q;
    int k;
    int sum;
    int c;
    int d;
    int a[][];
    int b[][];
    int multiply[][] ;
    takeInput obj1;
    takeInput obj2;
    
    Multiply(takeInput obj1,takeInput obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
        r1 = obj1.r;
        c1 = obj1.c;
        r2 = obj2.r;
        c2 = obj2.c;
        a = obj1.a;
        b = obj2.a;
        multiply = new int[r1][c2];
        m = r1;
        q = c2;
    }
    
    public int[][] Multiplier()
    {
        if (obj1.c != obj2.r )
        {
            System.out.println("Cannot be multiplied , row and column numbers imcompatible");
        }
        else
        {
            for ( c = 0 ; c < m ; c++ )
            {
                for ( d = 0 ; d < c2 ; d++ )
                {   
                    for ( k = 0 ; k < r2 ; k++ )
                    {
                        sum = sum + a[c][k]*b[k][d];
                    }
 
                    multiply[c][d] = sum;
                    sum = 0;
                }
            }
        }
        return multiply;
    }
    public void viewMatrix()
            {
                System.out.print("\nThe Resultant Matrix\n");
                for(c=0;c<m;c++)
                {
                    for(d=0;d<q;d++)
                        System.out.print(multiply[c][d]+" ");
                    System.out.print("\n");
                }
            }
    
}
