/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;
import BoardGame.Position;

/**
 *
 * @author joaov
 */
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Position pos = new Position(3, 5);
        System.out.println(pos);
        
        
        sc.close();
    }
    
}
