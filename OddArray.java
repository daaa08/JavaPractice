
public class OddArray {

    public static void main(String[] args) {

        //정수형배열 odd[4]를 만든 후 1, 3, 5, 7을 대입한 후 그대로 화면에 출력

        int odd[] = new int[4];

        for(int i =0; i<odd.length ; i++){

            int j = 2*i +1;
            System.out.print(j + " ");

        }

    }

}
