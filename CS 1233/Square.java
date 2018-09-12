public class Square extends Shape {
    public  void print() {
        System.out.println("Square object");
    }

    public static void main(String[] args) {
        Square SQ = new Square();
        SQ.print();
        Shape SH = (Shape)SQ;
        SH.print();
    }
}
