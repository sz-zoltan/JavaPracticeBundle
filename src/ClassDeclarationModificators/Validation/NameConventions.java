package ClassDeclarationModificators.Validation;

public class NameConventions {
    /* Legal variable formats */
    int _a, $c, ______2_w, this_is_a_very_detailed_name_for_an_identifier;
    /* Illegals variable formats */
//    int :b;
//    int -d;
//    int e#;
//    int .f;
//    int 7g;
//   int break; //Watch out for keywords, they cannot be variable names

    /* Classes use upper cases */
    public class ThisIsAClassName{}
    /* Methods first lower case, then all upper cases */
    public void andThisIsAMethodName(){}
    /* Variables are like methods */
    public int aVariableName;
    /* Constants are full upper cases */
    public static final int CONSTANT_NAME = 0;
}
