// Dr. Mohan
// Sample file for lab 5: main program to test classes "Pirate" and
// "Parrot". See files "Pirate.java" and "Parrot.java"
//
// See file "Lab5OneFile.java" for a version that has all three
// classes in a single file.
//
// To compile and run, type:
//         javac Lab5Demo.java
//         java Lab5Demo

import java.util.Scanner;

public class Lab5Demo {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in); // user inputs pirate, parrot names
      String name;

      System.out.print("Pirate's name? ");
      name = in.next();
      Pirate pirate = new Pirate(name); // test Pirate constructor

      System.out.print(pirate.name()+"'s parrot's name? ");
      name = in.next();
      Parrot parrot = new Parrot(name); // test Parrot constructor

      // Test "name" and "speak" methods in both Pirate and Parrot:
      System.out.println(pirate.name()+" says "+pirate.speak());
      System.out.println(pirate.name()+"'s parrot, "+parrot.name()+
                       ", says "+ parrot.speak());
   }
}
