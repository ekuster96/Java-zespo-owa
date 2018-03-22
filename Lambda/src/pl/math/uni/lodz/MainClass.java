package pl.math.uni.lodz;

import java.util.function.Function;
import java.util.function.Supplier;

import pl.math.uni.lodz.Interface.ICzyParzysta;
import pl.math.uni.lodz.Interface.IGen;
import pl.math.uni.lodz.Interface.IGetLiczba;
import pl.math.uni.lodz.Interface.IMaks;
import pl.math.uni.lodz.Interface.IPrint;
import pl.math.uni.lodz.Interface.IPrintText;
import pl.math.uni.lodz.Interface.ISuma;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPrint i1 = ()->System.out.println("Test");
		i1.mPrint();
		
		IPrintText i2 = t->System.out.println(t);
		i2.mPrintText("Wow!");
		
		ICzyParzysta i3 = x->x%2==0;
		System.out.println(i3.mCzyParzysta(6));
		
		ISuma i4 = (a,b)->a+b;
		System.out.println(i4.mSuma(3, 8));
		
		IGetLiczba i5 = ()->1;
		System.out.println(i5.mGetLiczba());
		
		IMaks i6 = tab->{
			int tmp=tab[0];
		for (int i=0;i<tab.length;i++) {
			if(tmp<tab[i]) {
				tmp=tab[i];
			}
		}
		return tmp;
		};
		int[] tab1 = {0,5,7,2,3,5,10};
		System.out.println(i6.mMaks(tab1));
		
		IGen<Double, Double> i7= (a,b)->a-b;
		System.out.println(i7.metoda(3.7, 2.8));
		
		Test.foo((p,q)->p.length()+q.length(), "Ala ma", "kota");
		
		Function <Byte, Long> i8= x->1000*(long)x;
		System.out.println(i8.apply((byte)123));
		
		Supplier<String> i9 = ()->"SUPPLIER!";
		System.out.println(i9.get());
		
		
	}
	

}
