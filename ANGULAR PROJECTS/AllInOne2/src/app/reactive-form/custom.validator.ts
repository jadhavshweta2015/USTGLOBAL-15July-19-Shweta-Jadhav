import { ValidationErrors, AbstractControl } from '@angular/forms';

export class Customvalidator{
    static nospace(control:AbstractControl): ValidationErrors|null
    {
        if((control.value as String).indexOf('')>=0){
            return {nospace:true}
        }else{
            return null;
        }
    }
}