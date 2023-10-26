function sortArrayDescending(arr) {
    for(let i = 0; i < arr.length; i++) {
        for(let j = i + 1; j < arr.length; j++) {
            if(arr[i] < arr[j]) {
                const temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
}

const inputArrayString = prompt("Enter an array of numbers separated by commas (e.g. 1,2,3,4):");
const inputArray = inputArrayString.split(',').map(Number); // Convert string to array of numbers
const sortedArray = sortArrayDescending(inputArray);
console.log("Sorted array in descending order:", sortedArray.join(', '));
