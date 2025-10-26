import java.util.*;
import java.io.*;
class Parent {
    void show() throws IOException {
        throw new IOException("Parent Exception");
    }
}

class Child extends Parent {
    @Override
    void show() throws Exception {  
        throw new Exception("Child Exception");
    }
}
class ExceptionDemo{
	public static void main(String args[]){
	 Child c = new  Child();
	 c.show();
	}
}