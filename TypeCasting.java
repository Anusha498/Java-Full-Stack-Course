public class TypeCasting {
    public static void main(String[] args){
        int num1 = 10;
        double num2 = num1; //Type conversion
        System.out.println("Original Value: "+num1);
        System.out.println("converted Value: "+num2);

        double num3 = 3.14;
        int num4 = (int) num3; 
        //you need to do manual conversion
        System.out.println("Original Value: "+num3);
        System.out.println("converted Value: "+num4);

        //Incampatible Conversions
        int zip = 500081;
        //String num_five = (String)zip;//cannot cast from int to String
        String str_zip = String.valueOf(zip);
        System.out.println("Original Value: "+zip);
        System.out.println("converted Value: "+str_zip);  
        System.out.println(str_zip+5);//cancat 

        String str_zip_new = "500081";
        int zip_new = Integer.parseInt(str_zip_new);
        System.out.println("Original Value: "+str_zip_new);
        System.out.println("converted Value: "+zip_new);
        System.out.println(str_zip+5);

        //might not be possible
        //int num6 = 100;
        //boolean boolValue = (boolean)num6;
        



    } 

}
