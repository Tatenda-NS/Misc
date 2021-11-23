public class ReverseWords {
    public static String reverse(String sentence) {
        StringBuilder solution = new StringBuilder();
        String[] sentenceArray = sentence.split(" ");

        for (int i = sentenceArray.length - 1; i >= 0; i--)
        {
            solution.append(" ").append(sentenceArray[i]);
        }
        return solution.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "Good morning and how are you";
        System.out.println(reverse(sentence));
    }
}
