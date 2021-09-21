package aula5;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2];
        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for(int x = 0; x < dias.length; x++){
            for(int y = 0; y <  dias[x].length; y++){
                System.out.println(dias[x][y]);
            }
        }
    }
}
