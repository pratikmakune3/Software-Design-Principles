const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const isEven = e => e % 2 === 0;
const double = e => e * 2;
const sum = (a, b) => a + b;

const result = numbers.filter(isEven)
  .map(double)
  .reduce(sum);

console.log(result);

//The code follows SLAP even more than the previous versions
//Each of the functions can be tested separate and we can do integrated testing as well
//more testable
//The easiest to read because we don't have to pause and parse lambdas or arrow functions
//while reading though the functional pipeline

