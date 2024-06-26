package lesson.java.variable;

//string 비교할때 equals를 쓰는 이유를 설명하세요: equals 메소드는 문자열 객체의 참조가 아닌 실제 값을 비교하기 때문에 문자열의 값을 비교하려면 항상 'equals'메소드를 사용해야 합니다. "=="로 비교할 때는 값이 아닌 참조를 비교하게 됩니다. 그래서 k2와 k5를 "=="로 비교하면 false가 출력됩니다.

public class Main3 {
    public static void main(String[] args) {
        String k = "kim";
        String k2 = "kim";
        String k3 = new String("kim");
        String k4 = "k";
        String k5 = k4 + "im";
        String k6 = "k" + "im";

        System.out.println(k2.equals(k6));
        System.out.println(k2==k5);
        System.out.println(k3.equals(k2));

    }
}
