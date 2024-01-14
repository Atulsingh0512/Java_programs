//Reverse a string 

class program6 {
    public static void main(String[] args) {
        String str = "India";

        
        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--)
            System.out.print(ch[i]);
    }
}
