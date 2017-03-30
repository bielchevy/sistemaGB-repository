export class GenericVO{

    constructor(source?:any){
        if(source!=null){
            this.fill(source);
        }
    }

    public fill(source?:any):any{
        for(var propName in source){
            this[propName] = source[propName];
        }
        return this;
    }
}