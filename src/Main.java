public class Main {
    public static void main(String[] args) {


        MyClass myClass = new MyClass("Yryskeldi","Alymbekov",(byte)  16 , new String [] {"java","English"},"Manty");


        MyClass myClass1 = new MyClass( (byte) 16 ,"Altynbek","Shakirov","cake" , new String [] {"Java","English"} );


                MyClass [] array = {myClass};

        MyClass[] array1 = {myClass1};

         for (MyClass a : array) {
            a.getInfo();
            System.out.println("_______________________________________________________________");

        }
        for (MyClass b: array1) {
            b.getInfo1();
            System.out.println("_______________________________________________________________");

        }







    }
}