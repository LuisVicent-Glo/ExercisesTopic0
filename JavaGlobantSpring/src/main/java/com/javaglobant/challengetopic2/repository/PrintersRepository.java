package com.javaglobant.challengetopic2.repository;

import com.javaglobant.challengetopic2.model.Printers;

import java.util.List;

public interface PrintersRepository {
    List<Printers> findPrinters();
}
