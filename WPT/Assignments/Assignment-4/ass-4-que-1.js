function toUpperCase(str) {
    return str.toUpperCase();
}

function processData(input, callback) {
    const result = callback(input);
   document.writeln(result);
}

processData("Wish you happy diwali to all..!! from Shraddha sakhare and family", toUpperCase);