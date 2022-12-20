/*
4.What will be the output on new Child(); ? 
 class Parent extends Grandparent {
 
 {
 System.out.println("instance - parent");
 }
 public Parent() {
 System.out.println("constructor - parent");
 }
 static {
 System.out.println("static - parent");
 }
 }
 class Grandparent {
 
 static {
 System.out.println("static - grandparent");
 }
 {
 System.out.println("instance - grandparent");
 }
 public Grandparent() {
 System.out.println("constructor -
grandparent");
 }
 }
 class Child extends Parent {
 public Child() {
 System.out.println("constructor - child");
 }
 static {
 System.out.println("static - child");
 }
 {
 System.out.println("instance - child");
 }
 }
*/

public class Ass1_4 {
	public class Parent extends Grandparent {
		{
			System.out.println("instance - parent");
		}

		public Parent() {
			System.out.println("constructor - parent");
		}

		static {
			System.out.println("static - parent");
		}
	}

	public class Grandparent {
		static {
			System.out.println("static - grandparent");
		}
		{
			System.out.println("instance - grandparent");
		}

		public Grandparent() {
			System.out.println("constructor - grandparent");
		}
	}

	public class Child extends Parent {
		public Child() {
			System.out.println("constructor - child");
		}

		static {
			System.out.println("static - child");
		}
		{
			System.out.println("instance - child");
		}
	}

	public static void main(String args[]) {
		Child obj = new Child();
		obj.Child();
		System.out.println();
	}
}
