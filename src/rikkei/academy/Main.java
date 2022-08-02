package rikkei.academy;

public class Main {

    public static void main(String[] args) {
//        System.out.println();
//        Shape[] square = new Shape[3];
//        square[0] = new Square();
//        square[1] = new Rectangle();
//        square[2] = new Circle();
//        System.out.println("Truoc khi thay doi");
//
//        square[0].resize((int) (Math.random() + 100));
//        square[1].resize((int) (Math.random() + 100));
//        square[2].resize((int) (Math.random() + 100));
//
//        System.out.println(square[0]);
//        System.out.println(square[1]);
//        System.out.println(square[2]);
//
        Shape[] shapes = new Shape[100];
        for (int i = 0; i < shapes.length; i++) {
            int random = (int) (Math.random() + i);
            switch (random) {
                case 0:
                    shapes[i] = new Rectangle((int) (Math.random() + 100) + i, (int) ())
                case 1:
                    shapes[i] = new Square((int) (Math.random() * 100) + 1);
                    break;
                case 2:
                    shapes[i] = new Circle((int) (Math.random() * 100) + 1);
            }
        }

        for (Shape shape : shapes) {

            System.out.println(shape.getClass().getSimpleName() + ": " + shape.getArea());

            if (shape instanceof IColorable) {

                ((IColorable) shape).howToColor();
            }
            System.out.println();
        }
    }

}

