function calculateTax() {
    // Define tax rates and income ranges using closure
    const taxRates = [0.1, 0.15, 0.2, 0.25];
    const incomeRanges = [10000, 30000, 60000, Infinity];
  
    return function (income) {
      let tax = 0;
  
      for (let i = 0; i < incomeRanges.length; i++) {
        if (income <= incomeRanges[i]) {
          tax += income * taxRates[i];
          break;
        } else {
          tax += incomeRanges[i] * taxRates[i];
          income -= incomeRanges[i];
        }
      }
  
      return tax;
    };
  }
  
  // Test the calculateTax function with various incomes
  const calculateTaxForIncome = calculateTax();
  
  console.log(`Tax for income $5000: ${calculateTaxForIncome(5000)}`);
  console.log(`Tax for income $15000: ${calculateTaxForIncome(15000)}`);
  console.log(`Tax for income $45000: ${calculateTaxForIncome(45000)}`);
  console.log(`Tax for income $80000: ${calculateTaxForIncome(80000)}`);
  