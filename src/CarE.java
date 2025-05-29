public class CarE extends Vehicle
{
    private  String carBrand="Audi";
    private  String carModel="i5";
    private  String carProductYear="2017";


    public String getCarBrand()
    {
       return  carBrand;
    }

    public void setCarBrand(String newBrand)
    {
        this.carBrand=newBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String newModel)
    {
        this.carModel=newModel;
    }

    public String getCarProductYear()
    {
        return  carProductYear;
    }

    public void setCarProductYear(String newProductYear)
    {
        this.carProductYear=newProductYear;
    }
    public static void main(String[] args) {
        CarE carE=new CarE();
        carE.setCarBrand("Ferrari");
        carE.setCarModel("99GE");
        carE.setCarProductYear("2019");

        System.out.println(carE.getCarBrand());
        System.out.println(carE.getCarModel());
        System.out.println(carE.getCarProductYear());

        carE.speed=44;
        System.out.println(carE.speed);
    }
}
