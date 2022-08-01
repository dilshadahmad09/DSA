// let arr = [2,0,1,-3,5,-1];
let arr = [6,5,4,3,2,1,0,-1];
for(let i=1; i<arr.length; i++){
    let temp = arr[i];
    let j = i-1;
    while(j>=0 && arr[j] > temp){
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = temp;
}
console.log(arr)


// let arr = [5,4,0,1,-3,2,3];

// let i=1;
// while(arr.length > i){
//     let temp = arr[i];
//     let j= i-1;
//     while(j >=0 && arr[j] < temp){
//        arr[j+1] = arr[j];
//        j--;
//     }
//     arr[j+1] = temp;
//     i++;
// }
// console.log(arr);