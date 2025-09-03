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
public interface Calculator {
        int add(int a, int b);
}
public class LmabdaExample{
        public static void main(String[] args) {
                Calculator add->a+b;
                Calculator mult
}