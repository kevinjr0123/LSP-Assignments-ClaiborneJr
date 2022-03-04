package org.howard.edu.lsp.assignment5.test;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

import java.util.*;


public class Driver {

   public static void main(String[] args) throws IntegerSetException {
      
ArrayList<Integer> list1= new ArrayList<>();
ArrayList<Integer> list2= new ArrayList<>();
  
  
// make 2 instance of integerset class for implementation
IntegerSet set1= new IntegerSet(list1);
IntegerSet set2= new IntegerSet(list2);
  
System.out.println("Is equal : "+set1.equals(set2));
System.out.println("Is empty : "+set1.isEmpty());


set1.add(1);
set1.add(3);
set1.add(4);
set1.add(6);
set1.add(3);
set1.add(8);
set1.add(7);
set1.add(1023);
set1.remove(1023);
  
set2.add(1);
set2.add(2);
set2.add(3);
set2.add(4);
set2.add(5);
set2.add(6);
set2.add(7);
set2.add(2727);

  
System.out.println("Length of Set 1 : "+set1.length());
System.out.println("Length of Set 2 : "+set2.length());
System.out.println("Set 1 : "+set1.getlist());
System.out.println("Set 2 : "+set2.getlist());
  
System.out.println("Is equal : "+set1.equals(set2));
System.out.println("Is empty : "+set1.isEmpty());

System.out.println("Set 1 To String : "+set1.toString());
System.out.println("Set 2 To String : "+set2.toString());
  
System.out.println("Largest element in set1 : "+set1.largest());
  
System.out.println("Smallest element in set2 : "+set2.smallest());
  
IntegerSet setu= set1.union(set2);
  
System.out.println("Union : "+setu.getlist() );
  
IntegerSet seti= set1.intersection(set2);
  
System.out.println("Intersection : "+seti.getlist() );

IntegerSet setd= set2.diff(set1);

System.out.println("Difference : "+setd.getlist() );

System.out.println("Set 1 Contains 1 : "+set1.contains(1));
System.out.println("Set 1 Contains 0 : "+set1.contains(0));

set1.clear();
System.out.println("Cleared Set 1 : "+set1.getlist());
System.out.println("Set 2 : "+set2.getlist());
    
   }

}