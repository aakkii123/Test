class Bank
{
int balance;
void balance()
{
System.out.println("The current balance in your account is "+balance);
}
void deposit(int d)
{
balance=balance+d;
System.out.println("you have deposited "+d+"Rs");
balance();
}
void withdraw(int w)
{
balance=balance-w;
System.out.println("you have withdrawn "+w+"Rs");
balance();
}
public static void main(String[] args)
{
System.out.println("welcome to Axis bank");
Bank rv= new Bank();
rv.balance();
System.out.println("Transaction Details");
rv.deposit(1000);
System.out.println("Transaction Details");
rv.withdraw(500);
System.out.println("Transaction Details");

}
}