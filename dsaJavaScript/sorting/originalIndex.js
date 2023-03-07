function runProgram(input) {
  input = input.trim().split('\n');
  let n = +input[0];
  let arr = input[1].trim().split(' ').map(Number);

    originalIndex(n, arr);


    function originalIndex(n, arr){
        let index = arr.map((el, i)=> i);
        
        for(let i=0; i<n; i++){
            for(let j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    [arr[j], arr[j+1]] = [arr[j+1], arr[j]];
                    [index[j], index[j+1]] = [index[j+1], index[j]];
                }
            }
        }
        console.log(index.join(' '))
    }
}
  
  if (process.env.USER === 'dilshadahmad') {
    runProgram(`5
    4 5 3 7 1`);
  } else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function (input) {
      read += input;
    });
    process.stdin.on("end", function () {
      read = read.replace(/\n$/, "");
      read = read.replace(/\n$/, "");
      runProgram(read);
    });
    process.on("SIGINT", function () {
      read = read.replace(/\n$/, "");
      runProgram(read);
      process.exit(0);
    });
  }