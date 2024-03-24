public class varible{
    public static void main(String[] args) {
        System.out.println("Jai Shree Ram");
        byte age = 24; //-2^7 to 2^7-1
        short height = 173; //2^15
        int weight = 8379897; //2^31
        long hairs = 765658586 // 2^63
        char letter = 'j';
        String name = "Jayant";
        boolean isMarried = true;
        float temparature = 98.4f;
        double happiness = 99.99;


        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);

        int[] arr = {1,2,3,4,5};
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        switch (age) {
            case 24:
                System.out.println("Get serious and work harder");
                break;
        
            default:
                break;
        }
    }
}