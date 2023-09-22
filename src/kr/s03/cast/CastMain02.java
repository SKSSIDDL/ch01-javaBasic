package kr.s03.cast;

public class CastMain02 {
	public static void main(String[] args) {
		System.out.println("===명시적 형변환(강제 형변환)===");
		//더 작은 자료형으로 강등이 일어나는 형태, 정보의 손실이 발생할 수 있음
		
		byte b1 = 127;
		byte b2 = 127;
		byte result = (byte)(b1 + b2); //(byte) = 캐스트 연산자- int에서 byte로 끌어내림
									   //자동적으로 int로 형변환 된 것을 byte로 강제 형변환
		System.out.println("result = " + result); //데이터 손실
		
		short s1 = 32767;
		short s2 = 32767;
		short result2 = (short)(s1+ s2); //자동적으로 int로 형변횐 된 것을 short로 강제 형변환
		System.out.println("reuslt2 = "+ result2); //데이터 손실
		
		int in1 = 100;
		long lg1 = 200L;
		int result3 = in1 + (int)lg1;
		System.out.println("result3 = " + result3); //데이터 손실x
		
		int in2 = 26;
		float ft = 10.3f;
		int result4 = in2 + (int)ft; //ft : float -> int 강제 형변환
		System.out.println("result4 = " +result4); //데이터 손실(왜곡)
		
		
		
	}
}
