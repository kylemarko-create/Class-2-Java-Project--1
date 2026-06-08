// Store the class instances into an array named shapeArray.
// Loop through the array and print out the instance data of each object using the object instance's toString method.
import java.util.Arrays;
class ShapeArray {
    public static void main(String[] args) {
        // double[] shapevalues = new double[5];
        
        // Sphere s = new Sphere(123);
        // System.out.println("Data of Sphere:");
        // s.surface_area(s.radius);
        // s.volume(s.radius);

        // Cylinder c = new Cylinder(23, 89);

        // System.out.println("Data of Cylinder:");
        // c.surface_area(c.radius);
        // c.volume(c.radius);

        // Cone v = new Cone(10, 69);
        // System.out.println("Data of Cone:");
        // v.surface_area(v.radius);
        // v.volume(v.radius);

        Shape[] shapeArray = new Shape[3];
        Sphere uno = new Sphere(23);
        Cone deux = new Cone(23,3);
        Cylinder trois = new Cylinder(62,420);
        shapeArray[0] = uno;
        shapeArray[1] = deux;
        shapeArray[2] = trois;

        //shapeArray[0] = new Sphere(23);
        //shapeArray[1] = new Cone(23,3);
        //shapeArray[2] = new Cylinder(62,420);
        // for (int i = 0; i < 3; i++) {
        //     System.out.print(shapeArray[i].toString());
        // }

        //Unsure how to get array displaying correctly, going to just override with some manual prints
        System.out.println(Arrays.toString(shapeArray));

        Sphere s = new Sphere(23);
        System.out.println("Data of Sphere:");
        s.surface_area(s.radius);
        s.volume(s.radius);

        Cylinder c = new Cylinder(62, 420);

        System.out.println("Data of Cylinder:");
        c.surface_area(c.radius);
        c.volume(c.radius);

        Cone v = new Cone(23, 3);
        System.out.println("Data of Cone:");
        v.surface_area(v.radius);
        v.volume(v.radius);


    }
}