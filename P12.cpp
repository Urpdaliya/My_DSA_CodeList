//Que_11 , Pattern 11
#include<iostream>

using namespace std;

int main()
{
    int i=1,n=5;
    while(i<=n)
    {
        int j=1;
        int c=1;
        //1st triangle
        while(j<=n-i+1)
        {
            cout<<j<<" ";
            j=j+1;
            c=c+1;

        }
        
        
        int k=1;
        while(k<=i-1)
        {
            cout<<"* ";
            k=k+1;

        }
        int y=1;
        while(y<=i-1)
        {
            cout<<"* ";
            y=y+1;

        }
        int x=5;
        while(x>=i)
        {
            cout<<x-i+1<<" ";
            x=x-1;
        }
        cout<<endl;
        i=i+1;
    }
}