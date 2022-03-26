package Other;
public class Lab9_15
{
   public static void main(String[] args)
   {
      Dog amanda = new Dog(5);
      System.out.println(amanda.getWeight());
      Dog bob = new Dog();
      System.out.println(bob.getWeight());
   }
}
class Dog							//這邊的建構式很酷!!!  建構式也有多載
{
   double length, weight, age;
   public Dog()
   {
      this(1, 0.5, 1);
   }
   public Dog(double age)
   {
      this(age, 0.5*age, age);		//this 也可以用來執行參數數相同的建構式。
   }
   public Dog(double len, double wei, double a)
   {
      length = len;
      weight = wei;
      age = a;
   }
   public double getWeight()
   {
      return weight;
   }
}