package com.javaglobant.challengetopic2.model;

import org.springframework.stereotype.Repository;

@Repository
public class CanonColorAndBAW implements Printers {

    private final String NAME = "Canon G4110";
    private final boolean COLOR = true;
    private final boolean BLACKANDWHITE = true;


    @Override
    public String getNAME() {
        return NAME;
    }

    @Override
    public boolean isCOLOR() {
        return COLOR;
    }

    @Override
    public boolean isBLACKANDWHITE() {
        return BLACKANDWHITE;
    }


    @Override
    public String printOut() {
        return ("you've chosen "+NAME+" by print out the document");
    }
}
