package Lambda;

interface CheckString{
    boolean check(String s);
}


public class HomeLambda {
    public static void main(String[] args) {
        CheckString str = (String s) -> {
            s.contains("о");
            return s.length()>5; //в задании написано вернуть длину массива но у нас же интерфейс типа boolean, а это как так? тогда нужен int...
        };
        System.out.println(str.check("Привет О"));
    }
}


