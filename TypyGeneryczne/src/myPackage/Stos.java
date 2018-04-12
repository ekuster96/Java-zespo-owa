package myPackage;

class Elem<T> {
	T wart;
	Elem<T> next;
	
	public Elem (T x, Elem<T> n){
		next=n;
		wart=x;
	}
	
	public Elem<T> getNext(){
		return next;
	}
	
	public T getWart(){
		return wart;
	}
}

public class Stos<T> {
	public Elem<T> top;
	
	public Stos(){
		top=null;
	}
	
	public void push(T x){
		Elem<T> temp = new Elem<>(x, top);
		top = temp;
	}
	public void pop(){
		if(top!=null){
			top = top.getNext();
		} else {
			System.out.println("Pusto!");
		}
	}
	
	
	
	
	
	
}
