/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_danish;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author test2
 */
public class readFile {
    public readFile(String fileName) {
        
        String line = "";
        int ind = 0;
        int num = 0;
        int r1 , r2 , r3;
        int c1 , c2 , c3;
        System.out.println(fileName);
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);//Can also use a Scanner to read the file
            String token = " ";
        
            while((line = br.readLine() ) != null) {
                if (ind == 1)
                {
                    if( num == 1)
                    {   
                        System.out.println(line + "hai");
                        r1  = Integer.parseInt(line.substring(0,1));
                        ind++;
                    }
                    if( num == 2)
                    {    
                        r2  = Integer.parseInt(line.substring(0,1));
                        ind++;
                    }
                    if( num == 3)
                    {    
                        System.out.println(line + "pk");
                        r3  = Integer.parseInt(line.substring(0,1));
                        ind++;
                    }
                    
                }
                else if(ind == 2)
                {
                    if( num == 1)
                    {    
                        c1  = Integer.parseInt(line.substring(0,1));
                        
                    }
                    if( num == 2)
                    {    
                        c2  = Integer.parseInt(line.substring(0,1));
                        
                    }
                    if( num == 3)
                    {    
                        c3  = Integer.parseInt(line.substring(0,1));
                        
                    }
                    ind = 0;
                }
                if (line.compareTo("xxx") == 0){
                    ind++;
                    num++;
                }
                else if(line.length() != 1)
                {
                    
                }
                else
                    System.out.println(line);
            }
        }
        catch(FileNotFoundException fN) {
            fN.printStackTrace();
        }
        catch(IOException e) {
            System.out.println(e);
        }
        //return data;
    }   
}
