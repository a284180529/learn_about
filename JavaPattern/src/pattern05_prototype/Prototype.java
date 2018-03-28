package pattern05_prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	
	private TestClass name;
	private int id;
	
	public Prototype(TestClass name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// 将一个对象作为原型，对其进行复制、克隆，产生一个新的对象。适用直接创建对象代价比较大的情形，比如数据库操作
	
	public Prototype clone() throws CloneNotSupportedException {
		// 浅复制，基本类型的变量会重新创建，引用类型的变量还指向原对象所指向的地址
		return (Prototype) super.clone();
	}
	
	public Prototype deepClone() throws IOException, ClassNotFoundException {
		// 深复制，基本类型的变量和引用类型的变量都会重新创建
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		Prototype prototype = (Prototype) ois.readObject();
		return prototype;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Prototype prototype = new Prototype(new TestClass(), 123);
		System.out.println(prototype);
		System.out.println(prototype.clone());
		System.out.println(prototype.deepClone());
	}

	@Override
	public String toString() {
		return "Prototype [name=" + name + ", id=" + id + "]";
	}
	
	private static class TestClass implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
	}

}
