const myobj = {
    prop1 : "hey",
    prop2 : "you",
    prop3 : function(){
        return this.prop1 + this.prop2;
    }
};
console.log(myobj.prop3);
