package DZOOP4;

public class Main {

        public static void main(String[] args) {

                Box<Orange> orangeBox = new Box<>();
                Box<Orange> orangeBox2 = new Box<>();
                Box<Apple> appleBox = new Box<>();
                Box<Apple> appleBox2 = new Box<>();
                System.out.println("Создадим\n " +
                                ((char)27 + "[33;1m|orangeBox|" + (char)27 + "[0m")+ "\n " +
                                ((char)27 + "[33;1m|orangeBox2|" + (char)27 + "[0m")+ "\n " +
                                ((char)27 + "[31;1m|appleBox|" + (char)27 + "[0m")+ "\n " +
                                ((char)27 + "[31;1m|appleBox2|" + (char)27 + "[0m")+ "\n ");

                System.out.println("Положим в " +
                                ((char)27 + "[33;1m|orangeBox|" + (char)27 + "[0m") +
                        " - 10 апельсинов");
                orangeBox.addFruit(new Orange(),10);
                System.out.println("Положим в " +
                        ((char)27 + "[33;1m|orangeBox2|" + (char)27 + "[0m") +
                        " - 12 апельсинов");
                orangeBox2.addFruit(new Orange(),12);
                System.out.println("Положим в " +
                        ((char)27 + "[31;1m|appleBox|" + (char)27 + "[0m") +
                        " - 8 яблок");
                appleBox.addFruit(new Apple(),8);
                System.out.println("Положим в " +
                        ((char)27 + "[31;1m|appleBox2|" + (char)27 + "[0m") +
                        " - 4 яблока");
                appleBox2.addFruit(new Apple(),4);

                System.out.println("Вес" + ((char)27 + "[33;1m|orangeBox|" + (char)27 + "[0m")+ orangeBox.getWeight());
                System.out.println("Вес" + ((char)27 + "[33;1m|orangeBox2|" + (char)27 + "[0m")+ orangeBox2.getWeight());
                System.out.println("Вес" + ((char)27 + "[31;1m|appleBox|" + (char)27 + "[0m")+ appleBox.getWeight());
                System.out.println("Вес" + ((char)27 + "[31;1m|appleBox2|" + (char)27 + "[0m")+ appleBox2.getWeight());

                System.out.println("Сравниваем коробки по весу - независимо от их содержимого");

                System.out.println("orangeBox == appleBox? "+orangeBox.compare(appleBox));
                System.out.println("orangeBox2 == appleBox2? "+orangeBox2.compare(appleBox2));

                System.out.println("Пересыпаем фрукты из |orangeBox| в |orangeBox2|");
                orangeBox.pourTo(orangeBox2);
                System.out.println("Пересыпаем фрукты из |appleBox| в |appleBox2|");
                appleBox.pourTo(appleBox2);
                System.out.println("Вес коробок после пересыпания фруктов:");
                System.out.println("Вес" + ((char)27 + "[33;1m|orangeBox|" + (char)27 + "[0m")+ orangeBox.getWeight());
                System.out.println("Вес" + ((char)27 + "[33;1m|orangeBox2|" + (char)27 + "[0m")+ orangeBox2.getWeight());
                System.out.println("Вес" + ((char)27 + "[31;1m|appleBox|" + (char)27 + "[0m")+ appleBox.getWeight());
                System.out.println("Вес" + ((char)27 + "[31;1m|appleBox2|" + (char)27 + "[0m")+ appleBox2.getWeight());

        }
}