let arr = [5,4,0,1,-3,2,3];

let i=1;
while(arr.length > i){
    let temp = arr[i];
    let j= i-1;
    while(j >=0 && arr[j] < temp){
       arr[j+1] = arr[j];
       j--;
    }
    arr[j+1] = temp;
    i++;
}
console.log(arr);