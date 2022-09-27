#include<iostream>
using namespace std;

//* Creating Struct for the Example
struct Student{string Name; string Address; int Enrollment;};
//* Creating Struct for the Example

int main(){
    int n;
    int search;
    cout<<"Enter the No. Students you want to List Down: ";
    cin>>n;
    Student List[n];

    //* Taking User Input for Student Data
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
    //* Taking User Input for Student Data

    //* Taking User Input for Student Data
    while(search<=n){
        cout<<"Enter the Student number You want to Find Or Press ctrl+C: ";
        cin>>search;
        cout<<endl;
        if(search>n){
            break;
        }
        cout<<"Name: "<<List[search-1].Name<<endl;
        cout<<"Address: "<<List[search-1].Address<<endl;
        cout<<"Enrollment: "<<List[search-1].Enrollment<<endl;
        cout<<endl;
    }
    //* Taking User Input for Student Data
}