function tickArray(a) {
  a.sort((x, y) => x - y);
  let finalArray = [];
  let bArray = new Array(a.length).fill(0);
  for (let i = 0; i < a.length; i++) {
    bArray[a[i]]++;
  }
  console.log(bArray);


  for (let i = 0; i < a.length; i++) {
    if (a.indexOf(a[i]) === i) {
      finalArray.push(`${a[i]} - ${bArray[a[i]]}`);
    }
  }


  console.log(finalArray.join("; ") + ";");
}

tickArray([0,1,2,3,3]);
      // [ 0, 1, 1, 2 ]
