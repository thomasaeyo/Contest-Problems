#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

bool even(int a){
    return a % 2 == 0;
}

bool lt(int a, int b){
    if(even(a) && even(b)){
        return a < b;
    }
    if(even(a) && !even(b)){
        return a > b;
    }
    if(!even(a) && even(b)){
        return a < b;
    }
    if(!even(a) && !even(b)){
        return a < b;
    }
}


int main()
{
   int N;
   cin >> N;
   vector<int> V(N);
   for(int&x : V) {
       cin >> x;
   }
   sort(V.begin(),V.end(), lt);
   
   for(int&x : V) cout << x;
   return 0;
}

