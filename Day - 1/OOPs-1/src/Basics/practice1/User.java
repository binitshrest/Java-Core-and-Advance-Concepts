package Basics.practice1;

public class User {
    private int userId;
    String userName;
    protected String email;
    protected Boolean isEighteen;
    void doSomething(int uId){
        this.userId = uId;
        System.out.println("User Id is: "+ userId);
    }
    private void doSomething2(int uId){  // private method are allow to work in same class only
        this.userId = uId;
        System.out.println("User Id is: "+ userId);
    }

}
