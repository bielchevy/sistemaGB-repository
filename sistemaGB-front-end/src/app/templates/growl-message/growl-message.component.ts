import { Message } from 'primeng/primeng';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'growl-message',
  templateUrl: './growl-message.component.html',
  styleUrls: ['./growl-message.component.css']
})
export class GrowlMessageComponent implements OnInit {

  msgs: Message[] = [];

  constructor() { }

  ngOnInit() {
  }


public showSucessMsg(msg:string) {
    this.msgs.push({severity:'sucess', summary:'Suceso', detail:msg});
}

public showErroMsg(msg:string) {
    this.msgs.push({severity:'error', summary:'Erro', detail:msg});
}

public showWarnigMsg(msg:string) {
    this.msgs.push({severity:'warn', summary:'Alerta', detail:msg});
}

public hide() {
    this.msgs = [];
}  

}
