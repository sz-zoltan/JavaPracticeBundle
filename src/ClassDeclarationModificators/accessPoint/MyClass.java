package ClassDeclarationModificators.accessPoint;

//import ClassDeclarationModificators.defaultClass.DefaultClass;
import ClassDeclarationModificators.abstractClass.AbstractClass;
import ClassDeclarationModificators.finalClass.FinalClass;
import ClassDeclarationModificators.publicClass.PublicClass;


/** Acces (visibility) modifiers (public, private, protected)
    Nonaccess modifiers (abstract, final, strictfp) */
public class MyClass {
    /** Default Classes can be accessed from THEIR package */
//    DefaultClass defaultClass = new DefaultClass();

    /** Public classes can be accessed from anywhere from the project */
    PublicClass publicClass = new PublicClass();

    /** Final classes can never be inherited */
    FinalClass finalClass = new FinalClass();
//    public class InheritedFinalClass extends FinalClass {}

    /** Abstract classes can never be inatantiated, they must always be inherited */
//    AbstractClass abstractClass = new AbstractClass();
    public class InheritedAbstractClass extends AbstractClass {}
}


//public class PublicClass{}

//Private class
