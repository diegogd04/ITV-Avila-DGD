package com.dgd.ITV.demo.domain.usecase;

import com.dgd.ITV.demo.data.DemoDataStore;
import com.dgd.ITV.demo.domain.models.Demo;

public class EliminarDemoUseCase {
    private DemoDataStore dataStore = DemoDataStore.getInstance();

    public void execute(String codigo) {
        dataStore.eliminar(codigo);
    }
}
