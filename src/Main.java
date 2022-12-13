import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 1, 13);
        System.out.println("Hello world!");
        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine();
        Medicine medicine3 = new Medicine();

        ArrayList<Medicine> medicines = new ArrayList<>();
        medicines.add(medicine1);
        medicines.add(medicine2);
        medicines.add(medicine3);
            System.out.println("============================");
            System.out.println("|       MENU SELECTION     |");
            System.out.println("============================");
            System.out.println("| Options:                 |");
            System.out.println("|        1. Listed items   |");
            System.out.println("|  2. Prices under 10 leva |");
            System.out.println("|   3. Prices over 15 leva |");
            System.out.println("|   4. Expired medicines   |");
            System.out.println("|   4. Expired medicines   |");
            System.out.println("|   6. Add medicines       |");
            System.out.println("============================");
            System.out.println("Select option");
            Scanner in = new Scanner(System.in);
            switch (in.nextInt()) {
                case 1:
                    System.out.println("Listed medicines: " + medicine1 + ", " + medicine2 + " and " + medicine3);
                    break;
                case 2:
                    printAllMedicinesAboveSomething(medicines);
                    break;
                case 4:
                    printAllMedicinesOnQuantities(medicines);
                    break;
                case 5:
                    printMedicineWithExpirationDate(medicines);
                    break;
                case 6:
                    addingElementsToArrayList(medicines);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid selection");
                    break; // This break is not really necessary
            }
        }
    public static ArrayList printAllMedicinesAboveSomething(ArrayList<Medicine> medicines){
        ArrayList<Medicine> medicineName = new ArrayList<>();
        for(Medicine m : medicines){
            if(m.getPrice()<10)
            {
                medicineName.add(m);
            }
        }
        return medicineName;
    }
    public static ArrayList printAllMedicinesOnQuantities(ArrayList<Medicine> medicinesQuantity ){
        ArrayList<Medicine> medicineQuantity = new ArrayList<>();
        for(Medicine m : medicinesQuantity){
            if(m.getQuantity()<10){
                medicineQuantity.add(m);
            }
        }
        return medicineQuantity;
    }
    public static void printMedicineWithExpirationDate(ArrayList<Medicine> medicines){

        ArrayList<Medicine> newMedicines = new ArrayList<>();

        LocalDate date = LocalDate.of(2033, 12, 12);

        for(Medicine m : medicines){
            if(m.expirationDate.equals(date)){
                newMedicines.add(m);
            }
        }

        for (Medicine p : newMedicines) {
            System.out.println(p.toString());
        }
    }
    public static void addingElementsToArrayList(ArrayList<Medicine> addMedicine) {
        Scanner scanner = new Scanner(System.in);
        Medicine medicine = new Medicine();

        String name;
        double price;
        int quantity = 0;

        System.out.println();
        System.out.print("Name: ");
        name = scanner.nextLine();
        medicine.medicineName = name;
        System.out.println();
        System.out.print("Price: ");
        price = scanner.nextDouble();
        medicine.price = (int) price;
        System.out.println();
        System.out.print("Quantity: ");
        //medicine = scanner.nextInt();
        medicine.quantity = quantity;
        medicine.expirationDate = LocalDate.now();
        addMedicine.add(medicine);
    }
}