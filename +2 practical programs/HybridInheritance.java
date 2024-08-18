//31.Hybrid Inheritance
class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A{
    void show(){
        System.out.println("Show method of class B");
    }
}
class C extends A{
    void show(){
        System.out.println("Show method of class C");
    }
}
class D extends B{
    void show(){
        System.out.println("Show method of class D");
    }
}

class HybridInheritance {
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}