// import java.util.*;
// class p extends Thread {
	 // void main() throws Exception{
		
		// Thread t1 = new Thread(()->{
			// for(int i=0;i<100;i++ ){
				// IO.println("from T1 -" + i);
			// }
		// });
		// Thread t2 = new Thread(()->{
			// for(int i=0;i<100;i++ ){
				// IO.println("from T2 -" + i);
			// }
		// });
		// t1.start();
		// t1.join();
		// t2.start();
		// t2.join();
		// Thread t = new Thread(() -> {
			// System.out.println("Running...");
		// });

		// t.start();
		// t.join();

		// System.out.println("Done");
	 // }
// }


// class A {
	// private static A a;
	
	// public A returnO() {
		// if(a == null) {
			// return new A();
		// }
		// return a;
	// }
// }
// String s1 = "Java";
// String s2 = "Java";

// System.out.println(s1 == s2);
// System.out.println(s1.equals(s2));

		// List<Integer>list = new ArrayList<>();
		// list.add(10);
		// list.add(20);
		// list.add(30);
		
		// Iterator it = list.iterator();
		
		// while(it.hasNext()) {
			// if(it.next()==10) list.add(10);
		// }
					// IO.println(it.next());
	 // }
	  // HashSet<Employee> set = new HashSet<>();
	 
	// set.add(new Employee(2,"Pravin"));
	// set.add(new Employee(3,"Saurabh"));
	// set.add(new Employee(3,"Saurabh"));
	// set.add(new Employee(3,"Saurabh"));
	// set.add(new Employee(3,"changed"));
	// Employee e1 = new Employee(1, "A");
	// Employee e2 = new Employee(1, "B");

	// set.add(e1);
	// set.add(e2);
	
	// IO.println(set); 
// }
// }



// class Employee {
	
    // int id;
    // String name;
	
	// Employee(int id,String name) {
		// this.id = id;
		// this.name = name;
	// }
	// @Override
	// public String toString() {
		// return id + "->" + name;
	// }
	// @Override 
	// public int hashCode() {
		// return id;
	// }
	
	// @Override
	// public boolean equals(Object obj) {
		// Employee e = (Employee) obj;
		// return e.id == this.id;
	// }
// }

// class User {
	// private static User i;
	// public static User getUser()  {
	// if(i == null) {
		// i = new User();
		// }
	// return i;
	// }
// }

// class Student {
	
// }
// import java.util.*;
// class p {
	// void main () {
		// User u = User.getUser();
		// User u2 = User.getUser();
		// int first = u.hashCode();
		// int second = u2.hashCode();
		
		// IO.println(u==u2);
		// IO.println(first + " " + second);
		// List<Integer> list = new ArrayList<>(List.of(3,4,5,7));
			
		// Iterator<Integer> i = list.iterator();
		// while(i.hasNext()) {
			// IO.println(i.next());
		// }
	// }
// }


// class Node {
	// int val;
	// Node head;
	
	// Node(int val,Node head) {
		// this.val = val;
		// head.next = null;
	// }
// }
// class p {
	// void main() {
		// Node head;
		
		// public void insertAtHead(int val) {
        // Node newNode = new Node(val);
        // newNode.next = head;
        // head = newNode;
		// }
		// insertAtHead(10);
		// insertAtHead(30);
		// insertAtHead(58);
		
		// public void print(Node head) {
			// while(head!= null) {
				// IO.println(head.val);
			// }
		// }
	// }
// }

class Node {
    int val;
    Node next; // Points to the next node, not head

    // Constructor creates a standalone node
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class p {
    // Head must be an instance/class variable, not a local method variable
    Node head; 

    // Methods belong to the class body, not inside main()
    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void print(Node current) {
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next; // Move to the next node to avoid an infinite loop
        }
        System.out.println("null");
    }
	
	public Node reverse(Node head) {
		Node curr = head;
		while(curr != null) {
			
		}
	}

    // Execution driver method
    void main() {
        insertAtHead(10);
        insertAtHead(30);
        insertAtHead(58);
        
        print(head); // Output will be: 58 -> 30 -> 10 -> null
    }
}
