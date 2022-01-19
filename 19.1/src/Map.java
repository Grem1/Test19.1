import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static Scanner sc = new Scanner(System.in);
   public static HashMap<String, Double> data = new HashMap<String,Double>();
   private static String foodName = sc.nextLine();

   public static void menu(){
       System.out.println(" ");
       System.out.println("1.Insert new intake of food and calories");
       System.out.println("2.Edit allready writen data");
       System.out.println("3.Show all data");
       System.out.println("4.Show max Callories per time of day");
       System.out.println("5.Delete data");
       System.out.println(" ");
       int choose = sc.nextInt();

       if (choose == 1){Map.insertData();}
       if (choose == 2){Map.editData();}
       if (choose == 3){Map.showData();}
       if (choose == 4){Map.maxCal();}
       if (choose == 5){Map.deleteData();}


   }

   public static void maxCal(){
       Kaloric.getMaxCal();
   }

    public static void showData(){
        for (String i : data.keySet()) {
            System.out.println("Name of Food : " + i + " Calories of the Food " + data.get(i));
        }
    }
    public static void insertData(){
        System.out.println("What would you like to insert ?");
        String foodName = sc.nextLine();
        System.out.println("you added " + foodName);
        double foodCal = sc.nextDouble();
        System.out.println("which has " +foodCal);
        data.put(foodName , foodCal );
        System.out.println("You added " + foodName + " with total of " + foodCal + "kcal");

    }
    public static void editData(){
        String foodName = sc.nextLine();
        double foodCal = sc.nextDouble();
        System.out.println("Write an Item you would like to replace ");
        data.replace(foodName,foodCal );
        System.out.println("You edited " + foodName);
    }
    public static void deleteData(){
        String foodName = sc.nextLine();
        System.out.println("What would you like to delete ?");
        data.remove(foodName);
        System.out.println("You deleted " + foodName + " from data");

    }
}


