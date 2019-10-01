public enum TypesOfAccount {
    ADULT, KID, PREMIUM;

    public void printName(){
        System.out.println(this.name());
    }
    public static void main(String[] args) {
        TypesOfAccount AD = TypesOfAccount.ADULT;
        AD.printName();
    }
}
