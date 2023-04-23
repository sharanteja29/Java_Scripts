import java.util.*;
class add{
    public static int add1(int a,int b){
        int res=a+b;
        return res;
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=add1(num1,num2);
        System.out.println(result);

    }
}