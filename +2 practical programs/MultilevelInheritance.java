//17.Multilevel Inheritance 
class A {
    void showA() {
        System.out.println("show menthod of class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("show menthod of class B");
    }
}

class C extends B {
    void showC() {
        System.out.println("show menthod of class C");
    }
}

class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}