function sum (...numbers){
    return numbers.reduce((total, number)=> total+number,0);
}
console.log(sum(1,2,3,4,5));
