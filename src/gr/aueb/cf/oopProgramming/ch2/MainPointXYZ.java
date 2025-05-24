package gr.aueb.cf.oopProgramming.ch2;

public class MainPointXYZ {

    public static void main(String[] args) {
        PointXYZ point  = new PointXYZ(3,4,12);

        System.out.println(point.getXYDistance());
        System.out.println(point.getXYZDistance());
        System.out.println(point.getYZDistance());
        System.out.println(point.getXZDistance());
    }
}
