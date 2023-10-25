function handleSubmit() {
    const form = document.getElementById("surveyForm");

    // Check if form is valid
    if (form.checkValidity()) {
        let message = "Form Submitted Successfully!\n\n";
        
        // Extracting values
        message += "First Name: " + form.firstName.value + "\n";
        message += "Last Name: " + form.lastName.value + "\n";
        message += "Date of Birth: " + form.dob.value + "\n";
        message += "Country: " + form.country.value + "\n";
        
        // Gender
        const genders = form.querySelectorAll("input[name='gender']:checked");
        let genderStr = Array.from(genders).map(g => g.value).join(", ");
        message += "Gender: " + genderStr + "\n";
        
        message += "Profession: " + form.profession.value + "\n";
        message += "Email: " + form.email.value + "\n";
        message += "Mobile Number: " + form.mobile.value + "\n";
        
        // Show the popup
        alert(message);

        // Reset the form
        form.reset();
    } else {
        alert("Please fill in all required fields!");
    }
}
