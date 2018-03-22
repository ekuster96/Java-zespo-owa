package pl.math.uni.lodz;

import pl.math.uni.lodz.Interface.IGen;

public class Test {
	public void print(){ //		()->System.out.println("Test");
		System.out.println("Test");
	}
	
	public void printText(String tekst){ // 	t->System.out.println(t);
		System.out.println(tekst);
	}
	
	public boolean czyParzysta (int x){ //		x->x%2==0;
		return x%2==0;
	}
	
	public double suma(double a, double b){ //		(a,b)->a+b;
		return a+b;
	}
	
	public int getLiczba(){ // 		()->1;
		return 1;
	}
	
	/*
	 * tab->{int tmp=tab[0];
	for (int i=0;i<tab.length;i++) {
		if(tmp<tab[i]) {
			tmp=tab[i];
		}
	}
	return tmp;
	}
*/
	
	public int maks(int[] tab){
		int tmp=tab[0];
		for (int i=0; i<tab.length; i++){
			if (tmp<tab[i]){
				tmp=tab[i];
			}
		}
		return tmp;
	}
	
	public static void foo(IGen<Integer, String> i, String p1, String p2){
		System.out.println(i.metoda(p1, p2));
	}
}
