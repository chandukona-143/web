class methods 
{
public  void add(){
int a=10, b=20;
System.out.println(a+b);
}
public void sub(){
int a=10-20;
System.out.println(a);
}
public void mul(int a,int b){

System.out.println(a*b);
}
public int  div(int a,int b){
int c=a/b;
return c;
}
public static void main (String[] abs)
{
methods m=new methods();
m.add();
m.sub();
m.mul(10,20);
int d=m.div(10,20);
System.out.println(d);
}
}
