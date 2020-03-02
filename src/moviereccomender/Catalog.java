   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviereccomender;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ely_867287
 */
public class Catalog
{
    public void importMoviesFromFile() throws FileNotFoundException{
        Scanner file = new Scanner(new File("MOVIES.xlsx"));
       
        while(file.hasNext()){
            
        }
               
    }
    
    public void addMovie(){
        
    }
   
}
