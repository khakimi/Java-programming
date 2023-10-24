import java.util.Objects;

public class Pair {

    int num1;
    int num2;

    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return (num1 == pair.num1 && num2 == pair.num2)||(num1 == pair.num2 && num2 == pair.num1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1+num2);
    }
}