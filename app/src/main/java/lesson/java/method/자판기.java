package lesson.java.method;

public class 자판기 {
       String cocacola;
       String cider;
       String water;



    int money(){
        return 3000;
    }
    String choice1(){
        return cocacola;
    }
    String choice2(){
        return cider;
    }
    String choice3(){
        return water;
    }
    String nostorage(){
        if(true){
          return "재고가 없습니다";
        }
        return "음료를 사기에 투입된 돈이 충분하지 않다.";
    }

    public static void main(String[] args) {
        자판기 a = new 자판기();
        a.choice1();
        a.choice2();
        a.choice3();

    }


}