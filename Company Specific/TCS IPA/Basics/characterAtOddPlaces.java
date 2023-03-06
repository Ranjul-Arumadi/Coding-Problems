class characterAtOddPlaces{
    public static void main(String[] args) {
        String input = "Hello";
        for(int i=0;i<input.length();i++){
            if(i%2!=0){
                System.out.println(input.charAt(i));
            }
        }
    }
}
