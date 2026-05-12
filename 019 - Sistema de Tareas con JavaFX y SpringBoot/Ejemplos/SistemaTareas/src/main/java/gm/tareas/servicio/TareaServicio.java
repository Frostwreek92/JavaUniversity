package gm.tareas.servicio;

import gm.tareas.modelo.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gm.tareas.repositorio.TareaRepositorio;
import java.util.List;

@Service
public class TareaServicio implements ITareaServicio{
    @Autowired
    private TareaRepositorio tareaRepositorio;

    @Override
    public List<Tarea> listarTareas() {
        return tareaRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        Tarea Tarea = tareaRepositorio.findById(idTarea).orElse(null);
        return Tarea;
    }

    @Override
    public void guardarTarea(Tarea Tarea) {
        tareaRepositorio.save(Tarea);
    }

    @Override
    public void eliminarTarea(Tarea Tarea) {
        tareaRepositorio.delete(Tarea);
    }
}

