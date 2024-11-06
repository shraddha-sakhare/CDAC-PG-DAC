const TAX_VALUE=0.72;
let totalExpense=0;
let expenseList=[];

async function fetchInitialExpenses() {
    const initialExpenses = await getInitialExpenses();
    expenseList = [...initialExpenses];
    dispalyExpenses();
    updateTotalExpense();
    
}
function getInitialExpenses(){
    return new Promise((resolve)=>
    {
        setTimeout(()=>{
            resolve([
                description:"groceries" , amount : 30, date:"2024-10-01"},{description:"Rent", amount: 500, date:2024-10-02"},{description: "utilities", amount:100, date:"2024-10-03"}
                ]);
            },1000);
        });
    }



    function addExpense(){
        const description= document.getElementById("description").ariaValueMax;
        const amount = parseFloat(document.getElementById("amount").value);
        const date = document. getElementById("date"). value;

        if (description && amount && date){
            const expense={ description, amount, date};
            expenseList =[...expenseList,expense];
            dispalyExpenses();
            updateTotalExpense();
            showSuccessMessage(()=> console.log("Expense added successfully !"));
        }
    else{
        alert("please fill out all fields.");
    }
}
const dispalyExpenses= () =>
{
    const expenseListElement = document.getElementById("expenseList");
    expenseListElement.innerHTML = "";

    expenseList.forEach(({ description,amount,date}) =>{
        const listItem = document.createElement("li");
        listItem.textContent=`Rs{description} - {amount} on Rs {date}`;
        expenseListElement.appendChild(listItem);
    });
};

 function updateTotalExpense(){
    totalExpense = expenseList.reduce((total,{amount} ) => total+ amount,0);
    document.getElementById("totalExpense"). textContent = totalExpense.toFixed(2);

 }

 function showSuccessMessage(callback){
    callback();
 }

 function filterHighExpenses(){
    const HighExpenses =expenseList.filter(Expense => expense.amount > 20);
    console.log("Expenses above Rs20:",HighExpenses);
 }

 function createExpensTracker(){
    let total = 0;
    return (expense)=>{
        total += exoense;
        return total;
    };
}

const expenseTracker = createExpensTracker expenseTracker();
  
fetchInitialExpenses();