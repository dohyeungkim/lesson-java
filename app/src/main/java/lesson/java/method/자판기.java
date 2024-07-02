package lesson.java.method;

public class 자판기 {
    int cocacola;
    int cider;
    int water;


    int money() {

        if (cocacola == 1000) {
            return cocacola;
        } else if (cider == 1200) {
            return cider;
        } else if (water == 800) {
            return water;
        }
    }
    String storage(){
        if(false){
            return "음료를 사기에 투입된 돈이 충분하지 않다.";
        }else{
            return "음료가 없습니다.";
        }
    }
    String storage2{}{

    }


}