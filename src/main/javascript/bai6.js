function array(a) {
  let newArray = [];
  for (const element of a) {
    if (isPrime(element)) {
      newArray.push(element);
    }
  }
  return newArray.join(" ");
}
function isPrime(n) {
  if (n < 2) return false;
  if (n === 2 || n === 3) return true;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}
console.log(array([1, 2, 3, 4])); // Example usage
