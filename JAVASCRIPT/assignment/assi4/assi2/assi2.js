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


                                        //=====================CreateElement for table========================


var a2=document.createElement('table');



var a3=document.createElement('tr');
a2.appendChild(a3);


var a4=document.createElement('td')
a4.textContent='name';
a3.appendChild(a4);

var a5=document.createElement('td')
 a5.textContent='age';
 a3.appendChild(a5);


 ///=========================================
let tr2=document.createElement('tr');
a2.appendChild(tr2);

var a6=document.createElement('td')
a6.textContent='a';
tr2.appendChild(a6);

var a7=document.createElement('td')
 a7.textContent='1';
 tr2.appendChild(a7);

 console.log(a2);
 document.body.appendChild(a2);

 ///=========================================
let tr3=document.createElement('tr');
a2.appendChild(tr3);

var a8=document.createElement('td')
a8.textContent='b';
tr3.appendChild(a8);

var a9=document.createElement('td')
 a9.textContent='21';
 tr3.appendChild(a9);

a2.style.border='1px solid black';
a3.style.border='1px solid black';
a4.style.border='1px solid black';
a5.style.border='1px solid black';
a6.style.border='1px solid black';
a7.style.border='1px solid black';
a8.style.border='1px solid black';
a9.style.border='1px solid black';


 console.log(a2);
 document.body.appendChild(a2);