function reverseWord(word) {
    let reversed = '';
    for(let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}

function reverseEveryWordInSentence(sentence) {
    const words = sentence.split(' ');
    for(let i = 0; i < words.length; i++) {
        words[i] = reverseWord(words[i]);
    }
    return words.join(' ');
}

const inputSentence = prompt("Enter a sentence to reverse its words:");
const reversedSentence = reverseEveryWordInSentence(inputSentence);
console.log("Reversed sentence:", reversedSentence);
