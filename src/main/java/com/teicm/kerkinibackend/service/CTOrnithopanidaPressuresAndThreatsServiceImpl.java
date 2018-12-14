package com.teicm.kerkinibackend.service;


import com.teicm.kerkinibackend.Repository.CTOrnithopanidaPressuresAndThreatsRep;
import com.teicm.kerkinibackend.api.v1.mapper.CTOrnithopanidaPressuresAndThreatsMapper;
import com.teicm.kerkinibackend.domain.Ornithopanida.CTOrnithopanidaPressuresAndThreats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CTOrnithopanidaPressuresAndThreatsServiceImpl implements CTOrnithopanidaPressuresAndThreatsService
{
    private CTOrnithopanidaPressuresAndThreatsMapper ctOrnithopanidaPressuresAndThreatsMapper;

    @Autowired
    private CTOrnithopanidaPressuresAndThreatsRep ctOrnithopanidaPressuresAndThreatsRep;

    public CTOrnithopanidaPressuresAndThreatsServiceImpl(CTOrnithopanidaPressuresAndThreatsMapper ctOrnithopanidaPressuresAndThreatsMapper, CTOrnithopanidaPressuresAndThreatsRep ctOrnithopanidaPressuresAndThreatsRep)
    {
        this.ctOrnithopanidaPressuresAndThreatsMapper = ctOrnithopanidaPressuresAndThreatsMapper;
        this.ctOrnithopanidaPressuresAndThreatsRep = ctOrnithopanidaPressuresAndThreatsRep;
    }

    @Override
    public List<CTOrnithopanidaPressuresAndThreats> findAll()
    {
        return ctOrnithopanidaPressuresAndThreatsRep.findAll();
    }
}
