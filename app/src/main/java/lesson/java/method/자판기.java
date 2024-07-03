package lesson.java.method;
     public class 자판기 {
         String[] beverageNames = {"스프라이트", "콜라", "밀키스"};
         int[] beverageCost = {1100, 900, 1400};
         int[] beverageStock = {4, 3, 2};


         String printbeverages1() {
              return beverageNames[0];
         }
         String printbeverages2(){
              return beverageNames[1];
         }
         String printbeverages3(){
             return beverageNames[2];
         }
         int Cost1(){
             return beverageCost[0];
         }
         int Cost2(){
             return beverageCost[1];
         }
         int Cost3(){
             return beverageCost[2];
         }
         void stock1() {
             for (int i=0;i<beverageStock[0];i++) {
                 beverageStock[0]--;
             }
         }
         void stock2() {
             for(int i=0; i<beverageStock[1];i++){
                 beverageStock[1]--;
             }
         }
         void stock3() {
             for(int i=0;i<beverageStock[2];i++){
                 beverageStock[2]--;
             }

         }

         public static void main(String[] args){


         }


}
