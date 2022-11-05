import java.util.Arrays;

public class MyClass {

    private  String name;
    private String sureName;
    private byte age;
    private String []courses;
    private String yourFavoriteFood;



    public  MyClass(String name,String sureName,byte age,String [] courses,String yourFavoriteFood){
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.courses = courses;
        this.yourFavoriteFood = yourFavoriteFood;
    }

    public  MyClass(byte age, String name, String sureName, String yourFavoriteFood, String[] courses){
        this.age = age;
        this.name = name;
        this.sureName = sureName;
        this.yourFavoriteFood = yourFavoriteFood;
        this.courses = courses;
    }






//    void setName (String name){
//        this.name = name;
//    }
    public String getName (){
        return name;
    }
//    void setSureName(String sureName){
//        this.sureName = sureName;
//    }
    public String getSureName(){
        return sureName;
    }
//    void setAge (byte age){
//        this.age = age;
//    }
    public byte getAge(){
        return age;
    }
//    void setCourses(String []courses){
//        this.courses = courses;
//    }
    public String [] getCourses(){
        return courses;
    }
//    void setYourFavoriteFood(String yourFavoriteFood){
//        this.yourFavoriteFood = yourFavoriteFood;
//    }
    public String getYourFavoriteFood(){
        return yourFavoriteFood;
    }
    public void getInfo(){
        System.out.printf("""
                Name: %s
                SureName: %s
                age: %s
                Courses: %s
                yourFavoriteFood: %s
                
                """,getName(),getSureName(),getAge(), Arrays.toString(getCourses()),getYourFavoriteFood());
    }

}
