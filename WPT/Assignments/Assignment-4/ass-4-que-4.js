function fetchData(url, callback) {
    document.writeln(`Fetching data from ${url}...`);
    setTimeout(() => {
        const isError = Math.random() > 0.5; 
        if (isError) {
            callback("Error: Failed to fetch data");
        } else {
            const response = "Data received from " + url;
            callback(null, response);
        }
    }, 2000);
}


fetchData("https://example.com", (error, response) => {
    if (error) {
        document.writeln(error);
    } else {
        document.writeln(response);
    }
});