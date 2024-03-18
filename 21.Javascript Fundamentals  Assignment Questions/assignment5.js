// Q5. You are building a shipping application. Write a program that takes the type of package ("standard",
// "express", or "overnight") and uses a switch statement to calculate and print the estimated delivery time
// based on the package type. For example, "standard" might take 3-5 days, "express" 1-2 days, and
// "overnight" would be delivered the next day.



function deliveryTime(packageType) {
    
switch (packageType) {
    case "standard":
        console.log("Might take 3 - 5 days");
        break;
    case "express":
        console.log(`Might take 1 - 2 days`);
        break;
    case "overnight":
        console.log(`Would be delivered the next day`);
        break;

    default:
        console.log("Unknown package type");
        break;
}
}

deliveryTime("standard")
deliveryTime("express")
deliveryTime("overnight")