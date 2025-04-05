class Mathoperation{
    int add (int a , int b){
        return a+b;
    }
    //method with 3 integer parameters
    int add (int a , int b , int c ){
        return a+b+c;
    }
    //method with 2 double  parameters
    double  add (double a , double b ){
        return a+b;
    }
}
public class method_overloading{
    public static void main(String[] args) {
        Mathoperation Math= new Mathoperation();
        //calling add method with 3 integer 
        System.out.println(Math.add(5, 2, 7));
        //calling add method with 2 double 
        System.out.println(Math.add(5, 2));
    }
}