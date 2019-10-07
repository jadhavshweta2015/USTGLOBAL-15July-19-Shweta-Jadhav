import { Injectable } from '@angular/core';

@Injectable({
    providedIn:'root',
})

export class UserService{
    users=[
        {
            name: 'shweta',
            company:'ust'
        },
        {
            name: 'shweta',
            company:'ust'
        },
        {
            name: 'shweta',
            company:'ust'
        }
    ];
    printDetails(){
        console.log('function is executing');
    }
}