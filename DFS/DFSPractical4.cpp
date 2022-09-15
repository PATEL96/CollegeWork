#include<iostream>
#define MAX 10
using namespace std;

int a[MAX],Front = -1, Rear = -1, deleteIndex = 0;

void Display(){
    int i;
    if(Front == -1 || Rear == -1 || deleteIndex == MAX || deleteIndex > Rear){
        cout<<"!!Queue Empty!!"<<endl;
    } else {
        for(i = deleteIndex;i<=Rear; i++){
            cout<<a[i]<<" ";
        }
        cout<<endl;
    }
}

void QInsert(){
    int data;
    Front = deleteIndex;
    if(Rear >= MAX -1){
        cout<<"!!Queue Overflow!!"<<endl;
    } else {
        Rear++;
        cout<<"Enter Element To Insert: ";
        cin>>data;
        a[Rear] = data;
        Display();
    }
}

void QDelete(){
    if(deleteIndex==MAX || deleteIndex>Rear){
        cout<<"!!Queue Underflow!!"<<endl;
        Front = -1;
        Rear = -1;
        deleteIndex = 0;
    } else {
        cout<<"Deleted Item: "<< a[deleteIndex]<<endl;
        deleteIndex++;
        Display();
    }
}


int main(){
    int opt;

    while(1){
        cout<<"1 ==> Insert Element."<<endl;
        cout<<"2 ==> Delete Element."<<endl;
        cout<<"3 ==> Exit Program."<<endl;
        cout<<"Enter Option: ";
        cin>>opt;
        switch(opt){
            case 1:
                QInsert();
                break;
            case 2:
                QDelete();
                break;
            case 3:
                cout<<"!!Exiting Program!!"<<endl;
                break;
            default:
                cout<<"!!INVALID OPTION!!"<<endl;
                break;
        }
        if(opt>=3){
            break;
        }
    }
}