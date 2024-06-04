//Que_16 , Factorial of a number
#include<iostream>

using namespace std;

int fact(int n)
{
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        
        fact=fact*i;
    }
    return fact;
}
int main()

{
    int r=2,n=8;
    
    int ans=(fact(n))/(fact(n-r)*fact(r));
    cout<<ans;
}