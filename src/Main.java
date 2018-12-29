import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci sequence (from 10th element): ");
        int[] coefs = new int[]{1, 1};
        int[] initial = new int[]{1, 0};
        Stream<Integer> fib = SequenceSupplier.RecurrenceStream(coefs, initial, 10);
        fib.limit(10).map(x -> x.toString() + " ").forEach(System.out::print);

        System.out.println("\n\nPrimes sequence:");

        Stream<Integer> primes = SequenceSupplier.PrimeStream();
        primes.limit(10).map(x -> x.toString() + " ").forEach(System.out::print);

        System.out.println("\n\nThue-Morse sequence:");

        Stream<Integer> tm = SequenceSupplier.ThueMorse();
        tm.limit(100).forEach(System.out::print);
        System.out.println("\n\nThue-Morse sequence obtained from closed form:");
        Stream<Integer> tmc = SequenceSupplier.ThueMorseClosed();
        tmc.limit(100).forEach(System.out::print);

        System.out.println("\n\nCatalan numbers:");

        Stream<Integer> catalan = SequenceSupplier.Catalan();
        catalan.limit(10).map(x -> x.toString() + " ").forEach(System.out::print);

        System.out.println("\n\nLook and Say sequence:");

        Stream<String> las = SequenceSupplier.LookandSay();
        las.limit(10).forEach(System.out::println);

        System.out.println("\nKolakoski sequence:");

        Stream<Integer> kol = SequenceSupplier.Kolakoski();
        kol.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        System.out.println("\n\nKolakoski sequence generated by sequence {1,2,3}:");

        kol = SequenceSupplier.Kolakoski(new int[]{1, 2, 3});
        kol.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        System.out.println("\n\nKolakoski sequence generated by sequence {2, 1, 3, 1}:");

        kol = SequenceSupplier.Kolakoski(new int[]{2, 1, 3, 1});
        kol.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);
    }
}
