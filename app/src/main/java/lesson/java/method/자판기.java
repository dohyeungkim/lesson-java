package lesson.java.method;
     public class 자판기 {


         public static void main(String[] args) {
             String[] beverageNames = {"스프라이트", "콜라", "밀키스"};
             int[] beverageCost = {1100, 900, 1400};
             int[] beverageStock = {4, 3, 2};
             int coin = 800;
             자판기 a = new 자판기();
             a.takeamoney(coin);
             a.printbeverages(beverageNames);


         }
         void printbeverages(String[] b_N) {
             for(int i=0;i<b_N.length;i++){
                 System.out.println(b_N[i]);
             }

         }
         int takeamoney(int money){
             return money;
         }

         String choicebeverages(int beverage) {

         }


         void stockconfirm(int[]b_Stock,int[]b_Cost,int money){
             int a[] = new int[3];
             for(int i =0;i<b_Stock.length;i++){
                 a[i] = b_Stock[i];
             }
             if(a[0] == 0){
                 System.out.println("음료가 없습니다.");

             }
             else if(a[1] == 0){
                 System.out.println("음료가 없습니다");

             }
             else if(a[2] == 0){
                 System.out.println("음료가 없습니다.");
             }
             else{
                 int b[] = new int[3];
                 for(int i=0;i<b_Cost.length;i++){
                     b[i] = b_Cost[i];
                 }

                 if(b[0]>money) {
                     System.out.println("음료를 사기에 투입된 돈이 충분하지 않다.");
                     System.out.println("금액이 부족합니다.");
                     takeamoney(money);
                 }
                 else if(b[1]>money){
                     System.out.println("음료를 사기에 투입된 돈이 충분하지 않다.");
                     System.out.println("금액이 부족합니다.");
                     takeamoney(money);
                 }
                 else if(b[2]>money){
                     System.out.println("음료를 사기에 투입된 돈이 충분하지 않다.");
                     System.out.println("금액이 부족합니다.");
                     takeamoney(money);
                 }
                 else {
                     int[] m_money = new int [3];
                     int[] m_stock = new int [3];
                     for (int i = 0; i < b_Cost.length; i++) {
                          m_money[i] = money - b_Cost[i];

                     }
                     for( int j = 0; j < b_Stock.length; j++) {
                          m_stock[j] = money - b_Stock[j];
                     }

                 }


             }

         }

     }



