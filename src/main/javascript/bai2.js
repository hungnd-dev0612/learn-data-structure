function array(a){
  let sum = 0;
  for (const element of a) {
    sum += element;
  }
  console.log(sum);
}
array([1, 2, 3, 4]); // Expected output: 30
