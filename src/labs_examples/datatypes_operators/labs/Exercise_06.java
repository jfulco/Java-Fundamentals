package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        float radius = 3.14f;
        int height = 5;
        System.out.println("The radius of a cylinder = " + radius);
        System.out.println("The height of a cylinder = " + height);

        float radiusSquared = radius * radius;
        double volumeCylinder = 3.14 * radiusSquared * height;
        System.out.println("The volume of the cylinder is " + volumeCylinder);

        float areaBase = 2f * 3.14f * radiusSquared;
        float areaDepth = 2f * 3.14f * radius * height;
        double surfaceAreaCylinder = areaDepth + areaBase;
        System.out.println("The surface area of the cylinder is " + surfaceAreaCylinder);
    }
}