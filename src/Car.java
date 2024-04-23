public class Car {
    String brand;
    String model;
    int horsePower;

    Car(String brand, String model, int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    void carBrandPower(){
        System.out.println(brand + " " + model + " " + horsePower);
    }
}
