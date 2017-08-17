package ClassDeclarationModificators.Interfaces;

public abstract interface InterfaceSample {
    public static final int BAR = 42;
    public abstract void redundantMethod();
    void sameMethodAsPreviousOne();
//    final void finalMethodWontCompile();
//    static void staticMethodWontCompile();
//    private void alwaysPublic();
//    protected void alwaysPublicToo();
}
