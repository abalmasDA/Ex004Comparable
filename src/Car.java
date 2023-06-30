public class Car implements Comparable<Car> {
    private int speed;
    private int price;
    private String model;
    private String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


    @Override
    public int compareTo(Car car) {
        int sortBySpeed = this.speed - car.getSpeed();
        int sortByPrice = this.price - car.getPrice();
        int sortByModel = this.model.compareTo(car.getModel());
        int sortByColor = this.color.compareTo(car.getColor());

        if (sortBySpeed != 0) {
            return sortBySpeed;
        } else if (sortByPrice != 0) {
            return sortByPrice;
        } else if (sortByModel != 0) {
            return sortByModel;
        } else {
            return sortByColor;
        }

    }

}
