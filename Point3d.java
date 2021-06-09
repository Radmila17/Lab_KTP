package com.company;

public class Point3d extends Point2d {

    double zCoord;
    public Point3d ( double x, double y, double z) {
        zCoord = z;
    }
    public Point3d () {
        this(0, 0,0);
    }

    public double getZ () {
        return zCoord;
    }

    public void setZ ( double val) {
        zCoord = val;
    }

    public boolean equals(Point3d a){
        //Возвращает true, если точки находяться в одном месте, false в другом случае
        if (this.getX() == a.getX()) {
            if (this.getY() == a.getY()) {
                if (this.getZ() == a.getZ())
                    return true;
            }
        }
        return false;
    }
    public double distanceTo(Point3d point){
        //Возвращает расстояние между точками
        double d = Math.sqrt(Math.pow(this.getX() - point.getX(), 2)+ Math.pow(this.getY() - point.getY(), 2)+ Math.pow(this.getZ() - point.getZ(), 2));
        return Math.round(d * 100)/100.0;
    }
}
