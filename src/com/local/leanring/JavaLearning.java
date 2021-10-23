package com.local.leanring;

public class JavaLearning {
 int amount=10;
 
 public int givebackamount(){
	 System.out.println("Amount"+amount+" Sent back to you");
	 return amount;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaLearning learn=new JavaLearning();
		int myAmount=learn.givebackamount();
		System.out.println(myAmount);
	}

}
