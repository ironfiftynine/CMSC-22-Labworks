public class MP1{
  private int size;
  private int[][] table;
 
 public MP1(int size){
   table = new int[size][size];
   this.size = size;
 }
 
 public void make(){
   for(int r = 0; r < size; r++)
     for(int c = 0; c < size; c++)
     table[r][c] = 0;
   
  table[0][size/2] = 1; 
 }
  
 public void rule30thread(){
   for(int r = 0; r < size ; r++){
            for(int c = 0; c < size ; c++){
                
            if(c == 0){
                if(table[r][c] == 0 && table[r][c+1] == 0 && r + 1 < size)
                    table[r+1][c] = 0;
                if(table[r][c] == 0 && table[r][c+1] == 1 && r + 1 < size)
                    table[r+1][c] = 1;
                if(table[r][c] == 1 && table[r][c+1] == 1 && r + 1 < size)
                    table[r+1][c] = 1;
                if(table[r][c] == 1 && table[r][c+1] == 0 && r + 1 < size)
                    table[r+1][c] = 1;
            }
            else if(c == size - 1){
                if(table[r][c-1] == 0 && table[r][c] == 0 && r + 1 < size)
                    table[r+1][c] = 0;
                if(table[r][c-1] == 0 && table[r][c] == 1 && r + 1 < size)
                    table[r+1][c] = 1;
                if(table[r][c-1] == 1 && table[r][c] == 0 && r + 1 < size)
                    table[r+1][c] = 1;
                if(table[r][c-1] == 1 && table[r][c] == 1 && r + 1 < size)
                    table[r+1][c] = 0;
            }
            else if(c != 0){
                if(table[r][c-1] == 0 && table[r][c] == 0 && table[r][c+1] == 0 && r + 1 < size)
                    table[r+1][c] = 0;
                if(table[r][c-1] == 1 && table[r][c] == 1 && table[r][c+1] == 1 && r + 1 < size)
                    table[r+1][c] = 0;
                if(table[r][c-1] == 1 && table[r][c] == 1 && table[r][c+1] == 0 && r + 1 < size)
                    table[r+1][c] = 0;
                if(table[r][c-1] == 1 && table[r][c] == 0 && table[r][c+1] == 1 && r + 1 < size)
                    table[r+1][c] = 0;
                if(table[r][c-1] == 1 && table[r][c] == 0 && table[r][c+1] == 0 && r + 1 < size)
                    table[r+1][c] = 1;
                if(table[r][c-1] == 0 && table[r][c] == 1 && table[r][c+1] == 1 && r + 1 < size)
                    table[r+1][c] = 1;
                if(table[r][c-1] == 0 && table[r][c] == 1 && table[r][c+1] == 0 && r + 1 < size)
                    table[r+1][c] = 1;
                if(table[r][c-1] == 0 && table[r][c] == 0 && table[r][c+1] == 1 && r + 1 < size)
                    table[r+1][c] = 1;
            }
            }
        }
   
 }
 
 public void print(){
  make();
  rule30thread();
         for(int r = 0; r < size; r++){
            for (int c = 0; c < size; c++){
                System.out.printf("%s",table[r][c]);
            }
            System.out.println();
        }
 }
  
}