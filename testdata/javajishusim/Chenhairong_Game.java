import java.util.Scanner;
public class Chenhairong_Game{	
	static void displayMainMenu(){
	 System.out.println("1 ��ʼ��Ϸ");
	 System.out.println("2 �˳�");
	}
	 static int getInput(){	    
	    Scanner sc = new Scanner(System.in);
	    int j = -1;
	    try{
	      j = sc.nextInt();
	    }catch(Exception e){      
	    }
	    return j;  
	 }
	 static void dispError(){
	  System.out.println("�����������������");
	 }
	 static boolean handle(int sel){
	   switch (sel){
	     case 1:System.out.println("��Ϸ��ʼ");
	            break;
	     case 2:return true;  
	     default:dispError();
	   }
	   return false;
	 }
	public static void main(String[] args)
	{
		  boolean exit = false;
		  while(!exit){
		    displayMainMenu();
		    int sel =  getInput();
		    exit = handle(sel);
		  }
	}
}