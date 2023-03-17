package EungYong1;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    // i번째 글자가 모음인지?
    public boolean isVowel(int i) {
        String vowelString = "aeiouAEIOU";
        String letter = letters.substring(i, i + 1);
        return vowelString.contains(letter);
    }


    public boolean isConsonant(int i) {
        String vowelString = "aeiouAEIOU";
        String letter = letters.substring(i, i + 1);
        return !(vowelString.contains(letter));
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub


       
    }
}
