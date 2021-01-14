public class Fourth {

    public static void main(String[] arge){
        String str1 = "This is just an example string for test";
        //String result = str1.toUpperCase();
        String str2 = "";
        str2 = str2 + str1.substring(0, 1).toUpperCase();
        for (int i = 1; i < str1.length(); i++) {
            if (" ".equals(str1.substring(i-1, i)))
                str2 = str2 + str1.substring(i, i+1).toUpperCase();
            else
                str2 = str2 + str1.substring(i, i+1);
        }

        System.out.println("Result: " + str2);
    }
}
