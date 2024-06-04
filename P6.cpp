//Que_16 , Find max and min in a array
#include<iostream>
#include<climits>

using namespace std;

int main()
{
    int ans = INT_MIN;
    int a=INT_MAX;
    int arr[4]={1,-2,34,-22};
    for(int i=0;i<4;i++)
    {
        if(arr[i]<a)
        {
            a=arr[i];
        }
        
        if(arr[i]>ans)
        {
            
            ans=arr[i];
        }
        
        
    }
    cout<<"Max value : "<<ans<<endl;
    cout<<"Min value : "<<a;
}