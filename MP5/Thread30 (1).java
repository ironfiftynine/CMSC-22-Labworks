import java.io.*;
import java.util.*;

public class Thread30{
  private static int THREAD_COUNT = 10;
  private int size;
  private int[][] table;
  private int toThread;
  private int xtraworker;
  private int worker;
  private int start;
  
public Thread30(int size){
  table = new int[size][size];
  this.size = size;
}
    
public void make(){
  for(int c = 0; c < size; c++){
    if(c == size / 2){
      table[0][c] = 1;
    }
    else{
    table[0][c] = 0;
    System.out.print(table[0][c]);
    }
}
  System.out.println();
}

public void print(){
  make();
  if(size < THREAD_COUNT)
    toThread = size;
  else
    toThread = THREAD_COUNT;
  Rule30thread[] table2 = new Rule30thread[toThread];
  xtraworker = size / toThread;
  worker = size % toThread;
  
  for(int i = 0; i < size - 1; i++){
    start = 0;
    for(int j = 0; j < toThread; j++){
      if(j < worker){
       table2[j] = new Rule30thread(table, start, xtraworker + 1, i); 
      }
      else{
       table2[j] = new Rule30thread(table, start, worker, i);
      }
      if(j < worker){
       start += xtraworker + 1; 
      }
      else{
       start += worker; 
      }
      table2[j].start();
      while(table2[j].isAlive()){
        try{
          table2[j].join();
        }catch(InterruptedException e){
        System.err.println("Thread Interrupted");
        }
      }
    }
    for(int j = 0, k = 0; j < table2.length; j++){
      for(int x: table2[j].arr2){
       table[i + 1][k] = x;
       System.out.printf("%s", x);
       k++;
      }
    }
    System.out.println();
  }
  
  
 }

}