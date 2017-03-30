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


  constructor(
    private vendedorService: VendedorService,
    private route: ActivatedRoute,
    private location: Location
  ){}
  

  ngOnInit() {
    
    this.route.params.forEach((params: Params) =>{
      let id: number = +params['id'];
      let vendedor = new VendedorVO(id);

      this.vendedorService.bucarPorCodigo(vendedor).then((vendedor: VendedorVO) => { console.log(vendedor)} );
    });
  }

  
    getFormGroupClass(isValid: boolean, isPristine: boolean): {} {
        return {
            'form-group': true,
            'has-danger': !isValid && !isPristine,
            'has-success': isValid && !isPristine
        };
    }

    getFormControlClass(isValid: boolean, isPristine: boolean): {} {
        return {
            'form-control': true,
            'form-control-danger': !isValid && !isPristine,
            'form-control-success': isValid && !isPristine
        };
    }

}
