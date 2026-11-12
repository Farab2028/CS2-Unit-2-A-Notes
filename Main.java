public class Main {

   public static void main(String []args) {
   int yourAge = 15;
   int drivingAge = 17;
   // 1. Will these print true or false?
   System.out.println(17 == drivingAge);
   // false
   
   System.out.println(yourAge!= drivingAge);
   // true
   // 2. Set yourAge to a new value of 17
   yourAge = 17;

   // 3. Print whether yourAge equals drivingAge
   System.out.println(17 == drivingAge);
   System.out.println(yourAge!= drivingAge);

   boolean sameAge = (yourAge == drivingAge);
   System.out.println(sameAge);
   

   }
}
