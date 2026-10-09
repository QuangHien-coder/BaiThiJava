public class MainThread {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        System.out.println("Bán kính là: "+circle1.getRadius());
        System.out.println("Diện tích hình tròn là: "+circle1.getArea());
        System.out.println("Chu vi hinh tron là: "+circle1.getPerimeter());
        StudentMark student1 = new StudentMark("Pham Quang Hien",50,60,4.3);
        StudentMark student2 = new StudentMark("Trần Phú Vinh", 50, 60, 3.9);
        student1.displayResult();
        student2.displayResult();
    }
}
