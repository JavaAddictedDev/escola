package com.jaddicted.io.escola.entity.domain;

import com.jaddicted.io.escola.entity.domain.enums.StatusProfissional;
import com.jaddicted.io.escola.entity.domain.values.CarteiraIdProfissional;
import com.jaddicted.io.escola.entity.domain.values.Pessoa;

public abstract class Profissional {
	private String cargo;
	private CarteiraIdProfissional carteiraIdProfissional;
	private StatusProfissional status;
}
