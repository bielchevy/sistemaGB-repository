

import { Constantes } from './../../../../util/Constantes';
import { VendedorVO } from './../../../../vo/VendedorVO';
import { VendedorService } from './../../../../provider/vendedor.servico';
import { Component, OnInit, ViewChild, EventEmitter, Output} from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-vendedor-manter',
  templateUrl: './vendedor-manter.component.html',
  styleUrls: ['./vendedor-manter.component.css'],
})
export class VendedorManterComponent implements OnInit {

  vendedor: VendedorVO;
  sucesso: boolean = false;

  constructor(
    private vendedorService: VendedorService,
    private route: ActivatedRoute,
    private location: Location
  ){}
  

  ngOnInit() {
    
    this.route.params.forEach((params: Params) =>{
      let id: number = +params['id'];
      this.vendedor = new VendedorVO();
      this.vendedor.codigo = id;
      if(id){
        this.vendedorService.buscarPorCodigo(this.vendedor).then((vendedor: VendedorVO) => { 
          this.vendedor = vendedor});
      }

    });
  }

  debug(): string {
		return JSON.stringify(this.vendedor);
	}

  private salvar(): void{
    this.vendedorService.salvar(this.vendedor).then((data: VendedorVO) => {
console.log( this.sucesso );
      this.sucesso = true;
console.log( this.sucesso );
    }).catch((e) => {
      console.error(e);
    })
    
  }

   private checkboxSelect(checked: boolean): void {
        if(checked){ 
          this.vendedor.dataRetirada = new Date;        
          console.log(this.vendedor);
        }else{
          this.vendedor.dataRetirada = null;  
          console.log(this.vendedor);
        }
    }

}
