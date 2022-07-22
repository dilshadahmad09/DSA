let strArr = ["[1,2,3,4]","[5,6,7,8]","[10,11,12,13]"];

let newArr = [];
for(let i=0; i<strArr.length; i++){
    newArr.push(JSON.parse(strArr[i]));
}

console.log(spiralTraversal(newArr));

function spiralTraversal(newArr){
    let minr = 0;
    let minc = 0;
    let maxr = newArr.length-1;
    let maxc = newArr[0].length-1;
   
    let tne = newArr.length * newArr[0].length;
    let cnt = 0;
   
    let result = [];
    while(cnt < tne){
       
        for(let r=minr, c=minc; c<=maxc && cnt <tne; c++){
            result.push(newArr[r][c]);
            cnt++;
        }
        minr++;

        for(let c=maxc, r=minr; r<=maxr && cnt <tne; r++){
            result.push(newArr[r][c]);
            cnt++;
        }
        maxc--;

        for(let r=maxr, c=maxc; c>=minc && cnt <tne; c--){
            result.push(newArr[r][c]);
            cnt++;
        }
        maxr--;

        for(let c=minc, r=maxr; r>=minr && cnt <tne; r--){
            result.push(newArr[r][c]);
            cnt++;
        }
        minc++;
        
    }
    
    return result;
}