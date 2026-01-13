package lang.math;

import java.util.Random;

public class RandomMath {
    public static void main(String[] args) {
        Random random = new Random();  // sed 같으면 Random의 결과가 같다
       // Random random = new Random(1);  // sed 같으면 Random의 결과가 같다

        int randomInt = random.nextInt();
        System.out.println("randomInt :  " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDOuble : " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean : " + randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10); //0 ~9 까지 출력
        System.out.println("0 ~ 9 " + randomRange1) ;

        int randomRange2 = random.nextInt(10) + 1; // 1~ 10 까지의 출력
        System.out.println("0 ~ 9 " + randomRange1) ;
    }
}
