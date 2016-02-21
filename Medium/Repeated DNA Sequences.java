/*
Repeated DNA Sequences

All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
*/


public class Solution {
  public List<String> findRepeatedDnaSequences(String s) {
    HashSet<String> set = new HashSet<String>();
    HashSet<String> dna = new HashSet<String>(); // make sure no duplicate in dna set
    for (int i = 9; i < s.length(); i++) {
      String subString = s.substring(i - 9, i + 1);
      if (set.contains(subString)) {
        dna.add(subString);
      } else {
        set.add(subString);
      }
    }
    List<String> result = new ArrayList<String>();
    for (String d: dna) {
      result.add(d);
    }
    return result;
  }
}