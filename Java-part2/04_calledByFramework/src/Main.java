class Test {
    // protected int data;
    private int data; // 캡슐화 강화: private으로 변경

    public void setData(int param) {
        System.out.println("Test.setData()");

        if (validateData(param)) { // 데이터 검증 분리
            this.data = param;
        } else {
            this.data = 0;
        }

        System.out.println("data = " + this.data);
    }

    // 데이터 검증 메서드: 기본 동작 제공
    protected boolean validateData(int param) {
        System.out.println("Test.validateData()");
        return true; // 기본적으로 모든 값을 허용
    }

    public int getData() {
        return data; // 안전하게 캡슐화된 데이터 반환
    }
}

class TestEx extends Test {
    @Override
    protected boolean validateData(int param) { // 부모 메서드 오버라이드
        System.out.println("TestEx.validateData()");
        return param >= 0 && param <= 100; // 유효한 범위 검증
    }
}

public class Main {
    public static void main(String[] args) {
        TestEx t = new TestEx();
        t.setData(5); // 유효한 값
        System.out.println(t.getData()); // 5 출력

        t.setData(-10); // 유효하지 않은 값
        System.out.println(t.getData()); // 0 출력
    }
}
