public class Car
{
    public  String carBrand="Audi";
    public  String carModel="i5";
    public  String carProductYear="2017";
    public  int carKm=10000;
    public  int carPplLimit=4;
    public  int carPower=200;

    public static void main(String[] args) {

        Car car=new Car();
        System.out.println(car.carBrand);
        System.out.println(car.carModel);
        System.out.println(car.carProductYear);
        System.out.println(car.carKm);
        System.out.println(car.carPplLimit);
        System.out.println(car.carPower);
    }
}
