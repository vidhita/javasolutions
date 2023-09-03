class Solution {
  /*
    Merge two integer arrays nums1 and nums2, sorted in non-decreasing order,
    Result is stored inside the array nums1. To accommodate this, nums1 has a length of m + n, 
  */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
   if (n !=0) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        }
    }
}
