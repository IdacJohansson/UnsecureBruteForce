function validation(){ // Index form-validation

    const orderForm = document.getElementById('orderForm');
    orderForm.addEventListener('submit', function(e){
        e.preventDefault();

        const firstname = document.getElementById("fName").value;
        const password = document.getElementById("key").value;
        let isValid = false;

        while(isValid == false) {
            if (firstname == "Klas" && password == "123") {
                isValid = true;
                sessionStorage.setItem("keyIsValid", "true");
                window.location.href = "admin.html";
                return isValid;
            } else { //Sätter tidsfördröjning vid felaktig input
                //setTimeout(() =>console.log("Wrong login. Wait 5 seconds"),5000)
                return false;
            }
        }
    });
}




