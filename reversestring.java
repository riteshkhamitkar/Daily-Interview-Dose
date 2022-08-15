class Main{
    public static void main(String[] args){
        String str = "Ritesh", rev ="";
        char r;
        
        for(int i =0; i < str.length();i++){
            r = str.charAt(i);
            rev = r+rev;
        }
        System.out.println(rev);
    }
}
