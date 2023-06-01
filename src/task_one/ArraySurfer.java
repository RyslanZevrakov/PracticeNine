package task_one;

import java.util.*;

public class ArraySurfer {

    public static ArrayList<String> array = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void choiceFunction() {
        ArraySurfer arraySurfer = new ArraySurfer();

        System.out.println("Выберите номер действия: \n1.Add\n2.Edit\n3.Remove");
        System.out.print("Выбор<< ");
        int choice = scan.nextInt();

        System.out.println();

        switch (choice){
            case 1:
                System.out.println(array);
                arraySurfer.addArray();
                break;
            case 2:
                System.out.println(array);
                arraySurfer.editArray();
                break;
            case 3:
                System.out.println(array);
                arraySurfer.removeArray();
                break;
            default:
                System.out.println("Нет такого действия!");
                break;
        }
    }

    public void addArray(){
        System.out.println("Вы выбрали действие Add!");

        System.out.print("Введите, какой элемент хотите добавить<< ");
        String inputElement = scan.next();
        array.add(inputElement);

        System.out.println(array);
    }

    public void editArray(){
        System.out.println("Вы выбрали действие Edit!");

        System.out.print("Выберите номер элемента<< ");
        int choiceNumberElement = scan.nextInt();

        if (choiceNumberElement < array.size()){
            System.out.println("\nА теперь на что хотите изменить " + choiceNumberElement + " элемент.");
            System.out.print("Введите данное изменение<< ");
            String inputEdit = scan.next();
            System.out.println();

            array.set(choiceNumberElement, inputEdit);
            System.out.println(array);
        } else {
            System.out.println( "Значение не удовлетворительно!" );
        }
    }

    public void removeArray(){
        System.out.println( "Вы выбрали действие Remove!" );

        System.out.print("Выберите номер элемента<< ");
        int choiceNumberElement = scan.nextInt();

        if (choiceNumberElement < array.size()){
            array.remove(choiceNumberElement);
            System.out.println(array);
        } else {
            System.out.println( "Значение не удовлетворительно!");
        }
    }

    public static void main(String[] args){
        array.add("Firstly");
        array.add("Second");
        array.add("Thirty");

        System.out.println(array + "");

        ArraySurfer arraySurfer = new ArraySurfer();
        arraySurfer.choiceFunction();
    }
}