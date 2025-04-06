public class FUNCRETURNVALUE {
    public static double area(double lenght, double breadth){
        double area= lenght * breadth;
        return area;
    }
    public static void main(String[] args) {
        double lenght = 5;
        double breadth = 10;
        double calculated_area= area(lenght, breadth);
        System.out.println("Area of rectangle is :-"+ calculated_area);
    }
}
