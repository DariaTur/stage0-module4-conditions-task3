package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char ch = Character.toLowerCase(symbol);
        if(ch>=97 && ch <=122){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }

    }
}
