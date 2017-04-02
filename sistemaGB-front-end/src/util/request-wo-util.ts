import { Injectable } from '@angular/core';
import { SelectItem } from 'primeng/primeng';


@Injectable()
export class RequestWoUtil {
    private selectItems: SelectItem[];
    private pt_br: any;

    public getListToDropDown(collection: any[], label: string): SelectItem[] {
        this.selectItems = [];
        this.selectItems.push({ label: 'Selecione:', value: null });
        for (let i = 0; i < collection.length; i++) {
            this.selectItems.push({ label: collection[i][label], value: collection[i] })
        }
        return this.selectItems;
    }

    public static getCalendarioPtBr() {

        return {

            firstDayOfWeek: 0,
            dayNames: ["Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"],
            dayNamesShort: ["Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"],
            dayNamesMin: ["Do", "Se", "Te", "Qa", "Qi", "Se", "Sa"],
            monthNames: ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"],
            monthNamesShort: ["Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"]
        }
    }

} 
