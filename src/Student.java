public class Student {

    private String name;
    private byte age;
    private short write;



    public Student (String name,byte age, short write){

            this.name = name;
            this.age = age;
            this.write = write;

    }

    void setName(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
    void setAge(byte age){
        this.age = age;
    }

    public byte getAge() {
        return age;
    }
    void setWrite(short write){
        this.write = write;
    }

    public short getWrite() {
        return write;

        }
//        public void getInfo1(){
//            System.out.printf("""
//                    Name: %s
//                    age: %s
//                    write: %s
//                    """,getName(),getAge(),getWrite());
//        }

    }