package learning.data_structures;

public class array {
    public static void main(String[] args) {
        array obj = new array();
        obj.ArrayDisplay();
        obj.ChangeArray();
        obj.ArraySize();
    }

    // How to create an array and replace an item in that array
    public void ChangeArray() {
        String[] cars2 = { "Bimmer", "Yotas", "Mazdas" };
        cars2[0] = "Utica";
        System.out.println(cars2[0]);
    }

    // How to create a simple array and prinout the entry you want
    public void ArrayDisplay() {
        String[] cars = { "Bimmer", "Yotas", "Mazdas" };
        System.out.println(cars[1]);
    }

    // How to display size of array
    public void ArraySize() {
        String[] cars = { "Bimmer", "Yotas", "Mazdas" };
        System.out.println(cars.length);
    }
}
