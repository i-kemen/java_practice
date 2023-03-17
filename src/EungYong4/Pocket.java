package EungYong4;

import java.util.Objects;

public class Pocket<T> {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pocket<String> pocket = new Pocket<String>();
        pocket.setData("응애");
    }



    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void put(T data) {
        this.data = data;
    }

    public T get() {
        return this.data;
    }



    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pocket other = (Pocket) obj;
        return Objects.equals(data, other.data);
    }



}
