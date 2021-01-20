public class PuzirSort {
    public static void main(String[] args) {
        int num[]={1,2,54,11,78,11,1123,3322,111,98};
        int a,b,t, size=10;
        System.out.println("Исходный массив: ");
        for(int i=0;i<size;i++) {
            System.out.println(" " + num[i]);
        }
        System.out.println();
        for(a=1;a<size;a++) {
            for(b=size-1;b>=a;b--){
                if(num[b-1]>num[b]){
                    t=num[b-1];
                    num[b-1]=num[b];
                    num[b]=t;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for(int i=0;i<size;i++) {
            System.out.println(" "+num[i]);
        }
    }
}
