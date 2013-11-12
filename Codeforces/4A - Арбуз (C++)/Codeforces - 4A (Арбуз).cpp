// Codeforces - 4A (Арбуз).cpp : main project file.

#include "stdafx.h"
#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
	int w;
	cin>>w;
	if (w > 2){
		if(w % 2 == 0){
			cout<<"YES";	
		}
		else {
			cout<<"NO";
		}
	}
	else{
		out<<"NO";
	}
    _getch();
    return 0;
}
