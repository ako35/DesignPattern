package CreationalDP.SingletonDP;

public class SingletonPatternDemo {

    public static void main(String[] args) {

//        SingletonObject obj1=new SingletonObject();
//        SingletonObject obj2=new SingletonObject();

        SingletonObject obj3=SingletonObject.getInstance();
        System.out.println("obj3 icin: ");
        System.out.println(obj3.message);
        obj3.changeMessage();

        SingletonObject obj4=SingletonObject.getInstance();
        System.out.println("obj4 icin: ");
        System.out.println(obj4.message);



    }

}
