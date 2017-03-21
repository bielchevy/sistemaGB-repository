import { SistemaGBFrontEndPage } from './app.po';

describe('sistema-gb-front-end App', () => {
  let page: SistemaGBFrontEndPage;

  beforeEach(() => {
    page = new SistemaGBFrontEndPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
