let totalcost =0;
const tax=0.75;
// function 
function addcost(price){
    totalCost += price;
}

function calculateTotalCost(){
    return totalCost * (1+ tax);
}

addcost(500);
addcost(37.50);
addcost(1250);

document .writeln("total cost including tax: "+calculateTotalCost());