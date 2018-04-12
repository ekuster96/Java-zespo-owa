package myPackage;

public class MyPair<S, T> implements Pair<S, T> {
	private S first;
	private T second;
	
	public MyPair(S first, T second){
		this.first=first;
		this.second=second;
	}
	public S getFirst(){
		return first;
	}
	public T getSecond(){
		return second;
	}
}
