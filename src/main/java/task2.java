public class task2 {
    public static class _int_ {
        int value;

    }
    public static void main(String[] args) {
        _int_ a = new _int_();
        _int_ b = new _int_();
        a.value = 5;
        b.value = 2;
        _swap_(a, b);
        System.out.println("a = " + a.value);
        System.out.println("b = " + b.value);
    }

    public static void _swap_(_int_ a, _int_ b) {
        a.value = a.value + b.value;
        b.value = a.value - b.value;
        a.value = a.value - b.value;
    }
}
