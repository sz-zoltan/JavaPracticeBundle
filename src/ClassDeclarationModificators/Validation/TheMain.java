package ClassDeclarationModificators.Validation;

public class TheMain {
    public static void main(String[] args){
        System .out.println(args[0] + " " + args[1]);
    }
    /* Followings are equivalent */
//    public static void main(String args[]){
//        System .out.println(args[0] + " " + args[1]);
//    }
//    public static void main(String... args){
//        System .out.println(args[0] + " " + args[1]);
//    }
}
