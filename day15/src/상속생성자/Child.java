package 상속생성자;

public final class Child extends Parent { //final -> 종단클래스, 상속을 더 이상 못하는 클래스
@Override
	void tv() {
		System.out.println("무야호~!");
	}

	void together() {
		tv(); // 내가 내방에서 tv를 봄
		super.tv(); // 부모님이 tv를 봄
		// 슈퍼 -> 부모클래스
	}
}
