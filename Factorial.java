
   public class Factorial{
     public void numbers(){
   int res=1;
    int num=5;
     for(int i=1;i<=num;i++){
        res=res*i;
}
  System.out.println(res);
}  
   public static void main(String[]args){
    Factorial n=new Factorial();
    n.numbers();
}
}