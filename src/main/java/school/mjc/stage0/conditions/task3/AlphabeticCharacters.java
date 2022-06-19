package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char ch = Character.toLowerCase(character);
        if(ch=='a' || ch =='o' || ch == 'i' || ch == 'e' || ch == 'u'){
            System.out.println("Vowel");
        } else if(ch>122 || ch<97){
            System.out.println("wrong alphabet!");
        } else {
            System.out.println("Consonant");
        }

    }
}
