import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VendedorManterComponent } from './vendedor-manter.component';

describe('VendedorManterComponent', () => {
  let component: VendedorManterComponent;
  let fixture: ComponentFixture<VendedorManterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VendedorManterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VendedorManterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
