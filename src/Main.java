import javax.swing.*;
import java.sql.SQLOutput;

public class Main extends Animals{
    public static void main(String[] args) {

        Animals[] animals = new Animals[4];
        animals[0] = new Cat("Barsik", "red",100,10,3,"cat");
        animals[1] = new Cat("Murzik", "black",150,10,4,"cat");
        animals[2] = new Dog("Tuzik", "White", 350,9,4,"dog");
        animals[3] = new Dog("Bobik", "gray", 450,6,7,"dog");


    //Цыкл подщёта животных
            int animalsQuantity = 0;
            int dogQuantity = 0;
            int catQuantity = 0;
            for (int i = 0; i < animals.length; i++) {
                animalsQuantity++;
                if(animals[i].getType() == "dog"){
                    dogQuantity++;
                }else if(animals[i].getType() == "cat"){
                    catQuantity++;
                }
            }
            System.out.println("Всего " + animalsQuantity + " животных, из которых  " + dogQuantity + " собак и " + catQuantity + " котов.");



//        public int animalCount(int arrLength){
//            int dogQuantity = 0;
//            int catQuantity = 0;
//            for (int i = 0; i < arrLength; i++) {
//             int dogCount = 0;
//             int catCount = 0;
//             if(animals[i].getType() == "dog"){
//                dogCount++;
//                }else if(animals[i].getType() == "cat"){
//                catCount++;
//            }
//             dogCount = dogQuantity;
//             catCount = catQuantity;
//            }
//            System.out.println("Всего " + dogQuantity + " собак и " + catQuantity + " котов.");
//            return;
//        }

        animals[3].Run(animals[3].getRunLength(),animals[3].getType());

        animals[0].Swim(animals[0].getSwimLength(),animals[0].getType());
    }

}




