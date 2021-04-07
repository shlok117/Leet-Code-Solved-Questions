class Solution {
public:
    int removeDuplicates(vector<int>& nums) 
    {
        int size = nums.size(), i = 0, j = 1;
    
		if(size == 0)
			return 0; 
    
		for(j = 1; j<size; j++)
		{
			
			if(nums[i]!=nums[j])
			{
				i+=1;
				nums[i] = nums[j];
			}
		}
    
		return i+1;
	}
};