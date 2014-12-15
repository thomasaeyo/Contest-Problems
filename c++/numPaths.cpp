#include <iostream>
#include <math.h>

using namespace std;
int a[1000000];
int p = 1000000007;

//return a^e % p
long modPow(int a,int e,int p)
{
if(e == 1 || e == 0){
   return (long)pow(a,e) % p;
}
if(e % 2 == 0){
   return ((long)pow(a,e/2) * (long)pow(a,e/2)) % p;
}
   return ((long)pow(a,e/2) * (long)pow(a,e/2) * a) % p;
}

int main()
{
   int N;
   int M;
   cin >> N;
   cin >> M;

   a[0] = 1;
   a[1] = 1;

   //factorial
   for(int i = 2; i < N + M + 1; i ++){
   	a[i] = a[i-1] * (i % p) % p;
   }

   //(n+m)! / (n! m!)
   int ans = modPow(a[N + M],1,p) * modPow(a[M],p-2,p) * modPow(a[N],p-2,p);

   cout << "a[N+M] is " <<a[N+M] << endl;
   cout << "a[N+M]^1 is " << pow(a[N+M],1) << endl;
   cout << "a[N+M]^1 % p is " << modPow(a[N+M],1,p) << endl;
   cout << ans << endl;
   return 0;
}
