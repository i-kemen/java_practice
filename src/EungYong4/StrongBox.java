package EungYong4;


// 금고 클래스에 담는 인스턴스의 타입은 미정
// 금고에는 1개의 인스턴스를 담을 수 있음
// put() 메서드로 인스턴스를 저장하고 get() 메서드로 인스턴스를 얻을 있음
// get() 으로 얻을 때는 별도의 타입 캐스팅을 사용하지 않아도 됨

public class StrongBox<E> {
    public KeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(KeyType keyType) {
        this.keyType = keyType;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private E item;
    private KeyType keyType;
    private int count;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }


    public E getItem() {
        return item;
    }


    public void put(E item) {
        this.item = item;
    }

    public E get() {
        count++;
        if (count < keyType.getkeyLimit()) {
            return null;
        }
        count = 0;
        return item;
    }


    // 열쇠 종류
    public enum KeyType {
        PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(1000000);

        private int keyLimit;
        private String KeyType;

        KeyType(int keyLimit) {
            this.keyLimit = keyLimit;
        }

        public int getkeyLimit() {
            return keyLimit;
        }

        public void StrongBox(String KeyType) {
            this.KeyType = KeyType;
        }

    }

    public static void main(String[] args) {

    }



}
