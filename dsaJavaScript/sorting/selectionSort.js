let arr = [-1,3,0,2,3,-4,5,6];

for(let i=0; i<arr.length; i++){
    let max = i;
    for(let j=i; j<arr.length; j++){
        if(arr[max] < arr[j]){
            max = j;
        }
    }
    [arr[max], arr[i]] = [arr[i], arr[max]];
}

console.log(arr);