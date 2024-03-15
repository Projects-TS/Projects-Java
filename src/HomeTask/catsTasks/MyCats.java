package HomeTask.catsTasks;



import java.util.ArrayList;
import java.util.List;


public class MyCats {
    public static void main(String[] args) {
        List<Cat> catsList = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.setName("Ryan");
        cat1.setColor("blue");
        cat1.setAge(1);

        Cat cat2 = new Cat();
        cat2.setName("James");
        cat2.setColor("red");
        cat2.setAge(8);

        Cat cat3 = new Cat();
        cat3.setName("diana");
        cat3.setColor("green");
        cat3.setAge(14);

        Cat cat4 = new Cat();
        cat4.setName("Riki");
        cat4.setColor("yellow");
        cat4.setAge(11);

        Cat cat5 = new Cat();
        cat5.setName("John");
        cat5.setColor("black");
        cat5.setAge(7);

        catsList.add(cat1);
        catsList.add(cat2);
        catsList.add(cat3);
        catsList.add(cat4);
        catsList.add(cat5);
        printCatInformation(catsList);
    }
    private static void printCatInformation(List<Cat> catsList) {
        for (Cat cat : catsList) {
            System.out.println("Cats List:");
            System.out.println("Name: " + cat.getName());
            System.out.println("Color: " + cat.getColor());
            System.out.println("Age: " + cat.getAge());
            System.out.println();
        }
    }
}
