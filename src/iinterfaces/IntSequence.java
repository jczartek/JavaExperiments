package iinterfaces;

public interface IntSequence {
    default boolean hasNext() {return true;}
    int next();

    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }
    
    static IntSequence of(int... numbers) {
        return new IntSequence() {
            int i = 0;
            int l = numbers.length;

            @Override
            public boolean hasNext() {
                return i < l;
            }

            @Override
            public int next() {
                return numbers[i++];
            }
        };
    }

    static IntSequence squaresOf() {
        return new IntSequence() {
            int i;

            @Override
            public int next() {
                i++;
                return i*i;
            }
        };
    }

    static IntSequence constant(int n) {
        return () -> n;
    }
}
