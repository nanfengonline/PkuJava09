
/*public class Solution {
//    List<List<Integer>> con = new ArrayList<List<Integer>>();    //this is a method
    public List<List<Integer>> fourSum(int[] nums, int target) {
/*        if(nums == null && nums.length < 4) return con;
        
        int len = nums.length;
        Arrays.sort(nums);
        
        //for(int i = 0; i< len; i++)
        for(int i =0; i < len -3; i++){
            for(int j = i+1; j < len-2; j++) {
                if(nums[j] == nums[j-1]) continue;
                if((nums[i] + nums[j]) <= 0)
                find(nums, j+1, len-1, nums[i],nums[j]);
            }
        }
        return con;
    }
        
        public void find (int[] nums, int begin, int end, int target1, int target2) {
            int l = begin,r = end;
            
            while(l < r) {
                int sum = nums[l] + nums[r] + target1 + target2;
                if(sum == 0) {
                    List<Integer> row = new ArrayList<Integer>(); //method!!
                    row.add(target1);
                    row.add(target2);
                    row.add(nums[l]);
                    row.add(nums[r]);
                    con.add(row);
                    
                    while(l < r && nums[l] == nums[l++]) l++;
                    while(l < r && nums[r] == nums[r--]) r--;
                    l++; 
                    r--;
                }
                else if(sum < 0) l++;
                else r--;
            }
           /* if(nums ==null || nums.length < 4) return con;
            int len = nums.length;
            
            Arrays.sort(nums);*/
            
/*            Arrays.sort(nums);
            HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
            ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<>();
            
            for(int i = 0; i < nums.len - 3; i++) {
                for (int j = i + 1; j < nums.len -2; j++) {
                    int h = j+1;
                    int t = len - 1;
                    
                    while(h < t) {
                        int sum = nums[i] + num[j] + nums[h] + nums[t];
                        
                        if(sum < target) {
                            h++;
                        }
                        else if(sum > target) {
                            t--;
                        }
                        else if(sum == target){
                            ArrayList<Integer> temp = new ArrayList<Integer>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[h]);
                            temp.add(nums[t]);
//                            res.add(temp);
                            if(!hashSet.contains(temp)) {
                                hashSet.add(temp);
                                res.add(temp);
                            }
                            
                            h++;
                            t--
                        }
                    }
                }
            }
            return res
        }
    
} */


public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>> ();        
        int i,j,k,m,sum2,sum1;
        for(i=0;i<nums.length-1;i++){               //����
            for(j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1])
                {
                    k=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=k;
                }
                
            }
        }       
for(m=0;m<nums.length-3;m++){     //��sum3�Ļ����϶��һ��ѭ����target-��һ������Ϊsum3�����е�0��
       sum1=target-nums[m];
       for(i=m+1;i<nums.length-2;i++)
            {         //��ͷ��β������������i�����һ��Ԫ�أ�j����ڶ�����k���������
                sum2=sum1-nums[i];                    //0-��һ��Ԫ��=������Ԫ��֮��
                j=i+1;k=nums.length-1;           //�ڶ�������Ԫ�طֱ��i+1��n-1��ʼ����
                while(j<k){
                    if(nums[j]+nums[k]>sum2)
                        k--;
                    else if(nums[j]+nums[k]<sum2)
                        j++;
                    else if(nums[j]+nums[k]==sum2)
                        {List<Integer> row = new ArrayList<Integer>();
                        row.add(nums[m]);
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        res.add(row);
                        while(j<nums.length-2&&nums[j+1]==nums[j]){         //�������ͬ��Ԫ��ֱ��������
                        	j++;
                        }
                        while(k<nums.length-1&&nums[k-1]==nums[k]){         //�������ͬ��Ԫ��ֱ����ǰ����
                        	k--;
                        }
                        j++;
                        } }
              while(i<nums.length-1&&nums[i+1]==nums[i]){             //�������ͬ��Ԫ��ֱ��������
            	  i++;
              }  
            }
            while(m<nums.length-3&&nums[m+1]==nums[m]){             //�������ͬ��Ԫ��ֱ��������
            	  m++;
            }
        }
        return res;
    }
}
