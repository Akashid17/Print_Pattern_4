
#include<iostream>

using namespace std;

class PatternX
{
    public:
        void Display(int);
};

void PatternX::Display(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    do
    {
        cout<<iNo<<"\t#\t";
    
        iNo--;
    }while(iNo > 0);

    cout<<endl;
}

int main()
{
    int iValue = 0;

    cout<<"Enter Number\n";
    cin>>iValue;

    PatternX pobj;
    pobj.Display(iValue);

    return 0;
}