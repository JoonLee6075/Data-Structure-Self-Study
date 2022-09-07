import com.sun.jdi.CharValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Decode{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String keyWord = br.readLine();
        int keyNum = Integer.parseInt(br.readLine());
        char[] codedTextArr = br.readLine().toCharArray();

        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Deque deque = new ArrayDeque();

        for (int i=0;i<26;i++){
            final char tempChar = (char) ('A' + i);
            if(!keyWord.contains(String.valueOf(tempChar))){
                deque.add(tempChar);
            }
        }

        for (int i=keyWord.length()-1;i>=0;i--){
            deque.addFirst(keyWord.charAt(i));
        }


        //  더하기
        String codeStr = "";
        for(int i=0;i<26-keyNum+1;i++){
            codeStr += deque.pop();
        }
        while (!deque.isEmpty()){
            codeStr = deque.removeLast() + codeStr;
        }

        for(char ch : codedTextArr){
            System.out.print((char)(codeStr.indexOf(ch) + 'A'));;
        }


    }
}
