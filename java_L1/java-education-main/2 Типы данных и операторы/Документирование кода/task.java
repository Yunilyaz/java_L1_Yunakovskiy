/**
 * Класс, представляющий машину.
 */
public class Car {

    /**
     * марка машины.
     */
    private String brand;

    /**
     * Создает новый объект Car.
     * 
     * @param brand марка машины
     */
    public Car(String brand) {
        this.brand = brand;
    }

    /**
     * Получает марку машины.
     * 
     * @return марка машины
     */
    public String getBrand() {
        return brand;
    }
}
