const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = numbers.filter(e => e % 2 === 0)
  .map(e => e * 2)
  .reduce((total, e) => total + e);

console.log(result);

//Good news, the code has less noise compared to the previous one
//It has all the benefit of the previoius code but it still is not great IMHO

//I still have to pause and parse though the lambda expresions or the arrow functions.

//The code is not more testable that the imperative or the previous function style code.

//We can do better.
