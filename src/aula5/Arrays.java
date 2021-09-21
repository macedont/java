package aula5;

public class Arrays {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Eren";
        nomes[1] = "Tanjiro";
        nomes[2] = "akame";

        for(int x = 0; x < nomes.length; x++){
            System.out.println(nomes[x]);
        }
    }
}
