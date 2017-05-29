
public class CharArray {

    public static void main(String[] args) {
        // char배열 Alpha[26]을 만들어 알파벳 대문자 A부터 Z까지 대입한 후, 화면에 순서대로 출력

        char Alpha[] = new char[26];

        for(char i = 'A'; i<= 'Z'; i++){
            System.out.print(i+ " ");

        }

        System.out.println("");

        //char배열 Alpha[26]에 소문자z부터 a까지 역순으로 대입한 후, 화면에 배열의 첫 원소부터 차례대로 출력

        char Alphaa[] = new char[26];

        for(char j = 'Z'; j>= 'A'; j--){
            System.out.print(j+ " ");

        }
        System.out.println("");
    }

}