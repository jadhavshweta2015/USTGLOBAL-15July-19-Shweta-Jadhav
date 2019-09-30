let e=document.getElementById('demo');
console.log(e);
e.textContent='this is new';

let w=document.getElementsByClassName('blue')
console.log(w);

let q=document.getElementsByTagName('p');
console.log(q);

let q1=document.getElementsByName('hname');
console.log(q1);


let q2=document.querySelector('#demo')
console.log(q2);

let q3=document.querySelectorAll('.blue')
console.log(q3);

let q4=document.createElement('button');
q4.textContent='click here';
console.log(q4);

document.body.appendChild(q4);

console.log("===============================");
 
// var a2=document.createElement('table');
// console.log(a2);

// var a3=document.createElement('tr');
// console.log(a3);

// var a4=document.createElement('td')
// console.log(a4);
// a4.textContent='name';

// var a5=document.createElement('td')
// console.log(a5);
// a5.textContent='age';

let b=document.getElementById('b1');
b.className='add';
b.classList='add add1';

document.getElementById('id1').innerHTML=
                                        `<table border=1px>
                                        <tr>
                                        <td>Name</td>
                                        <td>age</td>
                                        </tr>
                                        <tr>
                                        <td>a</td>
                                        <td>1</td>
                                        </tr>

                                        </table>`;


document.getElementById('id2').innerHTML=
                                        `
                                        <ol>
                                        <li>a</li>
                                        <li>b</li>
                                        <li>c</li>
                                        </ol>
                                        <ul>
                                        <li>a</li>
                                        <li>b</li>
                                        <li>c</li>
                                        </ul>
                                        `;

document.getElementById('id3').innerHTML=
                                        `
                                        <table border=1px>
                                        <tr>
                                        <td>Name</td>
                                        <td>age</td>
                                        <td>Address</td>
                                        <td>DOB</td>
                                        <td>email</td>
                                        <td>gender</td>
                                        </tr>
                                        <tr>
                                        <td>shweta</td>
                                        <td>21</td>
                                        <td>pune</td>
                                        <td>14 Aug</td>
                                        <td>s@gmail.com</td>
                                        <td>Female</td>
                                        </tr>
                                        <tr>
                                        <td>sukanya</td>
                                        <td>21</td>
                                        <td>pune</td>
                                        <td>18 April</td>
                                        <td>suk@gmail.com</td>
                                        <td>Female</td>
                                        </tr>
                                        </table>                                       
                                        `;


let ex=document.getElementById('id4');
ex.classList='form1';

document.getElementById('id4').innerHTML=
                                        `
                                        <form>
                                        <fieldset width=50%>
                                        <div>
                                        <label for="name">Name<label>
                                        <input type="text" name="name" id="name">
                                        </div>
                                        <br>
                                        <div>
                                        <label for="name">Age<label>
                                        <input type="number" name="name" id="name">
                                        </div>
                                        <br>
                                        <div>
                                        <label for="description">Address<label>
                                        <textarea name="description" id="description" cols="30" rows="1">
                                        </textarea>
                                        </div>
                                        <br>
                                        <div>
                                        <label for="name">DOB<label>
                                        <input type="Date" name="name" id="name">
                                        </div>
                                        <br>
                                        <div>
                                        <label for="name">Email<label>
                                        <input type="email" name="name" id="name">
                                        </div>
                                        </br>
                                        <div>
                                        <label for="name">Gender<label>
                                        <input type="radio" name="gender">Male
                                        
                                        <input type="radio" name="gender">FeMale

                                        </div>
                                        </fieldset>
                                        </form>                                        
                                        `
let p=document.getElementById('demo1');  
p.style.color='red';
p.classList='demo1 add1';
 