//30.Hierarchical Inheritance
class Animal {
    void animal() {
        System.out.println("This is a animal");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bhau bhau....");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meaon Meaon....");
    }
}

class Human extends Animal {
    void sound() {
        System.out.println("Httt... sale");
    }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Human h = new Human();

        System.out.println("Dog: ");
        d.animal();
        d.sound();
        System.out.println("Cat: ");
        c.animal();
        c.sound();
        System.out.println("Human");
        h.animal();
        h.sound();
    }
}