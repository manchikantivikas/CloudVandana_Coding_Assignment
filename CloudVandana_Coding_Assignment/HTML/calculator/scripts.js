
const display = document.getElementById("display");


document.getElementById("calcu").addEventListener("click", function(event) {

    if(event.target.tagName === "INPUT" && event.target.type === "button") {
        const value = event.target.getAttribute("data-value");


        if(value === "AC") {
            display.value = "";
        }

        else if(value === "=") {
            try {
                display.value = eval(display.value);
            } catch(e) {
                display.value = "Error";
            }
        }

        else {
            display.value += value;
        }
    }
});
