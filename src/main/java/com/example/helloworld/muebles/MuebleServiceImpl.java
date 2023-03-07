package com.example.helloworld.muebles;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary

public class MuebleServiceImpl implements MueblesService{
	private MueblesMapper muemap;

	public MuebleServiceImpl(MueblesMapper muemap) {
		this.muemap = muemap;
	}

	@Override
	public List<Mueble> getAll() {
		return muemap.getAll();
	}

	@Override
	public List<Mueble> getInsert(Mueble m) {
		muemap.insert(m);
		return muemap.getAll();
	}

	@Override
	public List<Mueble> getEleById(int m) {
		return muemap.getById(m);
	}

	@Override
	public String Borrar(int id) {
		muemap.delete(id);
		return "se borro el elemento =)";
	}

	@Override
	public List<Mueble> getUpdate(Mueble m) {
		muemap.update(m);
		return muemap.getById(m.getId());
	}

}
