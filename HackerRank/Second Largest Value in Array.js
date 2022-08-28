//1. Sort the array and print the required index value

nums = [10, 9, 9, 8, 8, 11, 8, 0, 9, 1];
getSecondLargest(nums);

function getSecondLargest(nums) {
    
    const length = nums.length;
    let temp=0;
    
  //bubble sort used to sort the array
    for(let i=0;i<length-1;i++){
        for(let j=0;j<length-i-1;j++){
            if(nums[j]<nums[j+1]){
                temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }
    print(nums[1]);
}

//2. Find the largest value, set all largest values in array to -1 and find the largest array value again

nums = [10, 9, 9, 8, 8, 11, 8, 0, 9, 1];
getSecondLargest(nums);

function getSecondLargest(nums) {
    // Complete the function
    
    const length = nums.length;
    let highest=nums[0];
    for(let i=1;i<length;i++){
        if(nums[i]>highest){
            highest=nums[i];
        }
    }
    
    let secondHighest=nums[0];
    for(let i=0;i<length;i++){
        if(nums[i]===highest){
            nums[i]=-1;
        }

    }
    
    for(let i=1;i<length;i++){
        if(nums[i]>secondHighest){
            secondHighest=nums[i];
        }
    }
    
     print(secondHighest);
}

//3. Traverse twice. In the first traversal find the largest value and in the second traversal find the largest value excluding the largest value

nums = [10, 9, 9, 8, 8, 11, 8, 0, 9, 1];
getSecondLargest(nums);

function getSecondLargest(nums) {
    
    const length = nums.length;
    let highest=nums[0];
    for(let i=1;i<length;i++){
        if(nums[i]>highest){
            highest=nums[i];
        }
    }
    
    let secondHighest=-1;

    for(let i=0;i<length;i++){
      //proceed only if value is not the highest found before
        if(nums[i]!==highest){
          
            if(nums[i]>secondHighest){
              //if any value is found immediatly set it as the second largest 
                secondHighest = nums[i];
            }
          //find greater values if found and assign it as second largest value
            else if(nums[i]>secondHighest){
                secondHighest = nums[i];
            }
        }
    }
    
     print(secondHighest);
}

//4. Find the second largest value in a single traversal

