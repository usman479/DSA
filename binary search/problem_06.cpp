#include <iostream>
using namespace std;

// FIND SQUARE ROOT OF A NUMBER
// 💡 if you want to store square = m*m use data type long long int //

int square_root(int n){
    int start = 0;
    int end = n;
   int ans = -1;
   while(start <= end){
    int mid = start + (end-start)/2;
    int square = mid*mid;

    if(square == n){
        return mid;
    } else if (square < n){
        ans = mid;
        start = mid+1;
    } else {
        end = mid-1;
    }
    
   }
   return ans;
}

int main(){

  cout << square_root(65) << endl;

  return 0;
}