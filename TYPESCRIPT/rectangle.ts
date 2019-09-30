console.log("==================nested namespace======");
namespace RectOpeartion{
    export namespace rectangle{
        export function area(length:number,width:number){
            console.log("area"+length+width);
        }
        export function perimiter(length:number,width:number){
            console.log("area"+length+width);
        }
    }
}
RectOpeartion.rectangle.area(12,23);

RectOpeartion.rectangle.perimiter(12,23);
