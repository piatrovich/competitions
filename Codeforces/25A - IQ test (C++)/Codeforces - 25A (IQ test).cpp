// Codeforces - 25A (IQ test).cpp : main project file.

#include "stdafx.h"
#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
	int A[100];
	int n, ch = 0, nch = 0, n1, n2;
	cin>>n;
	for(int i=0; i<n; ++i){
		cin>>A[i];
		if(A[i] % 2 == 0){
			++ch;
			n1 = i;
		}
		else{
			++nch;
			n2 = i;
		}
	}
	if (ch > nch){
		cout<<n2+1;
	}
	else {
		cout<<n1+1;
	}
    _getch();
    return 0;
}
