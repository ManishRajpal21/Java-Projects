import java.util.*;
public class numbergame{
    public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int secretnumber=(int)(Math.random()*100+1);
  System.out.println("enter s to start the  game");
  char ch=sc.next().charAt(0);
  int guess=-1;
  if(ch=='s'||ch=='S'){
        while(guess!=secretnumber){
          System.out.println("guess the number");
          guess=sc.nextInt();

          if(guess>secretnumber){
            System.out.println("guessed number is greater");
          }
          else if(guess<secretnumber){
            System.out.println("guessed number is smaller");
          }
          else{
            System.out.println("guessed number is correct");
          }
        }
  }else{
    System.out.println("game ends ");
  }
    }
}
