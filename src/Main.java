import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Medicine medicine1 = new Medicine("Nurofen", 5, 10,"12/01/2023");
        Medicine medicine2 = new Medicine("Vitamin C", 2, 8,"12/05/2023");
        Medicine medicine3 = new Medicine("Panadol", 7, 102,"12/02/2023");

        ArrayList<Medicine> medicines = new ArrayList<>();
        medicines.add(medicine1);
        medicines.add(medicine2);
        medicines.add(medicine3);
        System.out.println("Listed medicines: " + medicine1 + ", " + medicine2 + " and " + medicine3);
        System.out.println("Prices above 5: " + printAllMedicinesAboveSomething(medicines));
        System.out.println("Medicines which is quantity is under 10: " + printAllMedicinesOnQuantities(medicines));
    }
    public static ArrayList printAllMedicinesAboveSomething(ArrayList<Medicine> medicines){
        ArrayList<Medicine> medicineName = new ArrayList<>();
        for(Medicine m : medicines){
            if(m.getPrice()>5)
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
}