function array(a) {
  let result = "";
  for (let i = 1; i < a.length; i++) {
    result = monoTone(a[0], a[i], a[a.length - 1]);
  }
  console.log(result);
}
function monoTone(first, middle, last) {
  let increase = true;
  let decrease = true;
  let result = "";
  if (first < middle < last || first > middle > last) {
    increase;
  } else {
    result = "NO";
  }
  return result;
}

// console.log(array([5, 4, 3, 2, 1]));
// console.log(array([1,2,3,1,2]));
array([1, 2, 3, 1, 2]);
