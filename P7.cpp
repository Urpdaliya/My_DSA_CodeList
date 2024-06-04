//Que_18 , Sum of number in array
#include<iostream>

using namespace std;

int main()
{
    int arr[5];
    int sum=0;
    int i;
    cout<<"enter number : ";
    for(i=0;i<5;i++)
    {
        
        cin>>arr[i];
        sum=sum+arr[i];
        
        
    }
    
    cout<<"Sum of array number is : "<<sum;
    
}