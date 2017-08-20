package iinterfaces;

public class TestInterface {
    public static void main(String... args) {
        IntSequence seq = IntSequence.of(5, 5, 5, 5, 12, 23, 34, 45);
        printEach(seq);

        IntSequence seq1 = IntSequence.digitsOf(1125);
        printEach(seq1);

        IntSequence seq2 = IntSequence.squaresOf();
        printNEach(seq2, 10);

        IntSequence seq3 = IntSequence.constant(33);
        printNEach(seq3, 10);
    }

    static void printEach(IntSequence seq) {
        while (seq.hasNext()) {
            System.out.print(seq.next() + " ");
        }
        System.out.println();
    }

    static void printNEach(IntSequence seq, int n) {
        int i = 1;
        while (seq.hasNext() && i < n) {
            i++;
            System.out.print(seq.next() + " ");
        }
        System.out.println();
    }
}
