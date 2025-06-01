public class Main
{
    public static void main(String[] args) {
        Cat cat= new Cat();
        Dog dog=new Dog();
        Animal animal=new Animal();

        cat.makeSound();
        dog.makeSound();
        animal.makeSound();

        Calculator calculator=new Calculator();

        //Method Overloading
        System.out.println(calculator.add(67,54));
        System.out.println(calculator.add(345,467,3));

        //Static metod kullanımı
       System.out.println(addTwoNums(45,2312));
    }

    public static int addTwoNums(int num1, int num2)
    {
        System.out.println(num1 + " ve " + num2 + " sayilarini toplami ");
        return num1+num2;
    }
}
