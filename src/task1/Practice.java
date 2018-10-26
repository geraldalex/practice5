package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ArrayList <Worker> arrayList = new ArrayList<>();
        WorkerFixed workerFixed1  = new WorkerFixed(1,"Артем", 3300,100);
        WorkerFixed workerFixed2  = new WorkerFixed(2,"Максим", 3300,200);
        WorkerFixed workerFixed3  = new WorkerFixed(3,"Александр", 3300,100);
        WorkerFixed workerFixed4  = new WorkerFixed(4,"Виталий", 3300,400);
        WorkerTime workerTime1 = new WorkerTime(5,"Сергей",60);
        WorkerTime workerTime2 = new WorkerTime(6,"Aнтон",75);
        WorkerTime workerTime3 = new WorkerTime(7,"Денис",70);
        WorkerTime workerTime4 = new WorkerTime(8,"Варфоломий",65);
        arrayList.add(workerFixed1);
        arrayList.add(workerFixed2);
        arrayList.add(workerFixed3);
        arrayList.add(workerFixed4);
        arrayList.add(workerTime1);
        arrayList.add(workerTime2);
        arrayList.add(workerTime3);
        arrayList.add(workerTime4);


        Collections.sort(arrayList, new Comparator<Worker>(){
            public int compare(Worker s1, Worker s2){
                return Double.valueOf(s2.countPayment()).compareTo(s1.countPayment());
            }
        });

        System.out.println("\n");
        System.out.println("Первые 5 элементов отсортированой колекции");
        List<Worker> workers2 = arrayList.subList(0,5);
        for (int i = 0; i<workers2.size(); i++){
            System.out.println(workers2.get(i).toString());
        }
        System.out.println("\n");
        System.out.println("Последние 3 элемента отсортированой колекции");
        List<Worker> workers3 = arrayList.subList(arrayList.size()-3,arrayList.size());
        for (int i = 0; i<workers3.size(); i++){
            System.out.println(workers3.get(i).toString());
        }

        System.out.println("\n");
        System.out.println("Запись в файл и вывод на экран отсортированой колекции");
        File file   = new File("some.txt");
        boolean isEmpty = !file.exists() || file.length() == 0;
        if (!isEmpty) file.delete();
        for(Worker worker: arrayList){
            System.out.println(worker.toString());
            fileWriter(worker);
        }
        try{
            System.out.println("\n");
            System.out.println("Считывание с файла и вывод на экран отсортированой колекции");
            FileReader reader = new FileReader("some.txt");
            StringBuilder builder = new StringBuilder();
            int c;
            while((c = reader.read()) != -1){
                builder.append((char) c);
            }
            System.out.println(builder.toString());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void fileWriter(Worker worker) {
        try{
            FileWriter writer = new FileWriter("some.txt",true);
            writer.append(worker.toString()).append("\n");
            writer.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
