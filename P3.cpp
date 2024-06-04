//Que_14 , Count Notes for n rupees
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter no of rupees";
    cin>>n;
    int h=n/100;
    int f=(n-(h*100))/50;
    int t=(n-(h*100+f*50))/20;
    int o=(n-(h*100+f*50+t*20))/1;
    char option;
    cout<<"Enter 'h' for count note : ";
    cin>>option;
    switch(option){
        case 'h':cout<<"Note of hundred : "<<h<<endl;
        
        case 'f':cout<<"Note of fifty : " <<f<<endl;

        case 't':cout<<"Note of twenty : "<<t<<endl;

        case 'o':cout<<"Note of one : "<<o<<endl;


    }

}