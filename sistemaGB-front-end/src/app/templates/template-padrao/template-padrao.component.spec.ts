import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplatePadraoComponent } from './template-padrao.component';

describe('TemplatePadraoComponent', () => {
  let component: TemplatePadraoComponent;
  let fixture: ComponentFixture<TemplatePadraoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TemplatePadraoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplatePadraoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
