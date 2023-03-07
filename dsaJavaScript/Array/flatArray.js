// let arr = [[[[1,2,3]]]];
// console.log(flatArr(arr));
// function flatArr(arr){
//    let res = arr.map((ele)=>{
//         if(Array.isArray(...ele)){
//             return flatArr(ele);
//         }
//         return res;
//     })
// }
// console.log(arr)

// let res = arr.reduce((accumulator, element)=>{
//     if(Array.isArray(element)){
//         return [...accumulator, ...element];
//     }else{
//         return [...accumulator, element];
//     }
// }, [])
// console.log(res)

// console.log(flatten(arr))
// function flatten(array) {
//     return array.reduce(
//       (accumulator, item) => {
//         // if `item` is an `array`,
//         // use the `spread syntax` to 
//         // append items of the array into 
//         // the `accumulator` array
//         if (Array.isArray(item)) {
//           return [...accumulator, ...item];
//         }
//         // otherwise, return items in the 
//         // accumulator plus the new item
//         return [...accumulator, item];
//       }
//     , []); // initial value of `accumulator`
//   }
  



let arr = [[100], [10, 3, 20],[[[[[[[[[1,2,3]]]], [23, 34]]]]]], [[[[[[101, 103]]]]]]];


// let arr2 = [];
// console.log(flat(arr));
// function flat(arr) {
//      arr.forEach(element => {
//           if (typeof (element) == 'object') {
//                flat(element);
//           } else {
//                arr2.push(element);
//           }
//      });
// }
// console.log(arr2)


// let ans = [];
// flat(arr);
// function flat(arr){
//     arr.forEach((elem)=>{
//         if(Array.isArray(elem)){
//             flat(elem);
//         }else{
//             ans.push(elem);
//         }
//     })
// }
// console.log(ans)

let result = [];
flat(arr);
function flat(arr){
    let i=0;
    let n = arr.length;
    while(i<n){
        if(Array.isArray(arr[i])){
            flat(arr[i])
        }else{
            result.push(arr[i]);
        }
        i++;
    }
}
console.log(result)