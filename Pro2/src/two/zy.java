package two;

import java.util.Scanner;

public class zy {

	public static void main(String[] args) {
//		System.out.println("		------��Ʒ����嵥-----");
//		System.out.println("Ʒ���ͺ�                         �ߴ�              �۸�                        ����                                               �����");
//		double a,b,c,d,e,f;
//		int g,h,i;
//		a = 13.30; b = 14.00; c = 15.6; 
//		d = 6988.88; e = 5999.99; f = 4999.50;
//		g = 5; h = 10; i = 18;
//		System.out.println("MacBookAir   " + a + "  "+ d + "  i5������4GB�ڴ�128G��̬Ӳ��        " + g);
//		System.out.println("Thinkpad450  " + b + "  "+ e + "  i5������4GB�ڴ�500GӲ��              " + h);
//		System.out.println("ASUS-FL5800  " + c + "  "+ f + "   i7������4GB�ڴ�128G��̬Ӳ��      " + i);
//		System.out.println("�ܿ������" + (g+h+i));
//		System.out.println("�����Ʒ�ܽ�" + (5*6988.88+10*5999.99+18*4999.50));
//		String man;
//		man = "you love me!";
//		if(man == "you love me"){//Ĭ��Ϊman == true
//			System.out.println("give me tang eat");
//		}
//		else{
//			System.out.println("������");
//		}
//		int a=7;
//		if(a%2==0){
//			System.out.println("ż��");
//		}
//		else{
//			System.out.println("odd_number");
//		}
//		int a,b;
//		a=2;b=3;
//		System.out.println(a>b?a:b);
		
//		Scanner A = new Scanner(System.in);
//		int weekend=A.nextInt();
//		switch(weekend){
//		case 1:
//			System.out.println("������");
//			break;
//		case 2:
//			System.out.println("������");
//			break;
//		case 3:
//			System.out.println("������");
//			break;
//		case 4:
//			System.out.println("������");
//			break;
//		case 5:
//			System.out.println("������");
//			break;
//		case 6:
//			System.out.println("��ĩ");
//			break;
//		case 7:
//			System.out.println("��ĩ");
//			break;
//		Scanner B=new Scanner(System.in);
//		int weekend = B.nextInt();
//		boolean A = true;
//		while(A){
//		if(weekend>0 && weekend<6){
//			System.out.println("������");
//			A = false;
//		}
//		else if(weekend>5 && weekend<8){
//			System.out.println("˫����");
//			A = false;
//		}
//		else{weekend = B.nextInt();}
//		}
//		int a=1;
//		while(a<5){
//			System.out.println(a);
//			a++;
//		}
//		int x=0;
//		do{
//			x++;
//			System.out.println("x="+x);
//		}while(x<4);
//		int sum=0;
//		for(int i = 1;i<5;i++){
//			sum+=i;
//		}
//		System.out.println(sum);
//		for(int i=1;i<10;i++){
//			for(int j=1;j<=i;j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1;i<10;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j + "*" + i + "=" + (i*j < 10 ? (" " + i*j) : i*j) + " ");
			}
			System.out.println();
		}
	}
}
