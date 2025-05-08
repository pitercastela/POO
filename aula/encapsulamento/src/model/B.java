package model;

import control.A;
import view.C;

public class B {
    String ba1; // "~ab1"
    private String ba2; // "-ab2" (package)
    public String ba3; // "+ab3"
    protected String ba4;  // "#ab4"


    public void testeA(){
        A a = new A();
        //a. aa3
    }

    public void testeC(){
        C c = new C();
        //c. ca3
    }
}
