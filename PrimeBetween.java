package Progrmas;
import java.util.*;
public class PrimeBetween {
public static void main(String[] args) {
		
		for(int i=1;i<=100;i++){
		    if(checkPrime(i)){
		        System.out.print(i+" " );
		    }
		}
	}
	public static boolean checkPrime(int num){
	    
	
	    if(num<2)
	        return false;
	    for(int i=2;i<num;i++){
	           if(num%i==0){
	                return false;
	            }
	    }
	    return true;
	}
}

