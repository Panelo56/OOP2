public class Main {
    public static void main(String[] args) {

        BmiService BMI = new BmiService();
        int weight = 98;
        double height = 1.87;
        int bmi = BMI.calculate(weight, height);
        System.out.println("Ваш индекс массы тела составляет " + bmi);
    }
}