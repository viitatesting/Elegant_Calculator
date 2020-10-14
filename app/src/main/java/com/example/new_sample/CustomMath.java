package com.example.new_sample;

/**
 * Custom Math Class
 * <p>
 * Serves extra calculation functions for math.
 * <p>
 * Author: Gorkem Bendin
 * Date: 14-10-2020
 */

public class CustomMath {
    /**
     * Returns the square root of the given number. (Found on the internet updated according to needs)
     *
     * @param number Number whose square root is to be calculated.
     * @return Square root of the given number.
     */
    public static float customSqrt(float number) {
        float start = 0, end = number;
        float mid;
        float result = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == number) {
                result = mid;
                break;
            }

            if (mid * mid < number) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }

        float increment = 0.1f;
        for (int i = 0; i < 5; i++) {
            while (result * result <= number) {
                result += increment;
            }
            result = result - increment;
            increment = increment / 10;
        }
        return result;
    }
}
