public class Car
{
    public Car (String carBrand,String carModel,String carProductYear,int carKm, int carPplLimit, int carPower)
    {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carProductYear = carProductYear;
        this.carKm = carKm;
        this.carPplLimit = carPplLimit;
        this.carPower = carPower;
    }

    public  String carBrand="Audi";
    public  String carModel="i5";
    public  String carProductYear="2017";
    public  int carKm=10000;
    public  int carPplLimit=4;
    public  int carPower=200;


    public static void main(String[] args) {

        Car car=new Car("Volvo","J3","2014",10005,5,2500);
        System.out.println(car.carBrand);
        System.out.println(car.carModel);
        System.out.println(car.carProductYear);
        System.out.println(car.carKm);
        System.out.println(car.carPplLimit);
        System.out.println(car.carPower);

    }
}
