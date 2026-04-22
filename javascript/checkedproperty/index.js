

const mycheckbox=document.getElementById("mycheckbox");
const visabtn = document.getElementById("visabtn");
const mastercardbtn = document.getElementById("mastercardbtn");
const paypalbtn= document.getElementById("paypalbtn");
const mysubmit=document.getElementById("mysubmitbtn");
const subresult=document.getElementById("subresult");
const paymentresult=document.getElementById("paymentresult");

mysubmit.onclick = function(){

    if(mycheckbox.checked){
        subresult.textContent="you are subscribed";

    }
    else{
        subresult.textContent = " you are not subscribed";
    
    }

    if(visabtn.checked){
        paymentresult.textContent=`you are paying with visa`;

    }else if(mastercardbtn.checked){
        paymentresult.textContent=`you are paying with master card`;

    }else if(paypalbtn.checked){
        paymentresult.textContent=`you are paying with paypal`;

    }
    else{
        paymentresult.textContent=`you must select a payment type`;

    }



}



