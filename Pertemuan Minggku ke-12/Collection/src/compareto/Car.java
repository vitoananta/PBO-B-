package compareto;

public class Car implements Comparable<Car> {
    private String carName;
    private String brandName;
    private int topSpeed;

    public Car(String carName, String brandName, int topSpeed){
        this.carName = carName;
        this.brandName = brandName;
        this.topSpeed = topSpeed;
    }


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String toString(){
        return "Car Details: "+carName+" "+brandName+" "+topSpeed;
    }

    @Override
//    public int compareTo(Car cars) {
//        if(brandName.compareTo(cars.getBrandName()) < 0)
//            return -1;
//        if(brandName.compareTo(cars.getBrandName()) == 0)
//            return 0;
//        return 1;
//    }

    public int compareTo(Car cars) {
        if(Integer.valueOf(topSpeed).compareTo(cars.getTopSpeed()) < 0)
            return -1;
        if(Integer.valueOf(topSpeed).compareTo(cars.getTopSpeed()) == 0)
            return 0;
        return 1;
    }
}
