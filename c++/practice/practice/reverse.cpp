//
//  reverse.cpp
//  practice
//
//  Created by Thomas Lee on 3/7/14.
//  Copyright (c) 2014 Thomas Lee. All rights reserved.
//

#include <iostream>

using namespace std;
double a[1000000];
int main()
{
    int N;
    cin >> N;
    for(int i = 0; i < N; i++){
        cin >> a[i];
    }
    for(int i = N - 1; i >= 0; i--){
        cout << a[i] << endl;
    }
    return 0;
}

