class HelloWorld {
    public static void main(String[] args) {
        //insertion
        int a[]={5,3,2,6,1};
        for(int i=0;i<a.length-1;i++){
            int max=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[max]){
                    max=j;
                }
            }
            int temp=a[i];
            a[i]=a[max];
            a[max]=temp;
        }
        for(int i : a){
            System.out.print(i);
        }
    }
}