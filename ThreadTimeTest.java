/* 스레드와 일반 연산 간의 시간 차를 계산합니다. */

import java.util.Scanner;

class ThreadTimeTest implements Runnable {
	private long start_number;
	private long end_number;
	private long input_number;
	private long sum = 0;

	
	public ThreadTimeTest(long number1, long number2, long number3)
	{
		this.start_number = number1;
		this.end_number = number2;
		this.input_number = number3;
	}
	
	public void run()
	{
		long start = System.currentTimeMillis();
		long temp_sum = 0;
		long i;
		for(i = this.start_number; i<=this.end_number; i++)
		{
			temp_sum = (long) (temp_sum + Math.log(i));
		}
		System.out.println(Thread.currentThread().getName() 
				+" : log" + start_number + " ~ log" + end_number + "까지의 합 : " + temp_sum);
		this.sum = this.sum + temp_sum;
		if(i > input_number)
		{
			System.out.println("스레드 총합 : " + this.sum);
			long end = System.currentTimeMillis();
			System.out.println( "스레드 실행 시간 : " + ( end - start )/1000.0 );
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요. (최소 10억 이상)");
		long number = input.nextLong();
		if(number < 1000000000)
		{
			System.out.println("10억보다 작습니다.");
			System.exit(1); //10억보다 작으면 프로그램 종료
		}
		
		for(int i = 1; i <= 10; i++)
		{
			Runnable r1 = new ThreadTimeTest((number * (i - 1)) / 10 + 1, (number * i) / 10, number);
			Thread th1 = new Thread(r1);
			th1.start();
		}
		sum(number);
	}
	
	public static void sum(long number)
	{
		long sum = 0;
		long start = System.currentTimeMillis();
		for(int i = 1; i <= number; i++)
		{
			sum = (long)(sum + Math.log(i));
		}
		System.out.println("SUM : " + sum);
		long end = System.currentTimeMillis();
		System.out.println( "단순 실행 시간 : " + ( end - start )/1000.0 );
	}
}
