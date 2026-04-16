class AnimalML {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class DogML extends AnimalML {
    public void sound(){
        System.out.println("Dog is barking");
    }
}
class CatML extends DogML {
    public void hello(){
        System.out.println("Cat Meows");
    }
}
@SuppressWarnings("unused")
class multilevelinheritance {
    public static void main(String[] args) {
        CatML c = new CatML();
        c.eat();
        c.sound();
        c.hello();
    }
}