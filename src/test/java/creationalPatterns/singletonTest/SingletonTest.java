package creationalPatterns.singletonTest;

import org.junit.Test;

import creationalPatterns.singleton.Singleton;

public class SingletonTest {

    @Test
    public void singletonTest() {
	Singleton s1 = Singleton.getSingletonIstance();
	Singleton s2 = Singleton.getSingletonIstance();
	Singleton s3 = Singleton.getSingletonIstance();
	Singleton s4 = s2;
	Singleton s5 = s4;
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println(s3.toString());
	System.out.println(s4.toString());
	System.out.println(s5.toString());
    }
}
