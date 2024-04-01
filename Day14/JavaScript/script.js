/*            


*/

var num = 10;

function printNumbers(n){
    for(var i=1;i<=n;i++){
        document.write("<br>"+i);
    }
}

function sumOfArray(a) {
    var sum = 0;
    for(var i =0; i<a.length;i++){
        sum =  sum + a[i];  
    }
    return sum;

}