import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VendedorPesquisaComponent } from './vendedor-pesquisa.component';

describe('VendedorPesquisaComponent', () => {
  let component: VendedorPesquisaComponent;
  let fixture: ComponentFixture<VendedorPesquisaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VendedorPesquisaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VendedorPesquisaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
