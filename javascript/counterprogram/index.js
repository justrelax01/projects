
const decreasebtn= document.getElementById("decreasebtn");
const incresebtn= document.getElementById("increasebtn");
const resetbtn= document.getElementById("resetbtn");

const countlabel=document.getElementById("countlabel");

let count=0;

incresebtn.onclick=function(){
    count++;
    if(count>=0){
        countlabel.textContent = count;
    }

}

decreasebtn.onclick=function(){
    
    count--;
    if(count>=0){
        countlabel.textContent=count;
      
    }
   
}

resetbtn.onclick = function(){
    count=0;
    countlabel.textContent = count;
}

