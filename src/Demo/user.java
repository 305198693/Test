package Demo;

public class user {
    Exceptiondemo exceptiondemo = new Exceptiondemo("我草这也太牛逼了吧！！！！");
    void display(int a) throws Exceptiondemo {
        if(a>10){
            throw exceptiondemo;
        }
    }
}
