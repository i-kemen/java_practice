package Main13;

public class Main13 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Y y1 = new A();
        Y y2 = new B();
        X obj = new A();

//        y1.a();
//        y2.a();

        Y[] arr = new Y[2];
        arr[0] = new A();
        arr[1] = new B();

        for (int i = 0; i < arr.length; i++) {
            arr[i].b();
        }
    }

}
