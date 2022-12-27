public class Main {
    public static void main(String[] args) {
        System.out.println("2. Найти площади фигур");
        CircleSquareN2 fig1 = new CircleSquareN2();
        fig1.r = 10;
        System.out.println("Площадь первой фигуры = " + fig1.figure1());
        System.out.println("Площадь второй фигуры = " + fig1.figure2());
        System.out.println("Площадь третьей фигуры = " + fig1.figure3());
    }
}
