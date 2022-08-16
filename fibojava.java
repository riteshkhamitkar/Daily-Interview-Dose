public class Main{
	public static int fib(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fib(n-2) + fib(n-1);
	}
    public static void main(String args[]) {
	int max = 10;
	System.out.print("Fibonacci Series of "+max+" numbers: ");
	for(int i = 0; i < max; i++){
			System.out.print(fib(i) +" ");
		}
	}
}
