//Sphere Class
class Sphere extends Shape {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void volume(double radius) {
        double volume_sphere = (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);
        //to string code:
        System.out.println("Volume:" + volume_sphere);
    }

    @Override
    public void surface_area(double radius) {
        //4*pi*r^2
        double surface_area_sphere = 4 * Math.PI * Math.pow(radius, 2);
        //to string code:
        System.out.println("Surface area:" + surface_area_sphere);
    }


    public static void main(String[] args) {
        Sphere s = new Sphere(100);
        s.surface_area(s.radius);
        s.volume(s.radius);
        //System.out.println("Volume:" + s.surface_area);
        //System.out.println("Surface area:" + s.volume);
    }

}