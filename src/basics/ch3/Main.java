package basics.ch3;

public class Main {
    static int nr = 0;
    static int contor = 0;
    public static int[] removeDuplicates(int[] myArray){
        nr=0;
        int[] newArray = new int[myArray.length];

        for(int i=0; i<myArray.length; i++){
            boolean added =false;
            for(int j=0;j<nr;j++){
                if(myArray[i]==newArray[j]){
                    added=true;
                }
            }
            if(added==false){
                newArray[nr++]=myArray[i];
            }
        }
        return newArray;

    }

    private static Pair[] createPairs (int[] newArray) {
        contor=0;
        Pair[] pairs = new Pair[nr -1];
        for(int i = 0; i< nr; i++) {
            for(int j = i+1; j< nr; j++){
                if(newArray[i]+ newArray[j]==0){
                    pairs[contor++]=new Pair(newArray[i], newArray[j]);
                    System.out.println(pairs[contor-1]);
                }
            }
        }
        return pairs;

    }

    public static void main(String[] args) {
        int[] myArray = new int[]{3,2,-3,-2,3,0};
        int nr=0;
        //System.out.println(myArray);
        for(int i=0;i<myArray.length;i++) {
            System.out.println(myArray[i]+" ");
        }
        int[] newArray = removeDuplicates(myArray);
        System.out.println("");
        for(int i=0;i<nr;i++){
            System.out.println(newArray[i] + " ");
        }

        createPairs(newArray);
        System.out.println("Number of pairs= " + contor);


    }


}
