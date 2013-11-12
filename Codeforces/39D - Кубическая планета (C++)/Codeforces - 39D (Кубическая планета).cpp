// Codeforces - 39D (Кубическая планета).cpp : main project file.

#include "stdafx.h"
#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
    int i,j,p = 0;
    int A[3][3] = {2};
    for(i = 0; i < 2; ++i){
        for(j = 0; j < 3; ++j){
            cin>>A[i][j];
        }
    }
    for(j = 0; j < 3; ++j){
        A[2][j] = (A[0][j] == 1) ? 0 : 1;
    }
    for(j = 0; j < 3; ++j){
        if(A[1][j] == A[2][j]){
            ++p;
        }
    }
    if(p == 3){
        cout<<"NO";
    }
    else{
        cout<<"YES";
    }
	_getch();
    return 0;
}