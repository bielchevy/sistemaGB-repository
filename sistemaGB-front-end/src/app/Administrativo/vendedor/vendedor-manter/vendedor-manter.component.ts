import { VendedorVO } from './../../../../vo/VendedorVO';
import { VendedorService } from './../../../../provider/vendedor.servico';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-vendedor-manter',
  templateUrl: './vendedor-manter.component.html',
  styleUrls: ['./vendedor-manter.component.css']
})
export class VendedorManterComponent implements OnInit {

  vendedor: VendedorVO;
  constructor(
    private vendedorService: VendedorService,
    private route: ActivatedRoute,
    private location: Location
  ){}
  

  ngOnInit() {
    
    this.route.params.forEach((params: Params) =>{
      let id: number = +params['id'];
      this.vendedor = new VendedorVO();
      let paramVendedor = new VendedorVO(id);
      
      if(id){
        this.vendedorService.buscarPorCodigo(paramVendedor).then((vendedor: VendedorVO) => { 
          this.vendedor = vendedor});
        console.log(this.vendedor);
        console.log(paramVendedor);   
      }

    });
  }

  private salvar(): void{
    this.vendedorService.salvar(this.vendedor).then((data: VendedorVO) => {
    }).catch((e) => {
      console.error(e);
    })
  }

}
