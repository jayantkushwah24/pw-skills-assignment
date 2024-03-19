// 2. The following is an array of 10 students ages:
// => const ages = [19, 22, 19, 24, 20, 25, 2i, 24, 25, 24#
// 8 Sort the arra> an" fin" the min an" maa age`
// 8 Fin" the me"ian age(one mi""le item or two mi""le items "ivi"e" b> two^
// 8 Fin" the average age(all items "ivi"e" b> number of items^
// 8 Fin" the range of the ages(maa minus min^
// 8 Compare the value of (min - average) an" (maa - average), use abs() metho"

const ages = [19, 22, 19, 24, 20, 25, 26, 24, 25, 24]

console.log("Min and Max ages are " + minAndMax(ages));
console.log(`Median ${median(ages)}`);
console.log(`Average ${average(ages)}`);
console.log(`Range ${range(ages)}`);
console.log(`Comparison ${Compare(ages)}`);


function minAndMax(ages) {
    const age = ages.sort()
    let min = age[0]
    let max = age[age.length -1]
    return [min , max]
}

function median(ages) {
    const age = ages.sort()
    if (age.length%2 == 0) {
        return ((age[age.length/2] + age[age.length/2 - 1] )/2 );
    }else{
        return age[age.length / 2]
    }
}

function average(ages) {
    let sum = 0;
    for (let index = 0; index < ages.length; index++) {
         sum = sum + ages[index]; 
    }
    let avg = sum/ages.length;
    return avg;
}

function range(ages) {
    const age = ages.sort()
    let min = age[0]
    let max = age[age.length -1]
    return [max - min]
}

function Compare(ages) {
    let avg = average(ages)
    let min = minAndMax(ages)[0]
    let max = minAndMax(ages)[1]
    console.log(avg , min , max);
    let comp = Math.abs((min - avg) - (max - avg) )
    return comp; 
}