
class HelloWorld {
    public static void main(String[] args) {
        //Bubble sort
int a[]={4,3,1,5,7};
for(int i=0;i<a.length-1;i++){
    for(int j=0;j<a.length-1-i;j++){
        if(a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
}
for(int x=0;x<a.length;x++){
    System.out.print(a[x]);
}
    }
}