import java.lang.reflect.Constructor;

public class Animals {
    String type;
    String name;
    String colour;
    int runLength;
    int age;
    int swimLength;
//Метод проверки и вывода бега
    public void Run(int runLength, String type){
        if (runLength > 500 && type == "dog"){
            System.out.println(name + " не может пробежать болоьше 500м.");
        }else if(runLength > 200 && type == "cat"){
            System.out.println(name + " не может пробежать болоьше 200м.");
        }else{
            System.out.println(name + " пробежал " + runLength + "м.");
        }
    }
//Метод проверки и вывода плавания
    public void Swim(int runLength, String type){
        if (runLength > 10 && type == "dog"){
            System.out.println(name + "не может проплыть болоьше 10м.");
        }else if(type == "cat"){
            System.out.println(name + " не умеет плавать.");
        }
    }

    public String getType() {
        return type;
    }
    public int getRunLength(){
        return runLength;
    }
    public int getSwimLength(){
        return runLength;
    }
}
