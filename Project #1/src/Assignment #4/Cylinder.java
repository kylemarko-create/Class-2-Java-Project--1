class Cylinder extends Shape {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder(1, 23);
        c.surface_area(c.radius);
        c.volume(c.radius);
    }

    @Override
    public void volume(double radius) {
        //π · r^2 · h
        double volume_cylinder = 3.14 * Math.pow(radius, 2) * height;
        //to string code:
        System.out.println("Volume: " + volume_cylinder);
    }

    @Override
    public void surface_area(double radius) {
        //2 · π · r · (r + h)
        double surface_area_cylinder = 2 * Math.PI * radius * (radius + height);
        //to string code:
        System.out.println("Surface area: " + surface_area_cylinder);
    }





}