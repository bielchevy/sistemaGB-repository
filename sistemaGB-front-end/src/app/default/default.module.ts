import { DefaultComponent } from './default.component';
import { DefaultRoutingModule } from './default-routing.module';

import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';



@NgModule({
    imports: [
        CommonModule,
        DefaultRoutingModule,
        FormsModule
        
    ],
    declarations: [DefaultComponent]
})
export class DefaultModule {}