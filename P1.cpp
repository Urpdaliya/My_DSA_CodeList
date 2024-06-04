//Que_12 , Reverse digits of a number
#include<iostream>
using namespace std;

int main()
{
    int n=123;
    int d,ans=0;
    while(n!=0)
    {
        d=n%10;
        ans=((ans*10)+(d));
        
        n=n/10;
        
        
    }
    cout<<"Reverse digit in number : ";
    cout<<ans;
    return 0;
}
