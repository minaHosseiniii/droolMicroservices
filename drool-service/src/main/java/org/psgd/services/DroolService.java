package org.psgd.services;


import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.psgd.model.Order;
import org.springframework.stereotype.Service;

@Service
public class DroolService {
    public Integer executeRules(Order fact) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("session-1");
        kieSession.insert(fact);
        kieSession.fireAllRules();
        kieSession.dispose();
        return fact.getDiscount();
    }
}
