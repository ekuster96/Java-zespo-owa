package pl.math.uni.lodz;

public class Interface {
	interface IPrint{
		void mPrint();
	}
	
	interface IPrintText{
		void mPrintText(String tekst);
	}
	
	interface ICzyParzysta{
		boolean mCzyParzysta(int x);
	}
	
	interface ISuma{
		double mSuma(double a, double b);
	}
	
	interface IGetLiczba{
		int mGetLiczba();
	}
	
	interface IMaks{
		int mMaks(int tab[]);
	}
	interface IGen<R,P>{
		R metoda(P param1, P param2);
	}
}
