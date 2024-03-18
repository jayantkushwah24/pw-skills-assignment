// 1. In the following shopping cart add, remove, and edit items
// => const shoppingCart = ['Milk', 'Coffee', 'Tea', 'Honey']
// 8 a"" 'Meat' in the beginning of >our shopping cart if it has not been alrea"> a""e!
// 8 a"" Sugar at the en" of >ou shopping cart if it has not been alrea"> a""e!
// 8 remove 'Honey' if >ou are allergic to hone=
// 8 mo"if> Tea to 'Green Tea'


const shoppingCart = ['Milk', 'Coffee', 'Tea', 'Honey']
const isAllergicToHoney = true;
replaceItems("Tea" , "GreenTea")

//1
if (!shoppingCart.includes("Meat")) {
    shoppingCart.unshift("Meat")
}

//2
if (!shoppingCart.includes("Sugar")) {
    shoppingCart.push("Sugar")
}

//3
if (isAllergicToHoney) {
    const index = shoppingCart.indexOf("Honey")
    if (index != -1) {
        shoppingCart.splice(index, 1)
    }
}

//4
function replaceItems(oldItem, newItem) {
    const index = shoppingCart.indexOf(oldItem)
    if (index != -1) {
        shoppingCart.splice(index, 1)
        shoppingCart[index] = newItem
    }
}


console.log(shoppingCart);