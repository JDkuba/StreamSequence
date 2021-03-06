import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        //OEIS A000045
        System.out.println("Fibonacci sequence: ");
        int[] coefs = new int[]{1, 1};
        int[] initial = new int[]{1, 0};
        Stream<Integer> fib = Sequences.LinearRecursiveStream(coefs, initial);
        fib.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        System.out.println("\n\nFibonacci sequence (from 20th element): ");
        coefs = new int[]{1, 1};
        initial = new int[]{1, 0};
        fib = Sequences.LinearRecursiveStream(coefs, initial, 20);
        fib.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //NO OEIS, just random linear recursive sequence
        //f(0)=1, f(1)=3, f(2)=2, f(n+3)=2*f(n+2)-f(n+1)-2*f(n)
        //first numbers by WolframAlpha: 2, -1, -10, -23, -34, -25, 30, 153
        System.out.println("\n\nExample of linear recursive sequence:");
        coefs = new int[]{2, -1, -2};
        initial = new int[]{2, 3, 1};
        Stream<Integer> rec = Sequences.LinearRecursiveStream(coefs, initial);
        rec.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //OEIS A000040
        System.out.println("\n\nPrimes sequence:");

        Stream<Integer> primes = Sequences.PrimeStream();
        primes.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //OEIS A010060
        System.out.println("\n\nThue-Morse sequence:");

        Stream<Integer> tm = Sequences.ThueMorse();
        tm.limit(100).forEach(System.out::print);
        System.out.println("\n\nThue-Morse sequence obtained from closed form:");
        Stream<Integer> tmc = Sequences.ThueMorseClosed();
        tmc.limit(100).forEach(System.out::print);

        //OEIS A000108
        System.out.println("\n\nCatalan numbers:");

        Stream<Integer> catalan = Sequences.Catalan();
        catalan.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //OEIS A005150, stream of Strings because it grows very fast
        System.out.println("\n\nLook and Say sequence:");

        Stream<String> las = Sequences.LookandSay();
        las.limit(10).forEach(System.out::println);

        //OEIS A000002
        System.out.println("\nKolakoski sequence:");

        Stream<Integer> kol = Sequences.Kolakoski();
        kol.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //OEIS A079729
        System.out.println("\n\nKolakoski sequence generated by sequence {1,2,3}:");

        kol = Sequences.Kolakoski(new int[]{1, 2, 3});
        kol.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //NO OEIS but it is like A000002 and A079729, but generated by different sequence
        System.out.println("\n\nKolakoski sequence generated by sequence {2, 1, 3, 1}:");

        kol = Sequences.Kolakoski(new int[]{2, 1, 3, 1});
        kol.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //OEIS A4001
        System.out.println("\n\n$10000 sequence:");
        Stream<Integer> tts = Sequences.TenThousandSequence();
        tts.limit(20).map(x -> x.toString() + " ").forEach(System.out::print);

        //OEIS A000796
        System.out.println("\n\nPi digits sequence:");
        Stream<Integer> pi = Sequences.PiSequence();
        pi.limit(150).forEach(System.out::print);
        System.out.println();
    }
}
