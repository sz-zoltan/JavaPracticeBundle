package ClassDeclarationModificators.declareClassMembers.accessModifiers;

public class Moo {
    public void useAZoo(){
        Zoo z = new Zoo();
        // If the preceding line compiles, Moo has access to the Zoo class
        //But does it have access to the CoolMethod()?
        System.out.println("A Zoo says, " + z.coolMethod());
        // The preceding line works because Moo can access the public method
    }
}
