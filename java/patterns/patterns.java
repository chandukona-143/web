class Patterns
{
public static void main(String []args)
{
int i,j;
for(i=0;i<=6;i++){
for(j=0;j<=6;j++){
System.out.print("*");
}
System.out.println();
}
}
}


/*
class Patterns
{
public static void main(String []args)
{
for( int i=1;i<6;i++)
{
for (int j=1;j<6;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}


/*
class Patterns
{
public static void main(String[] args)
{
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}


/*

class Patterns{
public static void main(String[] args){
int n=1;
for(int  i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(n++ + " ");
}
System.out.println();
}
}
}


/*
class Patterns{
public static void main(String []args){
int n=1;
for(int i=1;i<=5;i++){
for(int j=0;j<5;j++)
{
System.out.print(n + " ");
n=n+2;
}
System.out.println();
}
}
}



/*class Patterns{
public static void main(String []args){
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
System.out.print((j%2==0)?"1":"0");
}
System.out.println();
}
}
}



/*class Patterns{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print("*" +" ");
}
System.out.println();
}
}
}

  
/*class Patterns{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((2*k) + " ");
}
System.out.println();
}
}
}


/* class Patterns
public static void main(String[]args){
int n=1;
for(int i=1;i<=5;i++)
{
System.out.println();
for(int j=1;j<=5;j++)
{
System.out.print(n +" ");
n++;
if(n==10)
{
n=1;
}
}
System.out.println();
}
}
}


/*class Patterns{
public static void main(String[]args){
String str="INDIA";
for(int i=1;i<=str.length();i++){
System.out.println(str.substring(0,i));
}
}
}


