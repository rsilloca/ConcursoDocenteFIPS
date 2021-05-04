package edu.unsa.concursodocente.viewmodels;

import java.util.Date;

import edu.unsa.concursodocente.models.Cronograma;
import lombok.Data;

@Data
public class CronogramaPostRequest {
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaClaseMagistral;
    private Date fechaAprobación;

    public Cronograma toCronograma() {
        var cronograma = new Cronograma();
        return updateCronograma(cronograma);
    }

    public Cronograma updateCronograma(Cronograma cronograma){
        cronograma.setFechaInicio(fechaInicio);
        cronograma.setFechaFin(fechaFin);
        cronograma.setFechaClaseMagistral(fechaClaseMagistral);
        cronograma.setFechaAprobación(fechaAprobación);
        return cronograma;
    }
}
