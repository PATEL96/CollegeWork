#include<iostream>
using namespace std;

int main(){
    int elements, temp;
    cout<<"Enter total no of Elements: ";
    cin>>elements;

    int a[elements];

    for(int i = 0;i<elements;i++){
        cout<<"Enter Element "<< (i + 1)<<": ";
        cin>>a[i];
    }

    //Insertion Sort Methods

    for(int i = 1 ; i<=elements - 1;i++){
        for(int j = i;j>0 && a[j-1] > a[j];j--){
            temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
        }
    }

    //Insertion Sort Methods

    cout<<"After Insertion Sort: ";
    for(int i = 0;i < elements; i++){
        cout<<a[i]<<" ";
    }
}