package com.aixa.backend.service;

import java.util.List;

import com.aixa.backend.model.EduInfoEdit;

public interface IEduService { 

    public List<EduInfoEdit> verEduc ();

    public void agregarEduc (EduInfoEdit edu);

    public void borrarEduc (Long id);

    public void editEduc (EduInfoEdit edu);

}
