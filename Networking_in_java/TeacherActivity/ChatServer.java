// public class Main {
//   public static void main(String[] args) {
//     String greeting = "Hello world";
//     System.out.println(greeting);
//     System.out.println(greeting.length());
//     System.out.println(greeting.toUpperCase());
//     System.out.println(greeting.toLowerCase());
//     System.out.println(greeting.indexOf("l"));
//   }
// }

// concatenation 
// public class Main{
//   public static void main(String args[]){
//     String firstname="shyam";
//     String lastname="lal";
//     String x="10";
//     String y="40";
//     int z=70;
//     System.out.println(lastname+" "+firstname);
//     System.out.println(firstname.concat(lastname));
//     System.out.println(x+y);
//     System.out.println(x+z);
//   }
// }

// special characters
// public class Main {
//   public static void main(String args[]) {
//     String text = "we are learning java language\'s";
//     String text1 = "we are learning java language\n's";
//     String text2 = "we are learning java languager\r's";
//     String text3 = "we are learning\t\t java language's";
//     String text4 = "we are learning\b java language\'s";
//     String text5 = "we are\\ learning java languages";
//     String text6 = "we are learning\' java languages";
//     String text7= "we are learning\" java languages";
//     System.out.println(text);
//     System.out.println(text1);
//     System.out.println(text2);
//     System.out.println(text3);
//     System.out.println(text4);
//     System.out.println(text5);
//     System.out.println(text6);
//     System.out.println(text7);
//   }
// }

// math functions 
// public class Main {
//   public static void main(String args[]) {
//       double angle=30;
//       double radians=Math.toRadians(angle);
//       double sinevalue=Math.sin(radians);
//       System.out.println(Math.max(10,30));
//       System.out.println(Math.min(10,30));
//       System.out.println(Math.sqrt(64));
//       System.out.println(Math.pow(2,4));
//       System.out.println(Math.random()*100);
//       System.out.println(Math.round(2.5));
//       System.out.println(Math.ceil(2.5));
//       System.out.println(Math.floor(2.5));
//       System.out.println(Math.abs(10));
//       System.out.println(Math.sin(Math.PI/2));  //1.57->1 // sin->angle(radians)
//       System.out.println("sine of "+angle+"degree is"+sinevalue);
//     }
//}

// public class Main{
//   public static void main(String[] args){
//     int num1=5;
//     if(num1%2==0){
//       System.out.println("num1 is even");
//     }
//     else{
//       System.out.println("num1 is odd");
//     }
//     int example1=500;
//     if(example1==500){
//       System.out.println("example1 is equal to 500");
//     }
//     else{
//       System.out.println("example1 is not equal to 500");
//     }
//     int time=20;
//     String result;
//     result=(time<18)?"good day":"bad day";
//     System.out.println(result);
//     int x=60;
//     int y=60;
//     if(x>y){
//       System.out.println("x is greater than y");
//     }
//     else if(x<y){
//       System.out.println("x is smaller than y");
//     }
//     else{
//       System.out.println("not working");
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int a=6;
//     switch (a) {
//       case 1:
//         System.out.println("a is 1");
//         break;
//        case 2:
//        System.out.println("a is 2");
//        break;
//        case 3:
//        System.out.println("a is 3");
//        break;
//        case 4:
//        System.out.println("a is 4");
//        break;
//        case 5:
//        System.out.println("a is 5");
//        break;
//        default:
//        System.out.println("a is not 1, 2, 3, 4 or 5");
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int i=0;
//     while(i<5){
//       System.out.println("Hello World"+" "+i);
//       i++;
//     }
//     int j=0;
//     do{
//       System.out.println("i am"+" "+j);
//       j++;
//     }while(j<5);
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int num=1;
//     while(num<=6){
//      if(num<6){
//       System.out.println("Number is less than 3");
//     }else{
//       System.out.println("sorry");
//     }
//     num=num+1;
//   }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     // outer
//     for(int i=1;i<=2;i++){
//       System.out.println("outer "+i);
//        // inner
//     for(int j=1;j<=3;j++){
//       System.out.println("inner"+j);
//     }
//     }
//   }
// }

// // arrays 
// public class Main{
//   public static void main(String[] args) {
//     String[] colors={"red","blue","pink","purple"};
//     System.out.println(colors[1]);
//   }
// }

// public class Main{
//   public static void main(String[] args) {
//     String[] colors={"red","blue","pink","purple"};
//     colors[0]="cyan";
//     System.out.println(colors[0]);
//     System.out.println(colors.length);
//     for(int i=0;i<colors.length;i++){
//       System.out.println(colors[i]);
//     }
//   }
// }

// public class Main{
//   public static void main(String[] args) {
//     String[] colors={"red","blue","pink","purple"};
//     for(String i :colors){
//       System.out.println(i);
//     }
//   }
// }

// public class Main{
//   public static void main(String[] args) {
//     int numbers[] ={10,50,40,20,80,90};
//     int sum=0;
//     for(int i=0;i<numbers.length;i++){
//       sum+=numbers[i];
//     }
//     double avg=(double) sum/numbers.length;
//     System.out.println(avg);
//   }
// }

// public class Main{
//   public static void main(String[] args) {
//     int numbers[] ={10,50,40,20,80,90};
//     int min=numbers[0];
//     for(int i=1;i<numbers.length;i++){
//       if(numbers[i]<min){
//         min=numbers[i];
//       }
//     }
//     System.out.println("lowest is"+min);
//   }
// }

// public class Main{
//   public static void main(String[] args) {
//     String[] cars={"volvo","BMW","Ford","Mazda"};
//     System.out.println(cars[2]);
//     cars[0]="Opel";
//     System.out.println(cars[0]);
//     System.out.println(cars.length);
//     for(int i=0; i<cars.length;i++){
//       System.out.println(cars[i]);
//     }
//   }
// }

// public class Main{
//   static void my(){
//     System.out.println("hello world");
//   }
//   public static void main(String[] args) {
//     my();
//     my();
//   }
// }
// public class Main {
//   public static void main(String[] args) {
//     System.out.println(Math.max(5,10));
//     System.out.println(Math.min(5,10));
//     System.out.println(Math.sqrt(64));
//     System.out.println(Math.pow(2,4));
//     System.out.println(Math.random()*100);
//     System.out.println(Math.round(2.5));
//     System.out.println(Math.ceil(2.5));
//     System.out.println(Math.floor(2.5));
//     System.out.println(Math.abs(-4.7));
//   }
// }

// 1 Write a program to add two numbers in Java.
// public class Main {

//   public static void main(String[] args) {
//     int num1=6;
//     int num2=6;
//     System.out.println(num1+num2);
//   }
// }

// 2 Write a program to check if a number is even or odd.
// public class Main {
//   public static void main(String[] args) {
//     int num=10;
//     if(num%2==0){
//       System.out.println("number is even");
//   }else{
//     System.out.println("number is odd");
//   }
// }
// }

// 3 Write a program to find the largest of three numbers.
// public class Main {

//   public static void main(String[] args) {
//     int a=100,b=30,c=70;
//     if(a>b && a>c){
//       System.out.println("largest is "+a);
//     }else if(b>a && b>c){
//       System.out.println("largest is "+b);
//     }else{
//       System.out.println("largest is "+c);
//     }
//   }
// }

// 4 Write a program to find the factorial of a number.
// public class Main {
//   public static void main(String[] args) {
//     int num = 4;
//     int factorial = 1;
//     for (int i = 1; i <= num; i++) {
//       factorial *= i;
//     }
//     System.out.println("factorial of " + num + " is "+ factorial);
//   }
// }

// 5 Write a program to check if a number is positive or negative.
// 6.  Write a program to calculate the area of a rectangle.

// swap
// public class SwapNumbers {
//   public static void main(String[] args) {
//       int a = 5;
//       int b = 10;
//       int temp = a;
//       a = b;
//       b = temp;
//       System.out.println("After swapping: a = " + a + ", b = " + b);
//   }
// }

// functions 
// public class Greeter{
//     public void greet(String name) {
//         System.out.println("hello, "+name+"! welcome !");
//     }
//     public static void main(String[] args) {
//         // creting object of greet
//         Greeter greet2=new Greeter();
//         // calling the fuction as abc and def
//         greet2.greet("abc");
//         greet2.greet("def");
//     }
// }

// public class Calculator{
//     public int add(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Calculator calc=new Calculator();
//         int result=calc.add(4,3);
//         System.out.println("the result is "+result);
//     }
// }

// public class Rectangle{
//     public int calculate(int length,int width){
//         int area=length*width;
//         return area;
//     }
//     public static void main(String[] args) {
//         Rectangle rect =new Rectangle();
//         int area1=rect.calculate(4,5);
//         int area2=rect.calculate(7,4 );
//         System.out.println("area1 is "+area1);
//         System.out.println("area2 is "+area2);
//     }
// }

// public class FactorialCalculator{
//     public int factorial(int n){
//         if(n==0){
//             return 1;
//         }else{
//             return n*factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         FactorialCalculator cal=new FactorialCalculator();
//         int result=cal.factorial(5);
//         System.out.println("factorial of 5 is "+result);
//     }    
// }

// Check if a Number is Even or Odd
// public class EvenOdd{
//     public static void main(String[] args) {
//         int number=5;
//         if(number%2==0){
//             System.out.println(number+" is even");
//         }else{
//             System.out.println(number+" is odd");
//         }
//     }
// }

// count vowels
// public class Vowels{
//     public static void main(String[] args) {
//         String input="hello world";
//         int vowel=countVowels(input);
//         System.out.println(vowel);
//     }
//     public static int countVowels(String str) {
//         int count=0;
//         String vowels="aeiouAEIOU";
//         for(char c:str.toCharArray()){
//             if(vowels.indexOf(c)!=-1){
//                 count++;
//             }
//         }
//         return count;
//     }    
// }

// Simple Calculator Using Switch Case
// import java.util.Scanner;
// public class Calculatorswitch{
//     public static void calculator() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int num1 = scanner.nextInt();
//         System.out.println("Enter second number:");
//         int num2 = scanner.nextInt();
//         System.out.println("Enter operator (+, -, *, /):");
//         int addnum = num1+num2;
//         int subnum = num1-num2;
//         int mulnum = num1*num2;
//         int divnum = num1/num2;
//         char operator = scanner.next().charAt(0);
//         switch (operator) {
//             case '+':
//             System.out.println(num1 + " + " + num2 + " = " + (addnum));
//             break;
//             case '-':
//             System.out.println(num1 + " - " + num2 + " = " + (subnum));
//             break;
//             case '*':
//             System.out.println(num1 + " * " + num2 + " = " + (mulnum));
//             break;
//             case '/':
//             System.out.println(num1 + " / " + num2 + " = " + (divnum));
//             break;
//             default:
//             System.out.println("Invalid operator");
//             }
//             scanner.close();
//             }
//             public static void main(String[] args) {
//                 calculator();
//             }
// }

//  oops 
// public class Main {
//     int x=5;
//     int y=7;
//     public static void main(String[] args) {
//         Main myobj1=new Main();
//         Main myobj2=new Main();
//         System.out.println(myobj1.x);
//         System.out.println(myobj2.y);
//     }
// }

// public class Car{
//     String color;
//     int speed;
//     void drive(){
//         System.out.println("Car is driving at speed "+speed);
//         System.out.println("Color of the car is "+color);
//     }
//     public static void main(String[] args) {
//         Car mycar=new Car();
//         mycar.color="pink";
//         mycar.speed=60;
//         mycar.drive();
//     }
// }

// class oopsTheory{
//         int speed;
//         String color;
//         void drive(){
//             System.out.println("Car is driving as speed "+speed);
//             System.out.println("Color of the car is "+color);
//         }
//         public static void main(String[] args){
//             oopsTheory mycar = new oopsTheory();
//             mycar.speed = 60;
//             mycar.color = "Red";
//             mycar.drive();
//         }
//     }

// public class Main {
//     int modelyear;
//     String modelname;
//     public Main(int year, String name) {
//      modelyear=year;
//      modelname=name;
// }
//     public static void main(String[] args) {
//         Main mycar=new Main(2024,"BMW");
//         System.out.println("Car Model Year: "+mycar.modelyear);
//         System.out.println("Car Model Name: "+mycar.modelname);
//     }
// }

// class Vehicle {
//     String brand;
//     public Vehicle(String brand){
//         this.brand = brand;
//     }
//     public void honk(){
//         System.out.println("The " + brand + " vehicle honks.");
//     }
// }
// class Car extends Vehicle {
//     int wheels;
//     public Car(String brand,int wheels){
//         super(brand);
//         this.wheels = wheels;
//     }
//     public void display(){
//         System.out.println("The " + brand + " car has " + wheels + " wheels.");
//     }
// }
// public class Main{
//     public static void main(String[] args){
//         Car myCar = new Car("Toyota", 4);
//         myCar.honk();
//         myCar.display();
//     }
// }

// class phone {
//     String brand;

//     public phone(String brand) {
//         this.brand = brand;
//     }

//     public void ring() {
//         System.out.println("The " + brand + " phone rings.");
//     }
// }

// class Animal {
//     public void animalSound() {
//       System.out.println("The animal makes a sound");
//     }
//   }

//   class Pig extends Animal {
//     public void animalSound() {
//       System.out.println("The pig says: wee wee");
//     }
//   }

//   class Dog extends Animal {
//     public void animalSound() {
//       System.out.println("The dog says: bow wow");
//     }
//   }

//   class Main {
//     public static void main(String[] args) {
//       Animal myAnimal = new Animal();
//       Animal myPig = new Pig();
//       Animal myDog = new Dog();

//       myAnimal.animalSound();
//       myPig.animalSound();
//       myDog.animalSound();
//     }
//   }

// class Animal{
//   void animalSound(){
//     System.out.println("The animal makes a sound");
//   }
// }
// class Dog extends Animal{
//   void animalSound(){
//     System.out.println("woof woof!");
//   }
// }
// class Cat extends Animal{
//   void animalSound(){
//     System.out.println("Meow meow!");
//   }
// }
// public class Main{
//     public static void main(String[] args){
//       Animal myDog=new Dog();
//       Animal myCat=new Cat();
//       myDog.animalSound();
//       myCat.animalSound();
//     }
// }
// class Calc {
//   int add(int a, int b) {
//     return a + b;
//   }

//   int add(int a, int b, int c) {
//     return a + b + c;
//   }

//   double add(double a, double b) {
//     return a + b;
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     Calc Calc = new Calc();
//     System.out.println(Calc.add(4, 5));
//     System.out.println(Calc.add(4, 5, 6));
//     System.out.println(Calc.add(4.5, 5.5));
//   }
// }

// // abstraction 
// abstract class Animal{
//   public abstract void animalSound();
//   public void sleep(){
//     System.out.println("Zzzz");
//   }
// }
// class Pig extends Animal{
//   public void animalSound(){
//     System.out.println("The pig says: wee wee");
//   }
// }
// class Main{
//   public static void main(String[] args){
//     Pig myPig = new Pig();
//     myPig.animalSound();
//     myPig.sleep();
//   }
// }

// abstract class Animal{
//   abstract void sound();
//   void eat(){
//     System.out.println("The animal eats food");
//   }
// }

// class Dog extends Animal{
//   void sound(){
//     System.out.println("The dog barks");
//   }
// }
// public class Main{
//   public static void main(String[] args) {
//     Dog dog=new Dog();
//     dog.sound();
//     dog.eat();
//   }
// }

// shape  
// circle extends shape
// rectangle  extends shape
// abstract class Vehicle {
//   abstract void start();
//     void stop(){
//       System.out.println("The vehicle stopped");
//     }
//   }

// class Car extends Vehicle{
//   void start(){
//     System.out.println("The car started");
//   }
// }
// class Bike extends Vehicle{
//   void start(){
//     System.out.println("The bike started");
//   }
// }
// public class  Main {
//   public static void main(String[] args) {
//    Vehicle myCar = new Car();
//     myCar.start();
//     myCar.stop();
//     Vehicle myBike = new Bike();
//     myBike.start();
//     myBike.stop();
// }
// }

// Write a Java program for a Car class with fields brand, model, year, and a method displayDetails().
// class car{
//     String brand;
//     String model;
//     int year;
//     // car details
//     void displayDetails() {
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("Year: " + year);
//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         car Car=new car();
//         Car.brand="Toyota";
//         Car.model="Corolla";
//         Car.year=2024;
//         Car.displayDetails();
//     }
// }

// Modify the Student class to include a constructor that initializes name and age.
// class Student{
//     String name;
//     int age;
//     // constructor
//     Student(String name, int age){
//         this.name=name;
//         this.age=age;
//     }
//     void showdetails(){
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);

//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Student student1=new Student("kushal",15);
//         student1.showdetails();
//         Student student2=new Student("Ravi",16);
//         student2.showdetails();
//     }
// }

// Create a superclass Shape and subclasses Circle and Rectangle, each overriding the draw() method

// date methods
// import java.util.Date;
// public class Main{
//     public static void main(String[] args) {
//         Date currentDate=new Date();
//         System.out.println("Current date and time: "+currentDate);
//     }
// }

// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class Main {
//     public static void main(String[] args) {
//         Date currentDate = new Date();
//         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//         System.out.println("Current date and time: " + dateFormat.format(currentDate));
//     }
// }

// import java.time.LocalDate;
// public class Main{
//     public static void main(String[] args) {
//         LocalDate today=LocalDate.now();
//         System.out.println("Today's date: "+today);
//     }
// }

// import java.time.LocalTime;
// public class Main{
//     public static void main(String[] args) {
//         LocalTime today=LocalTime.now();
//         System.out.println("Today's date: "+today);
//     }
// }

// import java.time.LocalDateTime;
// public class Main{
//     public static void main(String[] args) {
//         LocalDateTime today=LocalDateTime.now();
//         System.out.println("Today's date: "+today);
//     }
// }

// import java.util.Calendar;

// public class Main {
//     public static void main(String[] args) {
//         Calendar calendar = Calendar.getInstance();
//         System.out.println("Year: " + calendar.get(Calendar.YEAR));
//         System.out.println("Month: " + (calendar.get(Calendar.MONTH) +1)); // Month is 0-based
//         System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
//     }
// }

// count words
// import java.util.Scanner;
// public class ScannerExample {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter ur name:");
//         String name=scanner.nextLine();
//         System.out.println("Enter ur age:");
//         int age=scanner.nextInt();
//         System.out.println("hello "+name+" you are "+age+" years old");
//         scanner.close();
//     }
// }

// import java.util.Scanner;
// public class Reversestring{
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String input=scanner.nextLine();
//         String reversed="";
//         for(int i=input.length()-1; i>=0; i--) {
//             reversed+=input.charAt(i);
//     }
//         System.out.println("Reversed string: "+reversed);
//         scanner.close();
//     }
// }

// public class ArraySum{
//     public static void main(String[] args) {
//         int[] numbers={1,2,3,4,5,6,7,8};
//         int sum=0;
//         for(int num:numbers){
//             sum+=num;
//         }
//         System.out.println("sum of the elements:"+sum);
//     }
// }

// convert string to array

// import java.util.Arrays;
// public class ArraySort{
//     public static void main(String[] args) {
//         int[] numbers={5,4,6,7,8,1,2};
//         Arrays.sort(numbers);
//         System.out.println("Sorted array: "+Arrays.toString(numbers));
//     }
// }

// reverse

// import java.util.Arrays;
// import java.util.Collections;

// public class ArraySortDescending{
//     public static void main(String[] args) {
//         Integer[] numbers={5,3,7,8,6};
//         Arrays.sort(numbers,Collections.reverseOrder());
//         System.out.println("Sorted array in descending order: "+Arrays.toString(numbers));
//     }
// }

// average of arrays

// public class SmallestElement {
//     public static void main(String[] args) {
//         int[] numbers={25,44,3,65,1,7,89};
//         int smallest=numbers[0];
//         for(int num:numbers){
//             if(num<smallest){
//                 smallest=num;
//             }
//         }
//         System.out.println("Smallest number: "+smallest);
//     }
// }

// import java.util.ArrayList;

// public class ArrayListLoop {
//     public static void main(String[] args) {
//         ArrayList<String>fruits=new ArrayList<>();
//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Cherry");

//         System.out.println("Fruits list:");
//         for(String fruit :fruits){
//             System.out.println(fruit);
//         }

//         System.out.println("using traditinal loop");
//         for(int i=0;i<fruits.size();i++){
//             System.out.println(fruits.get(i));
//         }
//     }

// }

// threads
// class MyThread extends Thread {
//     public void run() {
//         for(int i=1;i<=10;i++){
//             System.out.println(Thread.currentThread().getName()+"-"+i);
//         }
//     }
// }
// public class ThreadExample{
//     public static void main(String[] args) {
//         MyThread thread1=new MyThread();
//         MyThread thread2=new MyThread();
//         thread1.start();
//         thread2.start();
//     }
// }

// public class Main extends Thread{
//     public static void main(String[] args) {
//         Main thread=new Main();
//         thread.start();
//         System.out.println("This code is outside of the thread");
//     }

//     public void run() {
//         System.out.println("This code is inside the thread");
//     }
// }

// class ThreadExamples {

//     public static void main(String[] args) {
//         Thread thread = new Thread(new BasicRunnable());
//         thread.start();

//         for (int i = 0; i < 5; i++) {
//             System.out.println("Main thread executing: " + i);
//         }

//         System.out.println("Main thread finished.");
//     }
// }

// class BasicRunnable implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Child thread executing: " + i);
//         }
//         System.out.println("Child thread finished.");
//     }
// }

// public class Main extends Thread{
//     public static int amount=1;
//     public static void main(String[] args) {
//         Main thread =new Main();
//         thread.start();
//         System.out.println(amount);
//         amount++;
//         System.out.println(amount);
//         amount++;
//         System.out.println(amount);
//         amount++;
//         System.out.println(amount);
//     }
//     public void run() {
//         amount+=2;
//     }
// }

// public class Main extends Thread{
//     public static int amount=0;
//     public static void main(String[] args) {
//         Main thread=new Main();
//         thread.start();
//         while(thread.isAlive()) {
//             System.out.println("Waiting...");
//         }
//         System.out.println("Main thread finished. Amount: "+amount);
//         amount++;
//         System.out.println("Main thread finished. Amount: "+amount);
//     }
//     public void run() {
//         amount++;
//     }
// }

// half pyramid
// public class Main{
//     public static void main(String[] args) {
//         // number of rows 5
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// inverted half pyramid 
// public class Main{
//     public static void main(String[] args) {
//         // number of rows 5
//         int n=5;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// triangle using star
// public class NumberTriangle1{
//  public static void main(String[] args) {
//     int row=5;
//     for(int i=1;i<=row;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
//  }   
// }

// public class CharTriangle{
//     public static void main(String[] args) {
//         int rows=5;
//         char ch='A';
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch+" ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class NumberPyramid{
//     public static void main(String[] args) {
//         int rows=5;
//         for (int i = 1; i <= rows; i++) {
//             // Inner loop for leading spaces
//             for (int j = i; j < rows; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j < i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//half pyramid
// public class Patterns {
//     public static void main(String[] args) {
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// inverted half pyramid
// for (int j = i + 1; j <= n; j++) {
// System.out.print("* ");
// }
// System.out.println();
// int n = 5;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j + " ");
// }
// System.out.println();
// int rows = 5;
// char ch = 'A';
// for (int i = 1; i <= rows; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print(ch + " ");
// ch++;
// }
// System.out.println();

// inverted char pyramid
// int rows = 5;
// char ch = 'A';
// for (int i = rows; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print(ch + " ");
// ch++;
// }
// System.out.println();
//         int n = 5; 

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         int i=0;
//         while(i<5){
//             System.out.println(i);
//             i++;
//         }
//         int j=0;
//         do{
//             System.out.println(j);
//             j++;
//         }while(j<5);
//     }
// }

// public class Main{
//     public static void greet(){
//         System.out.println("Hello world");
//     }
//     public static int add(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         greet();
//         int sum=add(4,3);
//         System.out.println("sum "+sum);
//     }
// }

// class Vehical { 
//     public void vehicalSound() {
//       System.out.println("the vehical makes a sound");
//     }
//   }

//   class Car extends Vehical { 
//     public void vehicalSound() {
//       super.vehicalSound(); 
//       System.out.println("The car: vroom vroom");
//     }
//   }

//   public class Main {
//     public static void main(String args[]) {
//       Vehical myCar = new Car(); 
//       myCar.vehicalSound(); 
//     }
//   }

// class Person{
//     String name;
//     // constructor
//     Person(String name){
//         this.name=name;
//     }
//     void display(){
//         System.out.println("Name: "+this.name);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Person person=new Person("kushal");
//         person.display();
//     }
// }

// class Animal {
//     void sound() {
//         System.out.println("Some sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         super.sound(); 
//         System.out.println("Bark");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.sound();
//     }
// }

// lambda 
// import java.util.*;
// public class LmabdaExample{
//     public static void main(String[] args) {
//         List<String> names=Arrays.asList("kushal","ravi","suresh","mukesh");
//        names.sort((a,b)->a.compareTo(b));
//        System.out.println(names);
//        System.out.println(names.size());
//     }
// }

// calculator 
// interface Calculator {
//         int add(int a, int b);
// }
// public class LmabdaExample{
//         public static void main(String[] args) {
//                 Calculator add=(a,b)->a+b;
//                 Calculator multiply=(a,b)->a*b;
//                 System.out.println(add.add(4,3));
//                 System.out.println(multiply.add(4,3));
// }
// }

// import java.util.*;
// public class ComparatorExample{
//         public static void main(String[] args) {
//                 List<String> words=Arrays.asList("Apple","Banana");
//                 words.sort((a,b)->a.compareTo(b));
//                 System.out.println(words);
//                 System.out.println(words.size());
// }       
// }

// import java.util.*;
// public class LambdaExample {
//     public static void main(String[] args) {
//         List<String> words = Arrays.asList("apple", "banana");
//         words.sort((a, b) -> a.compareTo(b));
//         System.out.println(words);
//         System.out.println(words.size());
//     }
// }

// import java.util.Arrays;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//         numbers.forEach(n -> {
//             if (n % 2 == 0) {
//                 System.out.println(n);
//             }
//         });
//     }
// }

// class Aimal{
//     public void Sound(){
//         System.out.println("Animal makes sound");
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         Aimal a=new Aimal();
//         a.Sound();
//     }
// }

// class Animal{
//     private String name="kushal";
//     private void sound(){
//         System.out.println(" makes sound");
//     }
//     public void showname(){
//         System.out.println("Name: "+name);
//     }
// }
// public class Test{
//     public static void main(String[] args) {
//         Animal a=new Animal();
//         a.showname();
//         a.sound();
//     }
// }

// class Animal {
//     protected void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog extends Animal {
//     public void bark() {
//         sound(); // Accessible through inheritance
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.bark(); // Accessible
//     }
// }

// class Animal {
//     private String type = "Mammal"; // Private variable

//     protected void sound() { // Protected method
//         System.out.println("Animal makes sound");
//     }

//     public String getType() { // Public method to access private variable
//         return type;
//     }
// }
// public class Test extends Animal{
//     public static void main(String[] args) {
//         Test test = new Test();
//         System.out.println(test.getType()); // Accessible
//         test.sound(); // Accessible
//         System.out.println(test.type); // Not accessible
//     }
// }

// recursion 
// public class Factorial{
//  static int factoraial(int n){
//         if(n==0||n==1){
//                 return 1;
//         }
//         return n*factoraial(n-1);
//  }      
//  public static void main(String[] args) {
//         System.out.println(factoraial(5));
//  } 
// }
// fibonacci series
// public class Fibonacci{
//  static int fibonacci(int n) {
//         if(n==0){
//                 return 0;
//         }else if(n==1){
//                 return 1;
//         }
//         return fibonacci(n-1) + fibonacci(n-2);
//  }
//         public static void main(String[] args) {
//                 System.out.println(fibonacci(10));
//         }       
// }
//  0, 1, 1, 2, 3, 5, 8,13, 21, 34, 55

// call by value and call by reference
// call by value=copy of actual value ,cbr=reference to the memory location
// premitive(int,booleans,char,float) and non-premitive (strings,array,class.object)
// call by value 
// public class Example{
//         static void changevalue(int x){
//                 x=20;
//         }
//         public static void main(String[] args) {
//                 int a=10;
//                 changevalue(a);
//                 System.out.println("Value of a: "+a);
//         }
// }

// // call by refernce
// class Example{
//         int value;
//         Example(int value){
//                 this.value=value;
//         }
//         static void modify(Example obj){
//                 obj.value=28;
//         }
//         public static void main(String[] args) {
//                 Example obj=new Example(10);
//                 modify(obj);
//                 System.out.println("Value of obj.value: "+obj.value);
//         }
// }

// public class PrimitiveExample{
//         public static void main(String[] args) {
//                 int a=10;
//                 int b=a;
//                 b=20;
//                 System.out.println(a);  
//                 System.out.println(b);
//         }
// }

// public class NonPrimitiveExample{
//         public static void main(String[] args) {
//                 int[] arr1={1,2,3};
//                 int[] arr2=arr1;
//                 arr2[0]=10;
//                 System.out.println(arr1[0]);
//                 System.out.println(arr2[0]);
//         }
// }

// exception handlings
// public class ExceptionExample {
//         public static void main(String[] args) {
//                 try {
//                         int result = 10 / 0;
//                         System.out.println(result);
//                 } catch (ArithmeticException e) {
//                         System.out.println("Exception:cannot divide by 0");
//                 } finally {
//                         System.out.println("Execution completed successfully");
//                 }
//         }
// }

// public class FinallyExample{
//         public static void main(String[] args) {
//             try{
//                 int number=Integer.parseInt("123a");
//             }catch(NumberFormatException e){
//                 System.out.println("Exception: Invalid number format");
//             }finally{
//                 System.out.println("Execution completed successfully");
//             }
//         }
// }

// public class THrowExample{
//     public static void main(String[] args) {
//         try{
//             checkNumber(-5);
//         }catch(IllegalArgumentException e){
//             System.out.println("Exception: "+e.getMessage());
//         }
//     }
//     static void checkNumber(int num){
//         if(num<0){
//             throw new IllegalArgumentException("Number should be positive");
//         }
//         System.out.println("Number is valid "+num);
//     }
// }

// nested try catch
// public class NestedTryCatchExample{
//     public static void main(String[] args) {
//         try{
//             try{
//                 int result=10/0;
//             }catch(ArithmeticException e){
//                 System.out.println("Exception: cannot divide by 0");
//             }
//             String str=null;
//             System.out.println(str.length());
//         }catch(NullPointerException e){
//             System.out.println("Exception: null pointer exception");
//         }
//     }
// }

// public class DivisionExample{
//     public static void main(String[] args) {
//         try{
//             int a =10;
//             int b=0;
//             int result=a/b;
//             System.out.println("Result: "+result);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Exception: cannot divide by 0");
//         }
//     }
// }

// public class ArrayExample{
//     public static void main(String[] args) {
//         try{
//             int[] numbers={1,2,3,4,5};
//             System.out.println(numbers[10]);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Exception: Array index out of bounds");
//         }

//     }
// }

// regex
// public class Onlydigits{
//     public static void main(String[] args) {
//         String input="12345";
//         if(input.matches("\\d+")){
//             System.out.println("Input contains only digits");
//         }else{
//             System.out.println("Input does not contain only digits");
//         }
//     }
// }

// import java.util.regex.*;
// public class ValidateEmail{
//     public static void main(String[] args) {
//         String email="abc@example.com";
//         String regex= "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
//         if(email.matches(regex)){
//             System.out.println("Valid email");
//         }else{
//             System.out.println("Invalid email");
//         }
//     }
// }

// import java.util.regex.*;

// public class FindWords {
//     public static void main(String[] args) {
//         String sentence = "4Java is fun!1";
//         Pattern pattern = Pattern.compile("\\b\\w+\\b"); // Matches words
//         Matcher matcher = pattern.matcher(sentence);
//         System.out.println("Words in the sentence:");
//         while (matcher.find()) {
//             System.out.println(matcher.group());
//         }
//     }
// }
// b stands for ->matching words 

// public class ReplaceSpaces{
//     public static void main(String[] args) {
//         String input="THIS IS         JAVA!";
//         String output=input.replaceAll("\\s+","");
//         System.out.println("Output: "+output);
//     }
// }

// public class ValidatePhone{
//     public static void main(String[] args) {
//         String phone="123456789";
//         String regex="^\\d{10}$";
//         if(phone.matches(regex)){
//             System.out.println("Valid phone number");
//         } else{
//             System.out.println("Invalid phone number");
//         }
//     }
// }

// public class StartsWithHello{
//     public static void main(String[] args) {
//         String input="sHello, World!";
//         if(input.startsWith("Hello")){
//             System.out.println("String starts with Hello");
//     }else{
//         System.out.println("String does not start with Hello");
//     }
// }
// }

// endswith
// Check if a String Contains Only Alphabets
// Find All Vowels in a String
// validate a password

// import java.util.ArrayList;
// public class Main
// {
//     public static void main(String[] args) {
//      ArrayList<String> colors=new ArrayList<String>();
//         colors.add("Red");
//         colors.add("Green");
//         colors.add("Blue");
//         for(String i:colors){
//             System.out.println(i);
//         }   
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers=new ArrayList<Integer>();
//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);
//         int sum=0;
//         for(int i:numbers){
//             sum+=i;
//         }
//         System.out.println("Sum: "+sum);
//     }
// } 

// while loop
// import java.util.ArrayList;
// import java.util.Iterator;
// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Cherry");

//         // Loop through using an Iterator
//         Iterator<String> iterator = list.iterator();
//         while (iterator.hasNext()) {
//             System.out.println(iterator.next());
//         }
//     }
// }

// java file reader
// import java.io.*;
// import java.io.FileReader;
// public class li{
//     public static void main(String[] args) {
//         try{
//             Reader r=new FileReader("example1.txt");
//             int data=r.read();
//             while(data!=-1){    //read until the end of the file
//                 System.out.println((char)data);
//                 data=r.read();
//             }
//             r.close();
//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// write
// import java.io.FileWriter;
// import java.io.IOException;
// public class File{
//     public static void main(String[] args) {
//         try{
//             FileWriter writer=new FileWriter("example1.txt"); // append mode
//             writer.write("Hello, good morning!");
//             writer.close();
//             System.out.println("Successfully wrote to the file");
//         }
//         catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }
// Write a Java program to create a new file named test.txt and check whether the file is created successfully.

// Write a Java program to write the text "Hello, Java File Handling!" into a file.

// Write a Java program to read the contents of a file and display them on the console.
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// public class FileReaderExample {
//     public static void main(String[] args) {
//         try{
//             File file=new File("example1.txt");
//             Scanner reader=new Scanner(file);
//             while(reader.hasNextLine()){
//                 System.out.println(reader.nextLine());
//             }
//             reader.close();
//         }catch(FileNotFoundException e){
//             System.out.println("An error occurred");
//             e.printStackTrace();
//         }
//     }
// }

// import java.io.File;
// public class DeleteFileExample{
//     public static void main(String[] args) {
//         File file=new File("example1.txt");
//         if(file.delete()){
//             System.out.println("File deleted successfully");
//     }
//     else{
//             System.out.println("Failed to delete the file");
//         }
// }
// }

// regex
// import java.util.regex.*;
// public class RegexExample{
//     public static void main(String[] args) {
//         String text="Hello123";
//         String regex="[A-Za-z]+\\d+";  //letters followed by the numbers
//         Pattern pattern=Pattern.compile(regex);
//         Matcher matcher=pattern.matcher(text);
//         if(matcher.matches()){
//             System.out.println("pattern matches");
//         }
//         else{
//             System.out.println("pattern does not match");
//         }
//     }
// }

// extracting emails
// import java.util.regex.*;
// public class ExtractEmails{
//     public static void main(String[] args) {
//         String text="Contact us at support@example.com or contact@company.org";
//         String regex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";  //email pattern
//         Pattern pattern=Pattern.compile(regex);
//         Matcher matcher=pattern.matcher(text);
//         while(matcher.find()){
//             System.out.println("found email "+matcher.group());
//         }
//     }
// }

// Validate Phone Number
// Extract all words that start with a capital letter.
// import java.util.regex.*;
// import java.util.*;
// public class CapitalWordsExtractor{
//     public static void main(String[] args) {
//         String text="Hello from Java World,Let's Learn Regex";
//         String regex="\\b[A-Z][a-z]*\\b";
//         Pattern pattern = Pattern.compile(regex);
//         Matcher matcher = pattern.matcher(text);
//         List<String> capitalwords=new ArrayList<>();
//         while(matcher.find()){
//             capitalwords.add(matcher.group());
//         }
//         System.out.println("Capital words: "+capitalwords);
//     }
// }

// Check if a string is a palindrome (ignoring case and spaces).
// public class PalindromeChecker {
//     public static boolean isPalindrome(String str){
//         String cleanedStr=str.replaceAll("\\s", "").toLowerCase();
//         String reversedStr=new StringBuilder(cleanedStr).reverse().toString();
//         return cleanedStr.equals(reversedStr);
//     }
//     public static void main(String[] args) {
//         String input="A man a plan a canal Panama";
//         if(isPalindrome(input)){
//             System.out.println(input+" is a palindrome");
//         }
//         else{
//             System.out.println(input+" is not a palindrome");
//         }
//     }   
// }

// fibonacci series 
// 0,1,1,2,3,5,8,13,21,34,55
// public class Fibonacci{
//     public static void main(String[] args) {
//         int n=10;
//         int first=0;
//         int second=1;
//         System.out.print("Fibonacci series"+ n + "terms ");
//         for(int i=1;i<=n;i++){
//             System.out.print(first+", ");
//             int sum=first+second;
//             first=second;
//             second=sum;
//         }
//     }
// }

// reverse astring without using indexing 
// public class ReverseString{
//     public static void main(String[] args) {
//         String str="Hello!";
//         String reversed="";
//         for(char ch: str.toCharArray()){
//             reversed=ch+reversed;
//         }
//         System.out.println("Original string: "+str);
//         System.out.println("Reversed string: "+reversed);
//     }
// }

// Count the number of vowels and consonants in a string.
// import java.util.Scanner;
// public class VowelConsonentCounter{
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str=scanner.nextLine();
//         str=str.toLowerCase();
//         int vowels=0,consonants=0;
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                 vowels++;
//             }
//             else{
//                 consonants++;
//             }
//         }
//         System.out.println("Number of vowels: "+vowels);
//         System.out.println("Number of consonants: "+consonants);
//         scanner.close();
//     }
// }

//  Find the longest word in a string

// import java.util.Scanner;
// public class LongestWordFinder{
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str=scanner.nextLine();
//         String[] words=str.split("\\s+");
//         String longestWord="";
//         for(String word:words){
//             if(word.length()>longestWord.length()){
//                 longestWord=word;
//             }
//         }
//         System.out.println("The longest word is " + longestWord);
//         scanner.close();
//     }
// }

// multithreading 
// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread is running");
//     }
// }
// public class Main{
//    public static void main(String[] args) {
//     MyThread t1=new MyThread();
//     MyThread t2=new MyThread();
//     t1.start();
//     t2.start();
//    }  
// }

// multiple threading running
// class MyThread extends Thread{
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println(Thread.currentThread().getName()+" - "+i);
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         MyThread t1=new MyThread();
//         MyThread t2=new MyThread();
//         t1.start();
//         t2.start();
//     }
// }

// class MyThread extends Thread{
//     private String name;
//     MyThread(String name){
//         this.name=name;
//     }
//     public void run(){
//         for(int i=1;i<=3;i++){
//             System.out.println(name +"count "+i);
//             try{
//                 Thread.sleep(500);
//             }catch(InterruptedException e){
//                 System.out.println(e);
//             }
//         }
//     }

// }
// public class RunnableExample{
//     public static void main(String[] args) {
//         MyThread t1=new MyThread("THread A");
//         MyThread t2=new MyThread("Thread B");
//         t1.start();
//         t2.start();
//     }
// }
// 1.2e3=>1.2*10*3=>1200

// enums 
// enum Day {
//     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
// }

// public class EnumExample {
//     public static void main(String[] args) {
//         Day today = Day.SUNDAY;
//         System.out.println("Today is " + today);
//     }
// }

// enum with constructor
// enum Size{
//     SMALL(10),MEDIUM(20),LARGE(30);
//     private int value;
//     Size(int value){
//         this.value=value;
//     }
//     public int getvalue(){
//         return value;
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//      System.out.println(Size.SMALL.getvalue());   
//     }
// }

// enum TrafficLight{
//     RED,YELLOW,GREEN;
// }
// public class EnumSwitchExample{
//     public static void main(String[] args) {
//         TrafficLight light=TrafficLight.GREEN;
//         switch(light){
//             case RED:
//                 System.out.println("Stop");
//                 break;
//             case YELLOW:
//                 System.out.println("Caution");
//                 break;
//             case GREEN:
//                 System.out.println("Go");
//                 break;
//             default:
//                 System.out.println("Invalid traffic light color");
//                 break;
//         }
//     }
// }

// enum Status{
//     SUCCESS(200),ERROR(500),NOT_FOUND(404);
//     private int code;
//     Status(int code){
//         this.code=code;
//     }
//     public int getCode(){
//         return code;
//     }
// }
// public class EnumMethodExample{
//     public static void main(String[] args) {
//         Status  s=Status.SUCCESS;
//         System.out.println("Status code: "+s.getCode());
//         System.out.println("Status description: "+s);
//     }
// }

// 
// enum Level{
//     LOW,MEDIUM,HIGH
// }
// public class EnumloopExample{
//     public static void main(String[] args) {
//         for(Level l:Level.values()){
//             System.out.println(l);
//         }
//     }
// }

// class MyThread extends Thread{
//     public void run(){
//         System.out.println("thread running"+Thread.currentThread().getName());
//     }
// }
// public class ThreadExample {
// public static void main(String[] args) {
//     MyThread t1=new MyThread();
//     System.out.println("Main thread"+Thread.currentThread().getName());
//     t1.start();
//     t1.run();
// }
// }

// public class SleepExample{
//     public static void main(String[] args) {
//         System.out.println("start");
//         try{
//             Thread.sleep(2000);
//         }catch(InterruptedException e){
//             e.printStackTrace();
//         }
//         System.out.println("end");
//     }
// }

// enum Direction{
//     SUMMER, FALL, WINTER, SPRING;
// }

// public class EnumExample{
//     public static void main(String[] args){
//         Direction direction = Direction.SUMMER;
//         System.out.println("it is "+direction);
// }
// }

// enum Planet {
//     EARTH(5.972e24),
//     MARS(6.4171e23),
//     JUPITER(1.898e27);

//     private double mass;

//     Planet(double mass) {
//         this.mass = mass;
//     }

//     public double getMass() {
//         return mass;
//     }

//     public static void main(String[] args) {
//         System.out.println(Planet.EARTH.getMass());
//     }
// }


// synchronized
// class SharedResources{
//     synchronized void display(String msg){
//         System.out.println("["+msg);
//         try{
//             Thread.sleep(1000);
//         }
//         catch(Exception e){}
//         System.out.println("]");
//     }
// }
// class MyThread extends Thread{
//     SharedResources obj;
//     String message;
//     MyThread(SharedResources obj,String message){
//         this.obj=obj;
//         this.message=message;
//     }
//     public void run(){
//         obj.display(message);
//     }
// }
// public class SyncExample{
//     public static void main(String[] args) {
//         SharedResources obj=new SharedResources();
//         MyThread t1=new MyThread(obj,"hello");
//         MyThread t2=new MyThread(obj,"world");
//         t1.start();
//         t2.start();
//     }
// }

// class BankAccount {
//     private int balance = 1000;
//     synchronized void withdraw(int amount) { 
//         if (balance >= amount) {
//             System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
//             try { Thread.sleep(1000); } catch (InterruptedException e) {}
//             balance -= amount;
//             System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
//         } else {
//             System.out.println(Thread.currentThread().getName() + " - Insufficient balance!");
//         }
//     }
// }
// class BankTransaction {  
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount();
//         Thread user1 = new Thread(() -> account.withdraw(500), "User1");
//         Thread user2 = new Thread(() -> account.withdraw(300), "User2");
//         user1.start();
//         user2.start();
//     }
// }


// 
// class Counter{
//     private int count=0;
//     public synchronized void increment(){
//         count++;
//     }
//     public int getCount() {
//         return count;
//     }
// }

//  Explain how synchronization works in the following Java program and how it prevents race conditions when multiple threads attempt to withdraw money from a shared 
// bank account
// What will happen if we remove the synchronized keyword from the withdraw method? How does it affect the balance when multiple threads access the account
//  simultaneously?

// class BankAccount {
//     private int balance;

//     public BankAccount(int balance) {
//         this.balance = balance;
//     }

//     public synchronized boolean withdraw(int amount, String threadName) {
//         if (balance >= amount) {
//             System.out.println(threadName + " is withdrawing " + amount);
//             balance -= amount;
//             System.out.println("Balance after " + threadName + "'s withdrawal: " + balance);
//             return true;
//         } else {
//             System.out.println(threadName + " attempted to withdraw " + amount + " but insufficient funds.");
//             return false;
//         }
//     }

//     public int getBalance() {
//         return balance;
//     }
// }

// class WithdrawTask implements Runnable {
//     private BankAccount account;
//     private int amount;
//     private String threadName;

//     public WithdrawTask(BankAccount account, int amount, String threadName) {
//         this.account = account;
//         this.amount = amount;
//         this.threadName = threadName;
//     }

//     @Override
//     public void run() {
//         account.withdraw(amount, threadName);
//     }
// }

// public class BankAccountSimulation {
//     public static void main(String[] args) {
//         BankAccount sharedAccount = new BankAccount(100); 
//         Thread t1 = new Thread(new WithdrawTask(sharedAccount, 50, "Thread 1"));
//         Thread t2 = new Thread(new WithdrawTask(sharedAccount, 70, "Thread 2"));
//         Thread t3 = new Thread(new WithdrawTask(sharedAccount, 30, "Thread 3"));

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

// java networking

// get address of a website
// import java.net.*;
// public class GetIp{
//     public static void main(String[] args) {
//         try{
//             InetAddress address=InetAddress.getByName("amazon.com");
//             System.out.println("IP address: "+address.getHostAddress());
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//     }
// }


// import java.net.*;
// import java.io.*;
// public class SimpleServer{
//     public static void main(String[] args) throws IOException {
//         ServerSocket server = new ServerSocket(5000);
//         System.out.println("Server is running...");
//         Socket socket=server.accept();
//         BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//         String message=in.readLine();
//         System.out.println("Received: "+message);
//         socket.close();
//         server.close();
//     }
// }


// import java.io.*;
// import java.net.*;
// public class DownloadMessage{
//     public static void main(String[] args) {
//         try{
//             URL url=new URL("https://www.flipkart.com");
//             BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
//             String line;
//             while((line=reader.readLine())!=null){
//                 System.out.println(line);
//             }
//             reader.close();
//         }catch(Exception e){
//             e.printStackTrace();}}
// }

// simple chat program

// import java.io.*;
// import java.net.*;
// public class ChatServer{
//     public static void main(String[] args) {
//         try(ServerSocket serverSocket=new ServerSocket("localhost",6000)){
//             System.out.println("Chat Server is running...");
//             Socket socket=serverSocket.accept();
//             System.out.println("Connected connected");
//             BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
//             PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);
//             BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
//             String serverMessage,clientMessage;
//             while((serverMessage=reader.readLine())!=null){
//                 System.out.println("server:"+serverMessage);
//                 clientMessage=userInput.readLine();
//                 writer.println(clientMessage);
//                 if(clientMessage.equalsIgnoreCase("bye")) break;
//             }
//         }catch(IOException e){
//             e.printStackTrace();
//         }
//     }
// }


// import java.io.*;
// import java.net.*;

// public class ChatServer {
//     public static void main(String[] args) {
//         try (ServerSocket serverSocket = new ServerSocket(6000)) {  // Fixed: No IP
//             System.out.println("Chat Server is running... Waiting for clients to connect...");

//             Socket socket = serverSocket.accept();  // Accept client connection
//             System.out.println("Client connected!");

//             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
//             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

//             String clientMessage, serverMessage;
//             while (true) {
//                 clientMessage = reader.readLine();  // Read from client
//                 if (clientMessage == null || clientMessage.equalsIgnoreCase("bye")) break;
//                 System.out.println("Client: " + clientMessage);

//                 System.out.print("You: ");
//                 serverMessage = userInput.readLine();  // Get user input
//                 writer.println(serverMessage);  // Send message to client

//                 if (serverMessage.equalsIgnoreCase("bye")) break;
//             }

//             socket.close();  // Close connection
//             System.out.println("Chat Server closed.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

