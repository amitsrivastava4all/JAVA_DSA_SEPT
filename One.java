class One extends Object{
    public static void main(String[] args) {
        float r[] = new float[4];
        System.out.println(r);
        int arr [] = new int[10]; // 10 elements fill with 0
        // traverse 
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        // Enhance for loop
        for(int element : arr){
            System.out.println(element);
        }
        int a[] = {10,20,30};
        int []b = {100,200,300};
        int []c  = new int[]{10,20,30};



        One one = new One();
        String x = new String("Amit");
        System.out.println(x.toString());
        System.out.println(one.toString());
        System.out.println(arr.toString());
        int [][]  menus = new int[3][10]; 
        int []menus2[] = new int[3][3];
        int menus3[][] = new int[3][3];
        int menus4[][] = new int[3][];
        System.out.println(menus);
        menus4[0] = new int[10];
        menus4[1] = new int[20];
        menus4[2] = new int[30];
        menus4[0][3] = 1;
        menus4[0][4] = 1;
        /* 
        for(int i = 0 ; i<menus4.length; i++){
            for(int j = 0; j<menus4[i].length; j++){
                System.out.print(menus4[i][j]+" ");
            }
            System.out.println();
        }
        */
        for(int e [] : menus4){
            for(int w : e){
                System.out.print(w+" ");
            }
            System.out.println();
        }


    }
}