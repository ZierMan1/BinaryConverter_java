//подключение модулей
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ввод числа, которое надо конвертировать
        System.out.print("Введите число: ");
        String input = scanner.nextLine();
        //выбор типа данных, в которые будем конвертировать
        System.out.println("Выберите тип данных: " + "1 - byte " + "2 - short, " + "3 - int " + "4 - long " + "5 - float " + "6 - double " + "Тип данных: ");
        int Type_data = scanner.nextInt();
        //оператор выбора(как if else, только круче)
        switch (Type_data) {
            case 1:
                byte byteResult = Byte.parseByte(input);
                System.out.println("byte: " + inBinary(byteResult));
                break;
            case 2:
                short shortResult = Short.parseShort(input);
                System.out.println("short: " + inBinary(shortResult));
                break;
            case 3:
                int intResult = Integer.parseInt(input);
                System.out.println("int: " + inBinary(intResult));
                break;
            case 4:
                long longResult = Long.parseLong(input);
                System.out.println("long: " + inBinary(longResult));
                break;
            case 5:
                float floatResult = Float.parseFloat(input);
                System.out.println("float: " + inBinary(floatResult));
                break;
            case 6:
                double doubleResult = Double.parseDouble(input);
                System.out.println("double: " + inBinary(doubleResult));
                break;
            default:
                System.out.println("Некорректный тип данных.");
                break;
        }
    }
//функции конвертации
    private static String inBinary(byte number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String inBinary(short number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 15; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String inBinary(int number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String inBinary(long number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 63; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String inBinary(float number) {
        return inBinary(Float.floatToIntBits(number));
    }

    private static String inBinary(double number) {
        return inBinary(Double.doubleToLongBits(number));
    }
}