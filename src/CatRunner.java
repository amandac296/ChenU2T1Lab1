public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Tommy", 5, 15.4);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Katy", 5, 10.4);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
