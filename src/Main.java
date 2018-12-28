import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        int[] coefs = new int[]{1, 1};
        int[] initial = new int[]{1, 0};
        IntStream fib = SequenceSupplier.RecurrenceStream(coefs, initial, 10);

        fib.limit(10).forEach(System.out::println);

        System.out.println();

        IntStream primes = SequenceSupplier.PrimeStream();
        primes.limit(10).forEach(System.out::println);

        System.out.println();

        IntStream tm = SequenceSupplier.ThueMorse();
        tm.limit(100).forEach(System.out::print);

        IntStream catalan = SequenceSupplier.Catalan();
        catalan.limit(10).forEach(System.out::println);
    }
}
