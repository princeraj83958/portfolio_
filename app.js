//$(document).ready(function(){



/*let hamberger = document.querySelector('.hamberger');
let times = document.querySelector('.times');
let mobileNav = document.querySelector('mobile-nav');

hamberger.addEventListener('click', function(){
mobileNav .classList .add('open');
});
*/
var typed = new Typed(".typing",{
    strings:["Programmer", "Web Developer", "Freelancer", "Engineering Student"],
    typeSpeed: 100,
    BackSpeed: 1,
    loop: true,
});
//times.addEventListener('click', function(){
    //mobileNav .classList 
    //.remove('open');
//});
//});
let menu = document.querySelector('.hamberger');
let navbar = document.querySelector('mobile-nav');

menu.onclick = () =>{
    menu.classList.toggle('fa-times');
    navbar.classList.toggle('active');
} 

window.onscroll = () =>{
    menu.classList.remove('fa-times');
    navbar.classList.remove('active');
} 
