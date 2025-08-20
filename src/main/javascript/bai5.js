function deleteElement(a, k) {
  let n = a.length;
  for (let i = k; i < n; i++) {
    a[i] = a[i + 1];
  }
  console.log(a.join(" "));
}
