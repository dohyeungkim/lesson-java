package lesson.java.variable;
//참조형변수vs기본형변수 차이점 : 기본형 변수는 직접 값을 저장하지만, 참조형 변수는 힙 메모리에 저장된 객제의 주소를 가집니다. 기본형 변수,참조형변수 모두 스택에 저장되지만 참조형 변수의 실제 데이터는 힙 메모리에 저장됩니다. 스택은 지역변수나 매개변수를 저장하지만 힙 메모리는 동적으로 생성된 객체와 배열을 저장합니다.
public class Main {
    public static void main(String[] args) {
        int age;
        float weight = 75.0f;//잘 안쓴다
        double height = 175.0;
        short grade = 2;
        char gender = 'm';
        byte num = 2;
        boolean bool = true;
        String str = "hello";
        str.toCharArray();
        char[] name  = str.toCharArray();//변수의 값을 넣을때에는 =,타입,변수이름

        Integer number = null;
        Float number2 = 4.0f;
        Double number3 = 4.0;
        Short number4 = 3;
        Character gender2 = 'W';
        Byte num2 = 3;
        Boolean bool2 = false;

        System.out.println(number);

    }
}
