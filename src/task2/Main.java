package task2;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String,Integer> map = new MyDictionary<>();
        map.add("Артем", 10000);
        map.add("Максим", 104450);
        map.add("Александр", 400040);
        map.add("Виталий", 100);
        map.add("Сергей", 105);
        map.add("Aнтон", 500);
        System.out.print("количество элементов в колекции :  ");
        System.out.println(map.getSize());
        System.out.print("Значение по ключу :  ");
        System.out.println(map.myGet("Виталий"));

        map.myRemove("Александр");
        System.out.print("количество элементов в колекции, поcле удаления oдного элемента :  ");
        System.out.println(map.getSize());
        System.out.print("Преребор значений колекции :  "+"\n");
        map.pereborValue();
        System.out.print("Преребор ключей колекции :  "+"\n");
        map.pereborKey();

        System.out.println("\n");
        MyDictionary <Integer,String> map2 = new MyDictionary<>();
        map2.add(1,"Варфоломий");
        map2.pereborKey();
        map2.pereborValue();
    }
}
