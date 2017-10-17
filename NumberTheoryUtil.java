/*
 * Copyright (C) 2017 Waleed Mortaja, Mahmoud El-Shekh Kalil
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.util.ArrayList;

/**
 * Implementation for some methods used in Elementary Number Theory.
 *
 * @author Waleed Mortaja, contact Email :
 * <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 * @author Mahmoud El-Shekh Kalil
 */
public final class NumberTheoryUtil {

    /**
     * Don't let anyone instantiate this class.
     */
    private NumberTheoryUtil() {
    }
    
    
    /**
     * Enter whether a number is prime or not. Check if the entered number
     * divisble by any number less than or equal to the square root of the
     * entered number
     *
     * @param number The number to be checked
     * @return true if number is prime
     */
    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        } else {
            long sqrt = (long) Math.sqrt(number);
            for (int i = 2; i <= sqrt; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Calculate the gcd (Greates Common Divisor) of two numbers. Find gcd using
     * Euclidean Algorithm
     *
     * @param a The first number.
     * @param b The second number.
     * @return the gcd of the two numbers
     * @throws IllegalArgumentException when both a & b equals zero
     */
    public static long gcd(long a, long b) throws IllegalArgumentException {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Undefined value for gcd(0,0)");
        } else if (a == 0) {
            return Math.abs(b);
        } else if (b == 0) {
            return Math.abs(a);
        } else if (a == b) {
            return Math.abs(a); //any number of them. They are equal any way
        }
        
        a = Math.abs(a);
        //نتأكد إذا كان  يساوي أقل قيمة
        b = Math.abs(b);

        long min;
        long max;
        if (a > b) {
            max = a;
            min = b;
        } else if (a < b) {
            max = b;
            min = a;
        } else {
            return a;
        }

        if (max % min == 0) {
            return min;
        }
        return gcd(min, max % min);
    }

    /**
     * Calculate the LCM (Least Common Multiple) of two numbers
     *
     * @param a The first number.
     * @param b The second number.
     * @return the LCM of the two numbers
     */
    public static long lcm(long a, long b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    /**
     * Get unique represntation for two numbers as
     *
     * multiple = quotient * factor + reminder where remainder is the positive
     * reminder less than |b|.
     *
     * @param a the first number
     * @param b the second number
     * @return array of four long numbers in the order [m,q,a,r]
     * @throws IllegalArgumentException when a or b is zero
     */
    public static long[] getUniqueRepresntation(long a, long b) throws IllegalArgumentException {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("There is no unique represtaion for zero(s)");
        }
        if (a == b) {
            return new long[]{a, 1, b, 0};
        }
        double ratio = (double) a / b;
        long quotient;

        if (b > 0) {
            quotient = (long) Math.floor(ratio);
        } else {
            quotient = (long) Math.ceil(ratio);
        }

        long reminder = Math.round((ratio - quotient) * b);
        return new long[]{a, quotient, b, reminder};
    }

    public static long[] getRemainder(long[] line) {
        //swap the elements of the line as remainder  = multiple - quotient*factor
        // m = q * f + r
        // r = m - q * f
        long[] result = new long[4];
        result[0] = line[3];
        result[1] = line[0];
        result[2] = -line[1];
        result[3] = line[2];
        return result;
    }

    public static long[] gcdAsLinearCombination(long a, long b) throws IllegalArgumentException {
        long[] arrayListline;
        ArrayList<long[]> lines = new ArrayList<>();
        do {
            arrayListline = getUniqueRepresntation(a, b);
            if (arrayListline[arrayListline.length - 1] == 0 && !lines.isEmpty()) {
                break;
            }
            lines.add(arrayListline);
            a = arrayListline[2]; //put one of the varibales (a,b) to the minmum of a,b
            b = arrayListline[3]; // and the other variable to the remainder
            if (a == 0 || b == 0) {
                break;
            }
        } while (true);
        if (lines.size() == 1) {
            arrayListline = lines.get(0);
            if (arrayListline[3] == 0) {
                return new long[]{arrayListline[2], 1, arrayListline[2], 0L, arrayListline[0]};
            } else {
                long[] result = getRemainder(arrayListline);
                return new long[]{result[0], 1, result[1], result[2], result[3]};

            }
        }
        long bracketMultiple; // the quetionet of the factor
        long outOfBracketMultiple = 1;

        long[] currentLine = getRemainder(lines.get(lines.size() - 1)); // the line being proccessed resulting the required final line (result)
        for (int i = lines.size() - 1; i > 0; i--) { //loop from the before the last equation to the second equation (first equation is calculated in the second equation processing)
            long[] theComingLine = getRemainder(lines.get(i - 1));

            bracketMultiple = currentLine[2];
            currentLine[2] = outOfBracketMultiple + (bracketMultiple * theComingLine[2]);
            outOfBracketMultiple = bracketMultiple;
            currentLine[1] = theComingLine[1];
            currentLine[3] = theComingLine[3];
        }
        long[] result = new long[5];
        result[0] = currentLine[0];
        result[1] = outOfBracketMultiple;
        for (int i = 2; i < result.length; i++) {
            result[i] = currentLine[i - 1];
        }
        return result;

    }

}
