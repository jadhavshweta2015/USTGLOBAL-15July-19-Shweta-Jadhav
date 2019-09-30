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
//========================Create ol list

var ol=document.createElement('ol');

var li1=document.createElement('li');
ol.appendChild(li1);
li1.textContent='Abc';

var li2=document.createElement('li');
ol.appendChild(li2);
li2.textContent='Abc';

var li3=document.createElement('li');
ol.appendChild(li3);
li3.textContent='Abc'

document.body.appendChild(ol);

//========================Create ul list

var ul=document.createElement('ul');

var li4=document.createElement('li');
ul.appendChild(li4);
li4.textContent='Abc';

var li5=document.createElement('li');
ul.appendChild(li5);
li5.textContent='Abc';

var li6=document.createElement('li');
ul.appendChild(li3);
li6.textContent='Abc'

document.body.appendChild(ul);
