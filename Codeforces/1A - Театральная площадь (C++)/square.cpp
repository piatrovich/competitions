#include <iostream>

using namespace std;

int main()
{
    long long int m, n, a, ost1, ost2;
    cin>>m>>n>>a;
    ost1 = m/a;
    if( (m%a) > 0 ) ++ost1;
    ost2 = n/a;
    if( (n%a) > 0 ) ++ost2;
    long long int p = ost1 * ost2;
    cout<<p;
    return 0;
}