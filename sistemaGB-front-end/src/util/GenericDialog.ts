export class GenericDialog {
    protected visible:boolean = false;

    public show():void{
        this.visible = true;
    }

    public hide():void{
        this.visible = false;
    }
}