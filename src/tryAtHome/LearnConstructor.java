package tryAtHome;

public class LearnConstructor {
    String name;
    int age;

    //public LearnConstructor() {
       // System.out.println("Default Constructor");

   // }
    public LearnConstructor(String name, int age){
        this.name=name;
        this.age=age;
    }


    public static void main(String[] args) {
        //LearnConstructor obj= new LearnConstructor();
        //LearnConstructor obj1= new LearnConstructor(10,20);
        LearnConstructor obj = new LearnConstructor("Munna", 10);
        System.out.println(obj.name);
        System.out.println(obj.age);
        LearnConstructor obj1 = new LearnConstructor("sunna", 20);
        LearnConstructor obj2 = new LearnConstructor("manna", 30);
        System.out.println(obj1.name +"  "+ obj1.age);
        System.out.println(obj2.name +"  "+ obj2.age);

    }








}
