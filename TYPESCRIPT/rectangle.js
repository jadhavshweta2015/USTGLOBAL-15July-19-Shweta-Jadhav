console.log("==================nested namespace======");
var RectOpeartion;
(function (RectOpeartion) {
    var rectangle;
    (function (rectangle) {
        function area(length, width) {
            console.log("area" + length + width);
        }
        rectangle.area = area;
        function perimiter(length, width) {
            console.log("area" + length + width);
        }
        rectangle.perimiter = perimiter;
    })(rectangle = RectOpeartion.rectangle || (RectOpeartion.rectangle = {}));
})(RectOpeartion || (RectOpeartion = {}));
RectOpeartion.rectangle.area(12, 23);
RectOpeartion.rectangle.perimiter(12, 23);
