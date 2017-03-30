import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdministrativoRoutingModule } from 'app/Administrativo/administrativo-routing.module';
import { VendedorManterComponent } from './vendedor/vendedor-manter/vendedor-manter.component';
import { VendedorPesquisaComponent } from './vendedor/vendedor-pesquisa/vendedor-pesquisa.component';

@NgModule({
    imports: [
        CommonModule,
        AdministrativoRoutingModule,
        FormsModule
        
    ],
    declarations: [VendedorPesquisaComponent, VendedorManterComponent]
})
export class AdministrativoModule {}