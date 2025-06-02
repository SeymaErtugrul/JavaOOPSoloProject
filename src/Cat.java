public class Cat extends Animal implements AnimalIE
{
    @Override
    public void makeSound() {
        System.out.println("Miyav");
    }

    @Override
    public void sound() {
        System.out.println("MİYAV");
    }
}
