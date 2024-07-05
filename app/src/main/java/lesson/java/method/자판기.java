package lesson.java.method;
     public class 자판기 {

         void printbeverages(String[] b_N) {
             for(int i=0;i<b_N.length;i++){
                 System.out.println(b_N[i]);
             }

         }
         int takeamoney(int a){
             int[] money = {1500,2000,800};
             for(int i=0;i<money.length;i++){
                 a = money[i];
             }
             return a;
         }

         String choicebeverage(String b){
             String[]beverage = {"스프라이트","콜라","밀키스"};
             for(int i=0;i<beverage.length;i++) {
                  b = beverage[i];
             }
             return b;
         }
         void stockconfirm(int b_Stock,int b_Cost){
             if(b_Stock == 0){
                 System.out.println("음료가 없습니다.");
             }else{
                 System.out.println("음료를 사기에 투입된 돈이 충분하지 않다.");
                 if(true){
                     System.out.println("금액이 부족합니다.");
                 }else{

                     b_Stock--;
                     System.out.println("음료를 구매했습니다.");
                 }
             }

         }




         public static void main(String[] args){
             String[] beverageNames = {"스프라이트", "콜라", "밀키스"};
             int[] beverageCost = {1100, 900, 1400};
             int[] beverageStock = {4, 3, 2};

             자판기 printbeverage = new 자판기();
             자판기 stock = new 자판기();
             printbeverage.printbeverages(beverageNames);




         }



}
