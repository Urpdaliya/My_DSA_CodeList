//Que_10 , Pattern 10
#include<iostream>

using namespace std;

int main()
{
    int i=1,n=4;
    while(i<=n)
    {
        int s=n-i;
        while(s)
        {
            cout<<" ";
            s=s-1;
        }
        int k=1;
        while(k<=i)
        {
            cout<<"*";
            k=k+1;
        }
        i=i+1;
        cout<<endl;


    }
}