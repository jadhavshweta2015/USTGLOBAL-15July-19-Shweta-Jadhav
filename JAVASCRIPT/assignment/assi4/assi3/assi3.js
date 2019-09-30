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



//==============create element==========
var formsample=document.getElementById('id5');
var form=document.createElement('form');

form.setAttribute("action","");
form.setAttribute("method","POST");
formsample.appendChild(form)

var label1=document.createElement('label');
label1.textContent='Name';
form.appendChild(label1);

var input1=document.createElement('input');
input1.setAttribute("type","text");
input1.setAttribute("name","name1");
form.appendChild(input1);

var br1=document.createElement('br');
form.appendChild(br1);
var br2=document.createElement('br');
form.appendChild(br2);

var label2=document.createElement('label');
label2.textContent='Age';
form.appendChild(label2);

var input2=document.createElement('input');
input2.setAttribute("type","number");
input2.setAttribute("name","name1");
form.appendChild(input2);

var br3=document.createElement('br');
form.appendChild(br3);
var br4=document.createElement('br');
form.appendChild(br4);

var label3=document.createElement('label');
label3.textContent='Address';
form.appendChild(label3);

var input4=document.createElement('textarea');
input4.setAttribute("type","number");
input4.setAttribute("name","name1");
form.appendChild(input4);

var br5=document.createElement('br');
form.appendChild(br5);
var br6=document.createElement('br');
form.appendChild(br6);

var label5=document.createElement('label');
label5.textContent='DOB';
form.appendChild(label5);

var input6=document.createElement('input');
input6.setAttribute("type","date");
input6.setAttribute("name","name1");

form.appendChild(input6);

form.style.border="1px solid black"
form.style.width="30%";
form.style.background="#eee"

console.log(form);
 document.body.appendChild(form);