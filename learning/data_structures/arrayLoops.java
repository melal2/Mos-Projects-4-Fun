package learning.data_structures;

public class arrayLoops {
    public static void main(String[] args) {
        arrayLoops obj = new arrayLoops();
        obj.loopArray();
        obj.forEachArray();
    }

    public void loopArray() {
        String[] cars = { "Bimmer", "Yotas", "Mazdas" };
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    public void forEachArray() {
        String[] cars = { "Bimmer", "Yotas", "Mazdas" };
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
