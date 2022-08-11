package amazon;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverse("Hello World"));
    }
    public static String reverse(String sentence){
        StringBuilder sb = new StringBuilder();
        String [] words = sentence.split(" ");
        for (int i = words.length -1; i >=0; i--){
            if(i == 0){
                sb.append(words[i]);
            }
            else {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
