function insertElement(a, k, x) {
  let n = array.length;
  for (let i = n; i >= k; i--) {
    a[i] = a[i - 1];
  }
  a[k] = x;
  n++;
}
let array = [1, 2, 3, 4, 5, 6];
insertElement(array, 3, 123);
console.log(array); // 123

// [1, 2, 3, 4, 5, 6,0];
// [1, 2, 3, 4, 5, 6,6];
// [1, 2, 3, 4, 5, 5,6];
// [1, 2, 3, 4, 4, 5,6];
// [1, 2, 3, 3, 4, 5,6];
// [1, 2, 3, 123, 4, 5,6];