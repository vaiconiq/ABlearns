/*for inheritance*/

public class DadaG {
    String name = "grandfather";
    String surname = "ji";
}
class Father extends DadaG{
    String name = "father";
}
class Mother{
    String name = "mom";
}
class Me extends Father{
    String name = "Myself";
}
class Run{
    public static void main(String[]args){
        Me ab = new Me();
        System.out.println(ab.name);
        System.out.println(ab.surname);
    }
}
//multiple inheritance not possible in java, to do that we use interface