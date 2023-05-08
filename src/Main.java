

public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();
       double h = 1.87 * 1.87;
       int index = (int) service.calculate(h);
        System.out.println(index);
    }
    }