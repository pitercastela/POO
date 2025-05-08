package control;

import model.B;
import model.F;
import view.C;

public class A {
    String aa1; // "~aa1" (package)
    private String aa2; // "-aa2"
    public String aa3; // "+aa3"
    protected String aa4; // "#aa4"

    private A a;

    public void testeA(){
        A a1 = new A();
        A a2 = new A();
        a1.a = a2;
        //a1.a. pode ver os atributos de a2 inclusive os privados
    }

    public void testeB(){
        B b = new B();
        //b.
    }
    public void testeC(){
        C c = new C();
        //c.
    }
    public void testeE(){
        F f = new F();
        f.
    }
    public void testeF(){
        E e = new E();
        //e.
    }
}
