// let arr = [1,2,3,1,2,3,1,2,3,1,2,3];

// // let i=0;
// // let j = arr.length-1;
// // let min = 0;
// // while(i<j){
// //     if(arr[i] === 1){
// //         [arr[i], arr[min]] = [arr[min], arr[i]];
// //         min++;
// //         i++;
// //     }else if(arr[i] === 3){
// //         [arr[i], arr[j]] = [arr[j], arr[i]];
// //         j--;
// //         i++;
// //     }else{
// //         i++;

// //     }

// // }
// // console.log(arr)

// let one = 0;
// let two = 0;
// let three = 0;

// for(let i=0; i<arr.length; i++){
//     if(arr[i] === 1){
//         one++
//     }else if(arr[i] === 2){
//         two++;
//     }else{
//         three++;
//     }
// }
// let ans = []

//     while(one--){
//         ans.push(1);
//     }

//     while(two--){
//         ans.push(2);
//     }

//     while(three--){
//         ans.push(3);
//     }

// console.log(ans)

let arr = [0,2,1,0,1,1,2,2,0,0,2,2,0,0,0,1,1,0];

// let low = 0;
// let mid = 0;
// let high = arr.length-1;

// while(mid <=high){
//     // if(arr[mid] === 0){
//     //     [arr[low], arr[mid]] = [arr[mid], arr[low]];
//     //     low++;
//     //     mid++;
//     // }else if(arr[mid] === 1){
//     //     mid++;
//     // }else if(arr[mid] === 2){
//     //     [arr[mid], arr[high]] = [arr[high], arr[mid]];
//     //     high--;
//     // }

// }
// console.log(arr)

let low = 0;
let mid = 0;
let high = arr.length-1;

while(mid <= high){
    switch(arr[mid]){
        case 0:
            [arr[mid], arr[low]] = [arr[low], arr[mid]];
            mid++;
            low++;
            break;
        case 1:
            mid++;
            break;
        case 2:
            [arr[mid],arr[high]] = [arr[high], arr[mid]];
            high--;
            break;
    }
}
console.log(arr)