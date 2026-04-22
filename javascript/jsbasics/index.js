
/*
console.log(`hello`);
console.log(`i like pizza`);

window.alert(`this is an alert!`);
window.alert(`i like pizza!`);

document.getElementById("myh1").textContent= "hello";
document.getElementById("myp").textContent=" i like pizza !";

*/


// let x;
// let y = 123;

// x=100;

// console.log(x);


// let firstname="Bro";
// let favoritefood ="i like pizza";
// let email = "Bro123@gmail.com";

// console.log(typeof firstname);
// console.log(`your name is ${firstname}`);
// console.log (`you like ${favoritefood}`);

// let age = 25;
// let price = 10.09;
// let gpa = 2.1;

// console.log(typeof gpa );
// console.log(`you are ${age} years old`);
// console.log(`the price is ${price}`);
// console.log(`your gpa is ${gpa}`);

// let online = true;
// let forsale = true;
// let isstudent = true

// console.log(`bro is online : ${online}`);
// console.log(`is this car for sale :${forsale}`);
// console.log(`Enrolled : ${isstudent}`);


// let firstname="hasan ";
// let age = 21;
// let student = false;

// document.getElementById("p1").textContent =`your name is ${fullname}` ;
// document.getElementById("p2").textContent = `your age is ${age}`;
// document.getElementById("p2").textContent = `i am a student ${student}`;



// let students =30;

// students+=1;
// students-=1;
// students/=1;
// students*=2;
// students= students ** 3; students **= 3;//power of 3
// students %= 2;
// let extrastudents =students % 3;

// students ++;
// students --;

// console.log(students);


// let result = 1 + 2 * 3 + 4 ** 2;

// console.log (result);



// let username;

// username = window.prompt("whats your username ?");
// console.log (username);


// let username;
// document.getElementById("mysubmit").onclick = function (){

//     username = document.getElementById("mytext").ariaValueMax;
//     console.log(username);
//     document.getElementById("myh1").textContent = `hello ${username}`;
// }

// let age = window.prompt ("how old are you ");
// age = Number (age);
// age+=1;
// console.log(age,typeof age );


// let x = "pizza ";
// let y = "pizza ";
// let z="pizza";
// x=Number(x);
// y=String(y);
// z=Boolean(z);
// console.log(x,typeof x);
// console.log(y,typeof y);
// console.log(z,typeof z);


// const PI=3.14159;
// let radius;
// let circumference;
// document.getElementById("mysubmit").onclick=function(){
//     radius = document.getElementById("mytext").value;
//     radius = Number(radius);
//     circumference= 2 * PI * radius
//     document.getElementById("myh3").textContent= circumference + "cm";
// }

// Math.PI

// console.log(Math.PI);
// console.log(Math.E);


// let x= 3.21;
// let y= 2;
// let z;

// z=Math.round(x);
// z=Math.floor(x);
// z=Math.ceil(x);
// z=Math.trunc(x);
// z=Math.power(x,y);
// z=Math.sqrt(x);
// z=Math.log(x);
// z=Math.sin(x);
// z=Math.cos(x);
// z=Math.tan(x);
// z=Math.abs(x);
// z=Math.sign(x);


// console.log(z);

// const min=50;
// const max = 100;


// let randomnb = Math.floor(Math.random() * (max-min)) + min;

// console.log(randomnb);


// const mybtn = document.getElementById("mybtn");
// const mylbl = document.getElementById("mylabel");

// const min=1;
// const max=6;
// let rand;

// mybtn.onclick = function(){
//     rand = Math.floor(Math.random() * max) + min;
//     mylbl.textContent=rand;

// }



// const mytext = document.getElementById("mytext");
// const mysubmit= document.getElementById("mysubmit");
// const resultelement=document.getElementById("resultelement");

// let age;

// mysubmit.onclick = function(){

//     age = mytext.value;
//     age = Number(age);

//     if(age>=100){
//         resultelement.textContent = "you are too old to enter rhis site";
//     }
//     else if(age == 0){
//         resultelement.textContent = "you can't enter. you were just born";
//     }
//     else if(age >= 18){
//         resultelement.textContent = "you are old enough to enter this site";
//     }
//     else if(age < 0){
//         resultelement.textContent = "your age can't be below 0";
//     }
//     else{
//         resultelement.textContent = "you must be 18+ to enter this site";
//     }
// }


// let age =21;

// let message;
//  if(age>=18){
//     message="youre an adult";
//  }else{
//     message = "youre not an adult";
//  }



// let age=21;
// let message= age>=18 ? "youre an adult": "youre a minor";
// console.log (message);


// let time= 16;
// let greating = time <12 ? "good morning" : "good night";
// console.log(greating);


// let isstudent=true;
// let message= isstudent ? "you are a student": "not a sudent";
// console.log (message);


// let purchaseamount=125;
// let discount= purchaseamount>=100 ? 10: 0;
// console.log(`your total is $${purchaseamount-purchaseamount*(discount/100)}`);



// let choice =0;

// switch (choice){
//     case 1:

//     break;

//     case 2:

//     break;

//     case 3:

//     break;

//     case 4:

//     break;

//     default:

// }


// let username="hasan";

// console.log(username.charAt(0));

// username.indexOf("a");
// username.lastIndexOf();
// username.length;

// username= username.trim();
// console.log(username);

// username.toUpperCase();
// username.toLowerCase();
// username.repeat(3);

// let result =username.startsWith(" ");
// let result2 =username.endsWith(" ");
// let result3 =username.includes(" ");
// if(result){ 
//     console.log("");
// }else{
//     console.log(username);
// }



// let phonenb="123-456-7890";

// phonenb=phonenb.replaceAll("-","/");

// phonenb=phonenb.padStart(15,"0");

// phonenb=phonenb.padEnd(15,"0");



// const fullname="hasan al ammar";

//  let firstname= fullname.slice(0,5);
// let firstname= fullname.slice(0,fullname.indexof(" "));

// let firstchar= fullname.slice(0,1);
//  let lastchar= fullname.slice(-3);

// console.log(firstname);
//  let lastname= fullname.slice(6,13);
// let lastname= fullname.slice(fullname.indexOf(" ")+1);


// const email= "hasan1@gmail.com";
// let username=email.slice (0,email.indexOf("@"));
// let extension = email.slice(email.indexOf("@"))
// console.log(username);
// console.log(extension);




// let username=window.prompt("enter your username:");
// username=username.trim();
// let letter = username.charAt(0);
// letter = letter.toUpperCase();

// let extrachars= username.slice(1);
// extrachars=extrachars.toLowerCase();

// username=letter + extrachars;
// console.log(username);

// username=username.trim().charAt(0).toUpperCase() + username.trim().slice(1).toLowerCase();
// console.log(username);


const temp= 20;

if(temp > 0){
    console.log("the weather is good");

}
else if(temp <=30){
    console.log("the weather is good");

}else {
    console.log("the weather is bad");
}



















