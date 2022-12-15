package com.dgd.ITV.domain.useCase;

import com.dgd.ITV.data.PropietarioDataStore;
import com.dgd.ITV.domain.models.Propietario;

public class GuardarPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public void execute(Propietario propietario) {
        dataStore.guardar(propietario);
    }
}
