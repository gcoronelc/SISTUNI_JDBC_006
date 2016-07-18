package pe.eth.Travisaapp.service.espec;

import java.util.ArrayList;
import java.util.List;

public interface  CrudServiceEspec<T> {
 
    String insertar(T bean);

    String update(T bean);

    String delete(String p);

    T buscar(String p);

    ArrayList<T> listabuscar(String p);

    T leer(String codigo);

    List<T> leerVarios(T bean);

}
