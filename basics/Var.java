class Var{
int a = 50; 
void Print(){
int a = 100;
System.out.println("Global :" +this.a);
System.out.println("Local :" +a);
}
public static void main(String[] args){
Var v = new Var();
v.Print();
}
}
		