#include<iostream>
#include<cstring>
using namespace std;
class Bank
{
    public:
    string name = "safu";
    int acc_no = 2192;
    float balance = 100000;
    
    void display ()
    {
        cout<<" Account no : "<<acc_no<<endl;
        cout<<" Name of account holder : "<<name;
        cout<<"\n Your balance is : "<<balance;
    }
    
    void deposit (int n)
    {
        balance = balance + n;
        cout<<" Deposit ammount after update : "<<balance;
    }
    
    void withdraw (int n)
    {
        balance = balance - n;
        cout<<" withedrawl ammount after update : "<<balance;
    }
};

int main()
{
    int choice,n;
    cout<<" Enter 1 for Display details. \n Emter 2 for Deposit.\n Enter 3 for Withedrawl."<<endl;
    cout<<" Enter the number you like (1,2,3) : ";
    cin>>choice;
    Bank b;
    switch(choice)
    {
    
        case 1 :
        b.display();
        break;
    
        case 2 :
        cout<<" Enter the value you like to deposit : ";
        cin>>n;
        b.deposit(n);
        break;
    
        case 3 :
        cout<<" Enter the value you like to withedrawl : ";
        cin>>n;
        b.withdraw(n);
        break;
    
        default :
        cout<<"Invalid data.";
    }
    return 0;
}
    
