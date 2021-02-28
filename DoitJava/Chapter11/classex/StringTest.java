package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		
		Class strClass = Class.forName("java.lang.String");
		
		
		//Constructor 불러오기
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c: cons) 
			System.out.println(c);
		
		//field 불러오기
		Field[] fields = strClass.getFields();
		
		for(Field f : fields) 
			System.out.println(f);
		
		
		//method 불러오기
		Method[] methods = strClass.getMethods();
		
		for(Method m : methods) 
			System.out.println(m);
		
		
		
		Person p = new Person();
		
		Class pClass = Class.forName("classex.Person");
		
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p);
		System.out.println(p2);
	}

}
