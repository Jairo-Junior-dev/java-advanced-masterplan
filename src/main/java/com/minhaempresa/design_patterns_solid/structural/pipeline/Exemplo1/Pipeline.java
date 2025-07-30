package com.minhaempresa.design_patterns_solid.structural.pipeline.Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private List<Step> steps = new ArrayList<>();

    public void addStep(Step step){
        steps.add(step);
    }
    public boolean execute(Pessoa pessoa) {
        for (Step step : steps) {
            if (!step.validar(pessoa)) {
                return false;
            }
        }
        return true;
    }
}
