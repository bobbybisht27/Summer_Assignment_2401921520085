public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kid = new KidUsers(10, "Kids");
        kid.registerAccount();
        kid.requestBook();
        KidUsers kid = new KidUsers(18, "Fiction");
        kid.registerAccount();
        kid.requestBook();

        AdultUsers adult = new AdultUsers(5, "Kids");
        adult.registerAccount();
        adult.requestBook();
        AdultUsers adult = new AdultUsers(23, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}