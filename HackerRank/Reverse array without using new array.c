#include <stdio.h>

int main() {
  int T;
  scanf("%d", & T);
  while (T--> 0) {

    int N;
    scanf("%d", & N);
    int A[N];
    for (int i = 0; i < N; i++) {
      scanf("%d", & A[i]);
    }

    //reversing
    int j = N - 1;
    int temp;
    for (int i = 0; i < N / 2; i++) {
      temp = A[i];
      A[i] = A[j];
      A[j] = temp;
      j--;
    }
    /*
    Using a tewmp varibale do swap of extreme values untill N/2. Exceeding N/2 or upto N will give back original array.While loop can also be used as i<j.
    */

    for (int i = 0; i < N; i++) {
      printf("%d ", A[i]);
    }
    printf("\n");
  }
  return 0;
}
