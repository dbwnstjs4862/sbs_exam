//code.oa.gg/java8/1072
//문제 : 사람의 id를 출력해주세요.[정답]
//조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		
		// 구현시작
		a사람.setId(20);
		System.out.println("제 번호는 " + a사람.getId() +" 입니다.");
		
		// 구현끝
		// 출력 : 제 번호는 20 입니다.
	}
}

class 사람 {
	private int id;
	
	// 세터 메서드
	void setId(int id) {		
		this.id = id;
	}
	
	// 게터 메서드
	int getId() {
		return id;
	}
	
	// 힌트 : 여기에 메소드 2개 추가해야 합니다.
}