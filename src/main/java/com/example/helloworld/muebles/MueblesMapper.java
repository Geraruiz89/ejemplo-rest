package com.example.helloworld.muebles;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


@Repository
public interface MueblesMapper {
    @Select("SELECT * FROM Mueble")
    public List<Mueble> getAll();
    
    @Select("SELECT * FROM Mueble WHERE id = #{id} ")
    public List<Mueble> getById(int id);

    @Insert("INSERT INTO Mueble VALUES(#{id},#{nombre},#{color},#{precio},#{agotado})")
    public void insert(Mueble m);
    
    @Update("UPDATE Mueble SET id=#{id}, nombre=#{nombre}, color=#{color}, precio=#{precio}, agotado=#{agotado} WHERE id=#{id}")
    public void update(Mueble m);
    
    @Delete("DELETE FROM Mueble WHERE id=#{idmueble}")
    public void delete(int idMueble);
}
