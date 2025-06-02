import java.awt.*;

public class Dog extends  Animal implements AnimalIE
{
    @Override
    public void makeSound() {
        System.out.println("Hav");
    }

    @Override
    public void sound() {
        System.out.println("HAVHAV");
    }
}
