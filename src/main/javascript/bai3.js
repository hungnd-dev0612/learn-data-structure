function array(a) {
  for (let i = 0; i < a.length; i++) {
     a[i] = a[i] * a[i];
  }
  console.log(a.join(" "));
}
array([1, 2, 3, 4]);
// Expected output: 30

