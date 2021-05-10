/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringexample;


public class RefactoringExample {

    public static int f (int x, int y) {
        return x + y;
    }
    
    public static void main(String[] args) {
        int x = 5, y = 3, z;
        
        z = f (x , y);
        
        System.out.println(z);
    }
    
}
