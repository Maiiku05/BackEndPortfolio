package com.aixa.backend.service;

import java.util.List;

import com.aixa.backend.model.PerfilPersonal;

public interface IPerfilPersonalService { 

    public List<PerfilPersonal> verPerfilPersonal ();

    public void agregarDatosPerfilPersonal (PerfilPersonal ppe);

    public void borrarDatosPerfilPersonal (Long id);

    public void editDatosPerfilPersonal (PerfilPersonal ppe);

}
