package com.bridgelabzcoupon;

public class CouponNum {

	public static void main(String[] args) {
        char[] chars="abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
        int max=100000000;
        int random=(int) (Math.random()*max);
        StringBuffer sb=new StringBuffer();
        
        while(random>0)
        {
        	sb.append(chars[random % chars.length]);
        	random /=chars.length;
        	
        }
        String couponCode=sb.toString();
        System.out.println("Coupen Code: "+couponCode);
	}
}
