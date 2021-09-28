package com.croreprograms;
import java.util.Random;
import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args){
	int h=0,t=0;
	double pa=0,pb=0;
	Scanner s = new Scanner(System.in);
	Random a = new Random();
	   System.out.println("enter number of times for flipcoin");
	int x=s.nextInt();
	for(int i=1;i<=x;i++){
	int r=a.nextInt(2);
	if(r==0){
	   System.out.println(i + ":head");
	h+=1;
	}
	else{
	     System.out.println(i + ":tail");
	t+=1;
	}
	}
	pa=(float)h/x*100;
	pb=(float)t/x*100;
	    System.out.println("total head: " +h);
	    System.out.println("Total  tail: "+t);
	    System.out.println("total tail: " +t);
	    System.out.println("percentage of head: "+pa + "%");
	    System.out.println("percentage of tail: "+pb +"%");
	}
	}