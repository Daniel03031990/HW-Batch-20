package HW.e1.example.e141;

public class E141AccessModifiers {

    public static int findLargestNumber(int array[]){

        int largest=array[0];

        for (int num:array){
            if (num>largest){
                largest=num;
            }
        }
        return largest;





    }
    public static void main(String[] args) {
        int array[]={22,12,2,4,7,9,13,16};
        System.out.println(findLargestNumber(array));

    }
}
