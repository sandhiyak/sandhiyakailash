import java.util.*;
class area_calculation{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float length=sc.nextFloat();
        float breadth=sc.nextFloat();
        float height=sc.nextFloat();
        area_calculation ac=new area_calculation();
        float area_circle=(float)ac.circlearea(radius);
        float area_rectangle=(float)ac.rectanglearea(length,breadth);
        float area_triangle=(float)ac.trianglearea(breadth,height);
        System.out.println(area_circle);
        System.out.println(area_rectangle);
        System.out.println(area_triangle);
    }
    public double circlearea(float radius)
    {
        double pi=3.14,res=0;
        res=pi*radius*radius;
        return res;
    }
    public double rectanglearea(float length,float breadth)
    {
        double res=0;
        res=length*breadth;
        return res;
    }
    public double trianglearea(float breadth,float height)
    {
        double res=0;
        res=0.5*breadth*height;
        return res;
    }
}
