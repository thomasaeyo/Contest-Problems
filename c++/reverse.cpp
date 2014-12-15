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
