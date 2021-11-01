const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let result = 0;

for(let i = 0; i < numbers.length; i++) {
  if(numbers[i] % 2 === 0) {
    result += numbers[i] * 2;
  }
}

console.log(result);

//That is a very familar code, we all have written code like this many times

//It sadly fails the SLAP

//That code focuses on a lot of details. How to get the data, check if even, double
//add, print...

//It is imperative style and quite complex.

