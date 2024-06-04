//Que_19 , linear search
#include<iostream>
using namespace std;

int main()
{
    int find;
    cout<<"Enter number for searching : ";
    cin>>find;
    int arr[5]={1,-9,5,7,4};
    for(int i=0;i<5;i++)
    {
        
        if(arr[i]==find)
        {
            cout<<"Index number of this number : "<<i;
        }
    }
}