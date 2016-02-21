/*
Count Primes

Count the number of prime numbers less than a non-negative number, n.

分析：
一共有多少个素数？(https://primes.utm.edu/howmany.html)

埃拉托斯特尼筛法 (http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
*/


public class Solution {
  public int countPrimes(int n) {
    boolean[] isPrime = new boolean[n];
    for(int i=2; i<n; i++)
      isPrime[i] = true;
    
    for(int i=2; i*i<n; i++){
      if(!isPrime[i])
        continue;
      for(int j= i*i; j<n; j+=i)
        isPrime[j] = false;
    }
       
    int count = 0;
    for(int i=2; i<n;i++){
      if(isPrime[i])
        count++;
    }
    return count;
  }
}