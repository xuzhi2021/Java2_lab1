import java.util.Scanner;

public class mainm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int [] xin=new int[m];
        boolean [] full=new boolean[m];
        int aindex=0;
        int bindex=0;
        boolean result=true;
        for (int i = 0; i <n ; i++) {
            String s=in.next();
            if(s.equals("A")){
                xin[aindex]++;
                if(xin[aindex]==4) {
                    aindex++;
                    full[aindex]=true;
                    if(aindex>=m){
                        result=false;
                        break;
                    }
                }
            }
            else{
                if(xin[bindex]!=0){
                    bindex++;
                    if(bindex>=m){
                        result=false;
                        break;
                    }

                }
            }
        }
        if(!result){
            System.out.println(0);
            System.out.println(0);
        }
    }
}
