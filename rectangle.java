

    


 class rectangle {
    int length, breadth;
    public void area(){
        int a = length * breadth;
        
        System.out.println("Area ="+a);
    }
    void perimeter(){
        int p; 
       p = 2 *(length + breadth);
    }
    class pc{
        public static void main(String[] args) {
            rectangle a,b;
            a=new rectangle();
            b=new rectangle();
            a.length=3;
            a.breadth=4;
            b.length=5;
            b.breadth=4;
            a.perimeter();
            b.perimeter();
            a.area();
            b.area();
        }
    }
    
 }

