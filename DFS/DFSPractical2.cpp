#include<iostream>
using namespace std;

struct Student{string Name; string Address; int Enrollment;};

int main(){
    int n;
    int search;
    cout<<"Enter the No. Students you want to List Down: ";
    cin>>n;
    Student List[n];

    for(int i = 0;i<n;i++){
        cout<<endl;
        cout<<"Enter Name of Student "<<i+1<<" : ";
        cin>>List[i].Name;
        cout<<"Enter Address of Student "<<i+1<<" : ";
        cin>>List[i].Address;
        cout<<"Enter Enrollment No. of Student "<<i+1<<" : ";
        cin>>List[i].Enrollment;
        cout<<endl;
    }

    while(search<=n){
        cout<<"Enter the Student number You want to Find Or Press ctrl+C: ";
        cin>>search;
        cout<<endl;
        cout<<"Name: "<<List[search-1].Name<<endl;
        cout<<"Address: "<<List[search-1].Address<<endl;
        cout<<"Enrollment: "<<List[search-1].Enrollment<<endl;
        cout<<endl;
    }
}