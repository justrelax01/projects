<<<<<<< HEAD
/*booking*/

function makeabooking() {
  const fullname = document.getElementById("full-name").value;
  const email = document.getElementById("email").value;
  const textfrom = document.getElementById("text-from").value;
  const textto = document.getElementById("text-to").value;
  const phonenb = document.getElementById("phone").value;
  const age = document.getElementById("age").value;
  const returntime = document.getElementById("return-time").value;
  const returndate = document.getElementById("return-date").value;
  const errorMessages = document.getElementById("errmessages");
  const errorMessages1 = document.getElementById("errmessages1");
  const errorMessages2 = document.getElementById("errmessages2");

  // Validation
  if (
    !textfrom ||
    !textto ||
    !email ||
    !age ||
    !phonenb ||
    !fullname ||
    !returntime ||
    !returndate
  ) {
    errorMessages.innerHTML = "All fields are required!";
    return;
  }

  if (isNaN(age) || age < 3 || age > 95) {
    errorMessages1.innerHTML = "Age should be a number between 3 and 95.";
    return;
  }

  if (phonenb.length !== 8 || isNaN(phonenb)) {
    errorMessages2.innerHTML = "Check your phone number!";
    return;
  }

  // Clear previous error messages
  errorMessages.innerHTML = "";
  errorMessages1.innerHTML = "";
  errorMessages2.innerHTML = "";

  // Create a table row with delete button
  const tableRow = document.createElement("tr");
  tableRow.innerHTML = `
      <td>${fullname}</td>
      <td>${email}</td>
      <td>${age}</td>
      <td>${phonenb}</td>
      <td>${textfrom}</td>
      <td>${textto}</td>
      <td>${returndate}</td>
      <td>${returntime}</td>
      <td><button onclick="deleteBooking(this)">Delete</button></td>
    `;

  // Append the table row to the table body
  const bookPostsContainer = document.getElementById("bookPostsContainer");
  bookPostsContainer.appendChild(tableRow);

  // Show the table and update the count message
  const bookingsTable = document.getElementById("bookingsTable");
  bookingsTable.style.display = "table";
  const bookCountMessage = document.getElementById("bookCountMessage");
  bookCountMessage.style.display = "block";
  bookCountMessage.innerText = `Total Bookings: ${bookPostsContainer.children.length}`;

 
}


//delete the booking in the booking page
function deleteBooking(button) {
  const row = button.closest("tr");
  row.remove();
  const bookPostsContainer = document.getElementById("bookPostsContainer");
  const bookCountMessage = document.getElementById("bookCountMessage");
  bookCountMessage.innerText = `Total Bookings: ${bookPostsContainer.children.length}`;
}




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

  window.location.href = "bookflight.html";
  
 
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



/*FaQ & feedback

$(document).ready(function() {
	$('.answer').hide(); // hide answers
	$('.question').click(function() { // to click on the question
		$(this).next('.answer').slideToggle(); // to slide to the answer when you click on the question
	});
});

*/
=======
/*booking*/

function makeabooking() {
  const fullname = document.getElementById("full-name").value;
  const email = document.getElementById("email").value;
  const textfrom = document.getElementById("text-from").value;
  const textto = document.getElementById("text-to").value;
  const phonenb = document.getElementById("phone").value;
  const age = document.getElementById("age").value;
  const returntime = document.getElementById("return-time").value;
  const returndate = document.getElementById("return-date").value;
  const errorMessages = document.getElementById("errmessages");
  const errorMessages1 = document.getElementById("errmessages1");
  const errorMessages2 = document.getElementById("errmessages2");

  // Validation
  if (
    !textfrom ||
    !textto ||
    !email ||
    !age ||
    !phonenb ||
    !fullname ||
    !returntime ||
    !returndate
  ) {
    errorMessages.innerHTML = "All fields are required!";
    return;
  }

  if (isNaN(age) || age < 3 || age > 95) {
    errorMessages1.innerHTML = "Age should be a number between 3 and 95.";
    return;
  }

  if (phonenb.length !== 8 || isNaN(phonenb)) {
    errorMessages2.innerHTML = "Check your phone number!";
    return;
  }

  // Clear previous error messages
  errorMessages.innerHTML = "";
  errorMessages1.innerHTML = "";
  errorMessages2.innerHTML = "";

  // Create a table row with delete button
  const tableRow = document.createElement("tr");
  tableRow.innerHTML = `
      <td>${fullname}</td>
      <td>${email}</td>
      <td>${age}</td>
      <td>${phonenb}</td>
      <td>${textfrom}</td>
      <td>${textto}</td>
      <td>${returndate}</td>
      <td>${returntime}</td>
      <td><button onclick="deleteBooking(this)">Delete</button></td>
    `;

  // Append the table row to the table body
  const bookPostsContainer = document.getElementById("bookPostsContainer");
  bookPostsContainer.appendChild(tableRow);

  // Show the table and update the count message
  const bookingsTable = document.getElementById("bookingsTable");
  bookingsTable.style.display = "table";
  const bookCountMessage = document.getElementById("bookCountMessage");
  bookCountMessage.style.display = "block";
  bookCountMessage.innerText = `Total Bookings: ${bookPostsContainer.children.length}`;

 
}


//delete the booking in the booking page
function deleteBooking(button) {
  const row = button.closest("tr");
  row.remove();
  const bookPostsContainer = document.getElementById("bookPostsContainer");
  const bookCountMessage = document.getElementById("bookCountMessage");
  bookCountMessage.innerText = `Total Bookings: ${bookPostsContainer.children.length}`;
}




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

  window.location.href = "bookflight.html";
  
 
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



/*FaQ & feedback

$(document).ready(function() {
	$('.answer').hide(); // hide answers
	$('.question').click(function() { // to click on the question
		$(this).next('.answer').slideToggle(); // to slide to the answer when you click on the question
	});
});

*/
>>>>>>> d993208a91bb4af337db207f22e9c79365ccccf2
