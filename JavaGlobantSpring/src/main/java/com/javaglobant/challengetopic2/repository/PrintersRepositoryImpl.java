package com.javaglobant.challengetopic2.repository;

import com.javaglobant.challengetopic2.config.AppConfig;
import com.javaglobant.challengetopic2.model.CanonColorAndBAW;
import com.javaglobant.challengetopic2.model.HPBlackAndWhite;
import com.javaglobant.challengetopic2.model.Printers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class PrintersRepositoryImpl implements PrintersRepository{

    @Override
    public List<Printers> findPrinters() {
        List<Printers> printers = new ArrayList<Printers>();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CanonColorAndBAW canon = (CanonColorAndBAW) applicationContext.getBean("canonColorAndBAW");
        HPBlackAndWhite hp = (HPBlackAndWhite) applicationContext.getBean("hpBlackAndWhite");

        printers.add(canon);
        printers.add(hp);
        return printers;
    }
}
