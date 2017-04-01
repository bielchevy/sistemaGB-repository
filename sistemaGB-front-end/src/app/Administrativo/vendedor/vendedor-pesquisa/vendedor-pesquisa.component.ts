import { VendedorVO } from './../../../../vo/VendedorVO';
import { VendedorService } from './../../../../provider/vendedor.servico';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vendedor-pesquisa',
  templateUrl: './vendedor-pesquisa.component.html',
  styleUrls: ['./vendedor-pesquisa.component.css']
})
export class VendedorPesquisaComponent implements OnInit {

  vendedor: VendedorVO;
      

  constructor(private vendedorService: VendedorService) { }

  public vendedorPesquisa: VendedorVO[];

  ngOnInit() {
    this.vendedorService.buscarTodosAtivos().then(u => this.vendedorPesquisa = u);
  }

  private deletar(codigo: number): void{
    this.vendedor = new VendedorVO();
      let paramVendedor = new VendedorVO(codigo); 
    this.vendedorService.deletar(paramVendedor).then((data: VendedorVO) => {
    }).catch((e) => {
      console.error(e);
    })
  }


}
