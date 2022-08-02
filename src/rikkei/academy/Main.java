package rikkei.academy;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Shape[] square = new Shape[3];
        square[0] = new Square();
        square[1] = new Rectangle();
        square[2] = new Circle();
        System.out.println("Truoc khi thay doi");

        square[0].resize((int) (Math.random() + 100));
        square[1].resize((int) (Math.random() + 100));
        square[2].resize((int) (Math.random() + 100));

        System.out.println(square[0]);
        System.out.println(square[1]);
        System.out.println(square[2]);
    }
}
