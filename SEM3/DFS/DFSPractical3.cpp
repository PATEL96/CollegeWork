#include<iostream>
using namespace std;
#define MAX 10

//* Declaring global Variables
int a[MAX], Top = -1;
//* Declaring global Variables

//* PUSH Function For Stack
void Push(){
    int data;
    if(Top==MAX-1){
        cout<<"!!Stack Overflow!!"<<endl;
    } else {
        cout<<"Enter the Element: ";
        cin>>data;
        Top++;
        a[Top] = data;
    }
}
//* PUSH Function For Stack

//* POP Function For Stack
void Pop(){
    if(Top==-1){
        cout<<"!!Stack Underflow!!"<<endl;
    } else {
        cout<<"POP or DELETE Element: "<<a[Top]<<endl;
        Top--;
    }
}
//* POP Function For Stack

//* DISPLAY Function For Stack
void Display(){
    int i;
    if(Top>=0){
        cout<<"Elements: ";
        for(i = Top; i>=0;i--){
            cout<<a[i]<<" ";
        }
        cout<<endl;
    } else {
        cout<<"!!Stack is EMPTY!!"<<endl;
    }
}
//* DISPLAY Function For Stack

//* PEEP Function For Stack
void Peep(){
    if(Top<=-1){
        cout<<"!!Stack is EMPTY!!"<<endl;
    } else {
        cout<<"The Element is: "<<a[Top]<<endl;
    }
}
//* PEEP Function For Stack

int main(){
    //* while loop Used So that the Program keeps Runnig and Stores Data
    while (1){
        int opt;
        cout<<endl;
        cout<<"1 ==> PUSH Element."<<endl;
        cout<<"2 ==> POP Element."<<endl;
        cout<<"3 ==> PEEP Element."<<endl;
        cout<<"4 ==> DISPLAY Stack."<<endl;
        cout<<"5 ==> Exit Program."<<endl;

        cout<<endl;
        cout<<"Enter your Option: ";
        cin>>opt;
        cout<<endl;

        switch(opt){
            case 1:
                Push();
                break;
            case 2:
                Pop();
                break;
            case 3:
                Peep();
                break;
            case 4:
                Display();
                break;
            case 5:
                cout<<"Exiting Program!!"<<endl;
                break;
            default:
                cout<<"!!Invalid Option!!"<<endl;
                break;
        }

        //* If Statement Used hre Defines the Smooth Exit of Program
        if(opt==5){
            break;
        }
    }
}