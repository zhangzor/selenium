package two;

import java.util.Scanner;

public class zuoye {

	public static void main(String[] args) {
////第1题
//		int a,b,c,d,z;
//		a=9;b=155;c=1;d=10;
//		for(int i=1;i<4;i++){
//			if(c<d){
//				z=d;
//				d=c;
//				c=z;
//			}
//			if(b<c){
//				z=c;
//				c=b;
//				b=z;
//			}
//			if(a<b){
//				z=b;
//				b=a;
//				a=z;
//			}
//		}
//		System.out.println("a="+a+"\t"+"b="+b+"\t"+"c="+c+"\t"+"d="+d);
////第6题		
//		System.out.println("商品名称          单价                 数量");
//		double a,b,c,d,e,f,sum;
//		a = 245; b = 570; c = 320; 
//		d = 2; e = 1; f = 1;
//		sum = (a*d+b*e+c*f)*0.8;
//		System.out.println("T恤                " + a + "    "+ d );
//		System.out.println("网球鞋           " + b + "    "+ e );
//		System.out.println("网球拍           " + c + "    "+ f );
//		System.out.println("消费金额：  " + sum);
////第3题		
//		Scanner A=new Scanner(System.in);
//		int number=A.nextInt();
//		int a,number1,number2;
//		int number3=0;
//		boolean B=true;
//		a=1;
//		for(int i=1;i<5;i++){
//		number2=number%10;
//		number=number/10;
//		if(B){
//			number3=number2;
//			B=false;
//		}
//		if(a>1){
//		number3=number3*10;
//		number3+=number2;
//		}
//		a++;
//		}
//		System.out.println(number3);
////第4题	
//		int i=1;
//		int a=0;
//		while(i<201){
//			if(i%3==0){
//				a+=i;
//			}
//			i++;
//		}
//		System.out.println(a);
////第5题	
//		Scanner A=new Scanner(System.in);
//		int number=A.nextInt();
//		int a=1;
//		if(number>=0 || number<100000){
//			for(int i=1;i<5;i++){
//				number=number/10;
//				if(number!=0){
//					a++;
//				}
//				else{break;}
//			}
//		System.out.println(a);
//		}
//第2题：
				Scanner input1=new Scanner(System.in);
				Scanner input2=new Scanner(System.in);
				Scanner input3=new Scanner(System.in);
				System.out.println("请依次输入年，月，日");
				int N=input1.nextInt();
				int Y=input1.nextInt();
				int R=input1.nextInt();
				int dateSum = 0;
				if(Y<1||Y>12) {
					System.out.println("月份输入错误");
				}
				if(Y==1||Y==3||Y==5||Y==7||Y==8||Y==10||Y==12) {
					if(R<1||R>31) {
						System.out.println("日期输入错误");
					}
				}
					if(Y==4||Y==6||Y==9||Y==11) {
						if(R<1||R>30) {
							System.out.println("日期输入错误");
					}
				}
				    if(Y==2) {
					if(N % 4==0&&N % 100!=0) {
						if(R<0||R>29) {
							System.out.println("日期输入错误");
						}
					}
					else {
						if(R<0||R>28) {
							System.out.println("日期输入错误");
						}
					}
			    }
				    
				    for(int i=1;i<Y;i++){
						 switch(i){  
				            case 1:case 3:case 5:case 7:case 8:case 10:case 12:  
				            dateSum+=31;  
				            break;  
				            case 4:case 6:case 9:case 11:  
			                dateSum+=30;  
			                break;  
				            case 2:  
			            	if((N % 4 == 0 && N%100 != 0)||
				            			(N % 400 == 0)){
				            		dateSum += 29;
				            	}else{
				            		dateSum += 28;
				            	}
				      }
					}
				    System.out.println("您输入的日期是该年的第："+(dateSum+R)+"天");
	}
}
