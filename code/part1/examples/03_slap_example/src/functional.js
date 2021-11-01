const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = numbers.filter(function(e) { return e % 2 === 0; })
  .map(function(e) { return e * 2; })
  .reduce(function(total, e) { return total + e; });

console.log(result);

//Each line is cohesive, does one thing and only one thing
//It follow SLAP, but...

//The code has less complexity, we can read though it once to down...

//Most of us are familiar with imperative style, but some of us are new to functional style
//We may find it hard to read functional style, not because it is hard to read, but
//because it is unfamilar. So, we have to account for that, raise the bar so the
//code is readable by those who are familar with the style.

//But, for those who are familiar with the style, is the code readable.
//Not really yet...

//In general a functional style code written properly follows SLAP because
//functional style code is declarative - where we tell what to do instead of how to do it.

//Even though this code is functional, we can make it more readable, testable, maintainable, etc.
