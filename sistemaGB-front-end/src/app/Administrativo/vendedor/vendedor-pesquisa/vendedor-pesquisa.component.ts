import { VendedorVO } from './../../../../vo/VendedorVO';
import { VendedorService } from './../../../../provider/vendedor.servico';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vendedor-pesquisa',
  templateUrl: './vendedor-pesquisa.component.html',
  styleUrls: ['./vendedor-pesquisa.component.css']
})
export class VendedorPesquisaComponent implements OnInit {

  constructor(private vendedorService: VendedorService) { }

  public vendedorPesquisa: VendedorVO[];

  ngOnInit() {
    this.vendedorService.buscarTodos().then(u => this.vendedorPesquisa = u);
  }


}
