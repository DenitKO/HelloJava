package seminars.sem3;

import java.util.Arrays;

public class homework {
    public static void main(String[] args) {
        long finish = HowManySteps(22,2022,11,10);
        if ((finish==-1)||(finish==0)){
            System.out.println("Нет решения");
        } else{
            System.out.println(finish);
        }
    }

    public static long HowManySteps(int startPos, int endPos, int multyplyNum, int plusNum){
        long howManyWays = -1;
        int LengthOfTable = startPos>endPos ? startPos+1 : endPos+1;
        long[] table = new long[LengthOfTable];
        int steps = 0;
        Arrays.fill(table, 0);
        table[startPos]=1;
        for (int i = startPos+1; i < endPos+1 ; i++) {
            if (i-plusNum>=startPos){
                if (i/multyplyNum>=startPos) {
                    if ((i%multyplyNum==0)){
                        table[i]=table[i-plusNum]+table[i/multyplyNum];
                        steps++;
                    } else {
                        table[i]=table[i-plusNum];
                        steps++;
                    }
                } else {
                    table[i]=table[i-plusNum];
                    steps++;
                }
            }
        }
        if (steps==0) return -1;
        else{
            howManyWays = table[LengthOfTable-1];
            return howManyWays;
        }
    }
}