package Pack;

public class Student {
    //成员变量
    private String name;
    private int age;
    private String gender;
    private int ID;
    //构造方法
    public Student(String name){
        this.name = name;
    }

    public void setName(String names){
        name = names;
    }

    public void setAge(int ages){
        age = ages;
    }

    public void setGender(String genders){
        gender = genders;
    }

    public void setID(int IDs){
        ID= IDs;
    }

    public String getName(){
        System.out.println("学生的名字是 : " + name  );
        return name;
    }

    public int getAge(){
        System.out.println("学生的年龄是 : " + age  );
        return age;
    }

    public String getGender(){
        System.out.println("学生的性别是 : " + gender  );
        return gender;
    }

    public int getID(){
        System.out.println("学生的学号是 : " + ID  );
        return ID;
    }

    public static void main(String [] args){

    }
}
