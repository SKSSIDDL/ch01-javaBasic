package kr.s06.array;

public class ArrayMain08 {

	public static void main(String[] args) {
		//클래스를 실행할 때 외부에서 데이터 전달(Scanner 사용하지 않음)
		
		if(args.length>0) {//전달되는 데이터가 있음
			for(int i=0;i<args.length; i++) {
				System.out.println(i+":"+args[i]);
			}
		}else {//전달되는 데이터가 없음
			System.out.println("입력한 내용이 없습니다.");
		}
	}

}

//반응없음과 에러는 다름
//배열은 만들어져있다.