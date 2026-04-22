



/*login*/
function submitlogin() {
  const email = document.getElementById("email").value;
  const pass = document.getElementById("pass").value;
  const errorMessages = document.getElementById("errmessages");
  const errorMessages1 = document.getElementById("errmessages1");
  const errorMessages2 = document.getElementById("errmessages2");

  //validation
  if (!email || !pass) {
    errorMessages.innerHTML = "All fields are required";
    return;
  }

  const passRegex =/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[A-Za-z\d!@#$%^&*()_+]{8,30}$/;

  if (pass.length < 8 || pass.length > 30 || !pass.match(passRegex) ) {
    
    errorMessages2.innerHTML =
    "password should be between 8 or 30 and should contain at least a capital letter and 1 special character and a number";
    return;
  }
 
  if (!email.includes("@")) {
    errorMessages1.innerHTML = "email should contain @";
    return ;
  }

  errorMessages.innerHTML = "";
  errorMessages1.innerHTML = "";
  errorMessages2.innerHTML = "";

  window.location.href = "home.html";
  
 
}



/*registration*/
function submitreg() {
  const email = document.getElementById("email").value;
  const pass = document.getElementById("pass").value;
  const fname = document.getElementById("fname-register").value;
  const lname = document.getElementById("lname-register").value;
  const passconfirm = document.getElementById("passcon-register").value;
  const errorMessages = document.getElementById("errmessages");
  const errorMessages1 = document.getElementById("errmessages1");
  const errorMessages2 = document.getElementById("errmessages2");

  if (!email || !pass || !fname || !lname || !passconfirm) {
    errorMessages.innerHTML = "All fields are required";
    return;
  }

  // Improved password validation
  const passRegex =/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[A-Za-z\d!@#$%^&*()_+]{8,30}$/;

  if (!pass.match(passRegex)) {
   
    errorMessages2.innerHTML = 
    "Password should be between 8 and 30 characters,and must contain at least one lowercase letter,one uppercase letter,one digit,and one special character(!@#$%^&*()_+)";
    return;
  }

  if (pass !== passconfirm) {
    errorMessages1.innerHTML = "Passwords do not match";
    return;
  }

  // Clear error messages if everything is valid
  errorMessages.innerHTML = "";
  errorMessages1.innerHTML = "";
  errorMessages2.innerHTML = "";

  
  window.location.href = "login.html";


}