*/
In English, a vowel is one of the letters ‘a’, ‘e’, ‘i’, ‘o’, and ‘u’. Of course, a vowel may be uppercase as well as lowercase. Your task here is to count the vowels in a sentence.


Input for this problem is a series of sentences, each consisting of a sequence of words separated by spaces and/or commas (‘,’) and ending in a full stop (‘.’), exclamation mark (‘!’), or question mark (‘?’). Each sentence contains no more than 255 characters, and appears on a line of its own. Input is terminated by a single ‘#’ on a line of its own. This line should not be processed.


Output will be a single integer for each input line, the number of vowels (upper or lower case) found in the sentence. Each output must be on a line of its own.
/*


import java.util.Scanner;

public class FindingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();

            if (str == "#") {
                break;
            }

            char[] index = {'A','E','I','O','U','a','e','i','o','u'};
            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                for (int j = 0; j < index.length; j++) {
                    if(c == index[j]) {
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

        sc.close();
    }
}
