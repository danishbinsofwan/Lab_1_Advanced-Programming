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
class takeInput {
   
            int i ;
            int j ;
            int r ;
            int c ;
            int a[][];
            Scanner input;
            
            public takeInput()
            {
                input = new Scanner(System.in);
                i = 0;
                r = 0;
                c = 0;
                j = 0;
               
            }
            
            int[][] take()
            {
                System.out.println("\n Taking in Input for a new Matrix..\n");
                System.out.println("Enter the desired number of rows");
                r = input.nextInt();
                
                System.out.println("Enter the desired number of columns");
                c = input.nextInt();
                
                a  = new int[r][c];
                
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        System.out.println("Enter Number for :" + i + j );
                        a[i][j] = input.nextInt();
                    }
                }
                
                return a;
            }
            public void viewMatrix()
            {
                System.out.print("\n\n\n");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                        System.out.print(a[i][j]+" ");
                    System.out.print("\n");
                }
            }
            
        }

