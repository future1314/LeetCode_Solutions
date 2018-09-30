```cpp
#include<iostream>
using namespace std;

bool IsLittleEndian()
{
    short usData = 0x1122;
    char *pucData = (char*)&usData;
    return (*pucData == 0x22);
}

int main()
{
    cout<<IsLittleEndian()<<endl;
}
```
