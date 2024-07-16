const merge = (left, right) => {
  let i = 0,
    j = 0,
    k = 0;
  let m = left.length;
  let n = right.length;
  let merged = Array(m + n);
  while (i < m && j < n) {
    if (left[i] <= right[j]) {
      merged[k] = left[i];
      i++;
      k++;
    } else {
      merged[k] = right[j];
      j++;
      k++;
    }
  }
  while (i < m) {
    merged[k] = left[i];
    i++;
    k++;
  }
  while (j < n) {
    merged[k] = right[j];
    j++;
    k++;
  }
  return merged;
};
function mergeSortHelper(arr, start, end) {
  if (start == end) {
    let result = Array(1);
    result[0] = arr[start];
    return result;
  }
  let mid = start + Math.floor((end - start) / 2);
  let left = mergeSortHelper(arr, start, mid);
  let right = mergeSortHelper(arr, mid + 1, end);
  return merge(left, right);
}

const mergeSort = function () {
  let array = [4, 5, 4, 2, 7, 9, 6, 1, 8, 6, 9, 4, 3, 0]; 
  array = mergeSortHelper(array, 0, array.length - 1);
  console.log(array);
};
mergeSort();

