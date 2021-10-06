class BankTester{
public static void main(String a[]){
Bank1 ban=new Iob();
ban.provideLoans(7.5);

System.out.println(ban);

Bank1 bank=new SBI();
bank.provideLoans(6.5);

System.out.println(bank);
Bank1 bank1=new Hdfc();
bank1.provideLoans(8.5);

System.out.println(bank1);

System.out.println(bank);
Bank1 bank2=new Karnataka();
bank1.provideLoans(5.5);

System.out.println(bank2);
Bank1 bank3=new ICICI();
bank1.provideLoans(11.5);

System.out.println(bank3);
Bank1 bank4=new IDBI();
bank1.provideLoans(11.5);

System.out.println(bank4);


}
}