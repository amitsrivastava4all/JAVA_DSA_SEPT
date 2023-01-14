class First{
    static void show(int i){
        // Code Will End
        // Base Case or Termination Case or Stop Case
        if(i == 5){
            return ; // go back to the last fn call
        }
        System.out.println(i); // Repeat Code (Logic)
        show(i+1); // show(2) (Recursion) Fn CallItSelf (Cycle) / Loop
        System.out.println(i); 
    }
    public static void main(String[] args) {
        show(1);
    }
}