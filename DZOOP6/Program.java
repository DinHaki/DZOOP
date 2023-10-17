package DZOOP6;

public class Program {

    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        DataServer dataSaver = new DataServer();

        Order order = new Order(consoleReader.getDataForCreatingOrder());

        if(dataSaver.saveToJson(order)) {
            System.out.println("Информация по заказу успешно сохранена в файл.");
        }

    }

}