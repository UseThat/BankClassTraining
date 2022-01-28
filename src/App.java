public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Nate";
        person.lastName ="ote";
        person.pesel = "1234";

        Address address1 = new Address();
        Address address2 = new Address();
        address1.city = "Okla";
        address1.person = person;
        address2.person = person;
        address2.city = "Koror";

        BankAccount bank = new BankAccount();
        bank.owner = person;
        bank.correspondenceAddress = address1;
        bank.checkInAddress = address2;
        bank.accountBalance = 23451.44;

        System.out.println(bank.owner.firstName +" "+bank.owner.lastName + " "+bank.checkInAddress.city+" "+bank.accountBalance);

    }
}
