package com.example.new_sample;

/**
 * Custom Triangle Class
 * <p>
 * Serves extra calculation functions for triangle.
 * <p>
 * Author: Gorkem Bendin
 * Date: 14-10-2020
 */

public class CustomTriangle extends CustomMath {
    private static final float DIVIDER = 2.0f;

    /**
     * Returns the area of an triangle.
     *
     * @param edgeLengthOfSideA Length of side A.
     * @param edgeLengthOfSideB Length of side B.
     * @param edgeLengthOfSideC Length of side C.
     * @return The area of triangle whose lengths of sides given.
     */
    public static float getArea(int edgeLengthOfSideA, int edgeLengthOfSideB, int edgeLengthOfSideC) {
        float semiPerimeter = getSemiPerimeter(edgeLengthOfSideA, edgeLengthOfSideB, edgeLengthOfSideC);
        return customSqrt(semiPerimeter * (semiPerimeter - edgeLengthOfSideA) * (semiPerimeter - edgeLengthOfSideB) * (semiPerimeter - edgeLengthOfSideC));
    }

    /**
     * Returns the semi-perimeter of an triangle.
     *
     * @param edgeLengthOfSideA Length of side A.
     * @param edgeLengthOfSideB Length of side B.
     * @param edgeLengthOfSideC Length of side C.
     * @return The semi-perimeter of triangle whose lengths of sides given.
     */
    private static float getSemiPerimeter(int edgeLengthOfSideA, int edgeLengthOfSideB, int edgeLengthOfSideC) {
        return ((edgeLengthOfSideA + edgeLengthOfSideB + edgeLengthOfSideC) / DIVIDER);
    }
}
