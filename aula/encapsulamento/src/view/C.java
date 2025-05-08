package view;

import control.A;
import model.B;

public class C {

    String ca1; // "~ac1" (package)
    private String ca2;  // "-ac2"
    public String ca3; // "+ac3"
    protected String ca4; // "#ac4"

    public void testeA(){
        A a = new A();
        //a. aa3
    }
    public void testeB(){
        B b = new B();
        //b. bb3
    }

}
