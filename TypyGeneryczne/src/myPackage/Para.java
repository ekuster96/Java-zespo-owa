package myPackage;

public class Para<T,V> {
	private T obj1;
	private V obj2;
	public void set(T obj1, V obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public T getObj1(){
		return obj1;
	}
	public V getObj2(){
		return obj2;
	}
}
