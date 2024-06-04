//Que_15 , Find even or odd
#include<iostream>

using namespace std;
bool isEven(int n)
{
    if(n&1)
    {
        return true;
    }
    return false;
}
int main()
{
    int n;
    cout<<"Enter number";
    cin>>n;
    int a=isEven(n);
    
    if (a==1)
    {
        cout<<"This is odd number";
    }
    else{
        cout<<"This is even number";

    }
    
    
}