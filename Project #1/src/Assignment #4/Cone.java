class Cone extends Shape {
    //Surface area:  πr² + πr√(r² + h²)
    //volume: (1/3)πr²h
    double radius;
    double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public static void main(String[] args) {
        Cone v = new Cone(10, 22);
        v.surface_area(v.radius);
        v.volume(v.radius);
    }

    @Override
    public void volume(double radius) {
        //volume: (1/3)πr²h
        double volume_cone = ((1.0/3.0) * 3.14 * Math.pow(radius, 2) * height);
        //to string code:
        System.out.println("Volume of Cone: " + volume_cone);
    }

    @Override
    public void surface_area(double radius) {
        //πr² + πr√(r² + h²)
        double surface_area_cone = ( 3.14 * Math.pow(radius, 2) ) + (3.14 * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
        System.out.println("Surface area of Cone: " + surface_area_cone);
    }

}

