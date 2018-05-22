package dao;

import entidad.*;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

/**
 * Esta clase es la encargada de acceder a los datos. Contiene los mantenedores
 * de las tablas asociadas al sistema. Propaga los errores para ser mostrados
 * ante el usuario mediante la interfaz gráfica correspondiente. Usa la Clase
 * Conexion para acceder a la base de datos, también todas las clases de entidad
 * para el mantenimiento del sistema.
 *
 * @author Sebastian Cabellos, Nathalia Cerda Fecha creación: 27 de Junio,2017
 * Nombre de la clase: BibliotecaDAO
 *
 */
public class BibliotecaDAO {

    //establece la conexión con la Base de datos
    private Conexion conexion = new Conexion();

    // <editor-fold defaultstate="collapsed" desc="AUTOR">
    public String agregarAutor(Autor a) {
        String sql = "INSERT INTO autor(nombre, apellido_paterno, apellido_materno) VALUES('" + a.getNombre() + "','" + a.getApellidoPaterno() + "','" + a.getApellidoMaterno() + "')";
        return conexion.insertQuery(sql) ? "El autor se agregó correctamente." : "No se pudo agregar el autor.";
    }

    public String modificarAutor(int id, Autor a) {
        String sql = "UPDATE autor SET nombre = '" + a.getNombre() + "', apellido_paterno = '" + a.getApellidoPaterno() + "', apellido_materno = '" + a.getApellidoMaterno() + "' WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El autor se modificó correctamente." : "No se pudo modificar el autor.";
    }

    public Autor buscarAutor(int id) {
        String sql = "SELECT * FROM autor WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Autor(id, datos.getString("nombre"), datos.getString("apellido_paterno"), datos.getString("apellido_materno"));
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ArrayList<Autor> buscarAutores(String nombre) {
        ArrayList<Autor> autores = new ArrayList<>();
        String sql = "SELECT * FROM autor WHERE nombre LIKE '" + nombre + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                autores.add(new Autor(datos.getInt("id"), datos.getString("nombre"), datos.getString("apellido_paterno"), datos.getString("apellido_materno")));
            }
            return autores;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Autor> mostrarAutores() {
        ArrayList<Autor> autores = new ArrayList<>();
        String sql = "SELECT * FROM autor";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                autores.add(new Autor(datos.getInt("id"), datos.getString("nombre"), datos.getString("apellido_paterno"), datos.getString("apellido_materno")));
            }
            return autores;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarAutor(int id) {
        String sql = "DELETE FROM autor WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El autor se eliminó correctamente." : "No se pudo eliminar el autor.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="CATEGORÍA">
    public String agregarCategoria(String nombre) {
        String sql = "INSERT INTO categoria(nombre) VALUES('" + nombre + "')";
        return conexion.insertQuery(sql) ? "La categoría se agregó correctamente." : "No se pudo agregar la categoría.";
    }

    public String modificarCategoria(int id, String nombre) {
        String sql = "UPDATE categoria SET nombre = '" + nombre + "' WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La categoría se modificó correctamente." : "No se pudo modificar la categoría.";
    }

    public Categoria buscarCategoria(int id) {
        String sql = "SELECT * FROM categoria WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Categoria(id, datos.getString("nombre"));
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ArrayList<Categoria> buscarCategorias(String nombre) {
        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria WHERE nombre LIKE '" + nombre + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                categorias.add(new Categoria(datos.getInt("id"), datos.getString("nombre")));
            }
            return categorias;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Categoria> mostrarCategorias() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                categorias.add(new Categoria(datos.getInt("id"), datos.getString("nombre")));
            }
            return categorias;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarCategoria(int id) {
        String sql = "DELETE FROM categoria WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La categoría se eliminó correctamente." : "No se pudo eliminar la categoría.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="EDITORIAL">
    public String agregarEditorial(String nombre) {
        String sql = "INSERT INTO editorial(nombre) VALUES('" + nombre + "')";
        return conexion.insertQuery(sql) ? "La editorial se agregó correctamente." : "No se pudo agregar la editorial.";
    }

    public String modificarEditorial(int id, String nombre) {
        String sql = "UPDATE editorial SET nombre = '" + nombre + "' WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La editorial se modificó correctamente." : "No se pudo modificar la editorial.";
    }

    public Editorial buscarEditorial(int id) {
        String sql = "SELECT * FROM editorial WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Editorial(id, datos.getString("nombre"));
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ArrayList<Editorial> buscarEditoriales(String nombre) {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        String sql = "SELECT * FROM editorial WHERE nombre LIKE '" + nombre + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                editoriales.add(new Editorial(datos.getInt("id"), datos.getString("nombre")));
            }
            return editoriales;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Editorial> mostrarEditoriales() {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        String sql = "SELECT * FROM editorial";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                editoriales.add(new Editorial(datos.getInt("id"), datos.getString("nombre")));
            }
            return editoriales;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarEditorial(int id) {
        String sql = "DELETE FROM editorial WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La editorial se eliminó correctamente." : "No se pudo eliminar la editorial.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="LIBRO">
    public String agregarLibro(Libro l) {
        String sql = "INSERT INTO libro(isbn, titulo, idioma, numero_paginas, precio_referencia, año_publicacion, editorial_id) VALUES('" + l.getIsbn() + "','" + l.getTitulo() + "','" + l.getIdioma() + "'," + l.getNumeroPaginas() + "," + l.getPrecioReferencia() + "," + l.getAñoPublicacion() + "," + l.getEditorialId() + ")";
        return conexion.insertQuery(sql) ? "El libro se agregó correctamente." : "No se pudo agregar el libro.";
    }

    public String modificarLibro(int id, Libro l) {
        String sql = "UPDATE libro SET isbn = '" + l.getIsbn() + "', titulo = '" + l.getTitulo() + "', idioma = '" + l.getIdioma() + "', numero_paginas = " + l.getNumeroPaginas() + ", precio_referencia = " + l.getPrecioReferencia() + ", año_publicacion = " + l.getAñoPublicacion() + ", editorial_id = " + l.getEditorialId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El libro se modificó correctamente." : "No se pudo modificar el libro.";
    }

    public Libro buscarLibro(int id) {
        String sql = "SELECT * FROM libro WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Libro(id, datos.getString("isbn"), datos.getString("titulo"), datos.getString("idioma"), datos.getInt("numero_paginas"),
                    datos.getInt("precio_referencia"), datos.getInt("año_publicacion"), datos.getInt("editorial_id"));
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ArrayList<Libro> buscarLibros(String isbn) {
        ArrayList<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libro WHERE isbn LIKE '" + isbn + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                libros.add(new Libro(datos.getInt("id"), datos.getString("isbn"), datos.getString("titulo"), datos.getString("idioma"),
                        datos.getInt("numero_paginas"), datos.getInt("precio_referencia"), datos.getInt("año_publicacion"), datos.getInt("editorial_id")));
            }
            return libros;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Libro> mostrarLibros() {
        ArrayList<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libro";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                libros.add(new Libro(datos.getInt("id"), datos.getString("isbn"), datos.getString("titulo"), datos.getString("idioma"),
                        datos.getInt("numero_paginas"), datos.getInt("precio_referencia"), datos.getInt("año_publicacion"), datos.getInt("editorial_id")));
            }
            return libros;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarLibro(int id) {
        String sql = "DELETE FROM libro WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El libro se eliminó correctamente." : "No se pudo eliminar el libro.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="COPIA">
    public String agregarCopia(Copia c) {
        String sql = "INSERT INTO copia(numero_serie, estado, libro_id) VALUES('" + c.getNumeroSerie() + "','" + c.getEstado() + "'," + c.getLibroId() + ")";
        return conexion.insertQuery(sql) ? "La copia se agregó correctamente." : "No se pudo agregar la copia.";
    }

    public String modificarCopia(int id, Copia c) {
        String sql = "UPDATE copia SET numero_serie = '" + c.getNumeroSerie() + "', estado = '" + c.getEstado() + "', libro_id = " + c.getLibroId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La copia se modificó correctamente." : "No se pudo modificar la copia.";
    }

    public Copia buscarCopia(String numeroSerie) {
        String sql = "SELECT * FROM copia WHERE numero_serie LIKE '" + numeroSerie + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Copia(datos.getInt("id"), numeroSerie, datos.getString("estado"), datos.getInt("libro_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Copia> mostrarCopias() {
        ArrayList<Copia> copias = new ArrayList<>();
        String sql = "SELECT * FROM copia";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                copias.add(new Copia(datos.getInt("id"), datos.getString("numero_serie"), datos.getString("estado"), datos.getInt("libro_id")));
            }
            return copias;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarCopia(int id) {
        String sql = "DELETE FROM copia WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La copia se eliminó correctamente." : "No se pudo eliminar la copia.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="MOVIMIENTO">
    public String agregarMovimiento(Movimiento m) {
        String sql = "INSERT INTO movimiento(tipo, fecha, documento_id) VALUES('" + m.getTipo() + "','" + m.getFecha() + "'," + m.getDocumentoId() + ")";
        return conexion.insertQuery(sql) ? "El movimiento se agregó correctamente." : "No se pudo agregar el movimiento.";
    }

    public String modificarMovimiento(int id, Movimiento m) {
        String sql = "UPDATE movimiento SET tipo = '" + m.getTipo() + "', fecha = '" + m.getFecha() + "', documento_id = " + m.getDocumentoId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El movimiento se modificó correctamente." : "No se pudo modificar el movimiento.";
    }

    public Movimiento buscarMovimiento(String tipo) {
        String sql = "SELECT * FROM movimiento WHERE tipo LIKE '" + tipo + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Movimiento(datos.getInt("id"), tipo, new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha")), datos.getInt("documento_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Movimiento> mostrarMovimientos() {
        ArrayList<Movimiento> movimientos = new ArrayList<>();
        String sql = "SELECT * FROM movimiento";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                movimientos.add(new Movimiento(datos.getInt("id"), datos.getString("tipo"), new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha")), datos.getInt("documento_id")));
            }
            return movimientos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarMovimiento(int id) {
        String sql = "DELETE FROM movimiento WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El movimiento se eliminó correctamente." : "No se pudo eliminar el movimiento.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="MULTA">
    public String agregarMulta(Multa m) {
        String sql = "INSERT INTO multa(dias_atraso, multa, arriendo_id) VALUES(" + m.getDiasAtraso() + "," + m.getMulta() + "," + m.getArriendoId() + ")";
        return conexion.insertQuery(sql) ? "La multa se agregó correctamente." : "No se pudo agregar la multa.";
    }

    public String modificarMulta(int id, Multa m) {
        String sql = "UPDATE multa SET dias_atraso = " + m.getDiasAtraso() + ", multa = " + m.getMulta() + ", arriendo_id = " + m.getArriendoId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La multa se modificó correctamente." : "No se pudo modificar la multa.";
    }

    public Multa buscarMulta(int id) {
        String sql = "SELECT * FROM multa WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Multa(id, datos.getInt("dias_atraso"), datos.getInt("multa"), datos.getInt("arriendo_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Multa> mostrarMultas() {
        ArrayList<Multa> multas = new ArrayList<>();
        String sql = "SELECT * FROM multa";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                multas.add(new Multa(datos.getInt("id"), datos.getInt("dias_atraso"), datos.getInt("multa"), datos.getInt("arriendo_id")));
            }
            return multas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarMulta(int id) {
        String sql = "DELETE FROM multa WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La multa se eliminó correctamente." : "No se pudo eliminar la multa.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="ARRIENDO">
    public String agregarArriendo(Arriendo a) {
        String sql = "INSERT INTO arriendo(fecha_termino, fecha_devolucion, documento_id) VALUES('" + a.getFechaTermino() + "','" + a.getFechaDevolucion() + "'," + a.getDocumentoId() + ")";
        return conexion.insertQuery(sql) ? "El arriendo se agregó correctamente." : "No se pudo agregar el arriendo.";
    }

    public String modificarArriendo(int id, Arriendo a) {
        String sql = "UPDATE arriendo SET fecha_termino = '" + a.getFechaTermino() + "', fecha_devolucion = '" + a.getFechaDevolucion() + "', documento_id = " + a.getDocumentoId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El arriendo se modificó correctamente." : "No se pudo modificar el arriendo.";
    }

    public Arriendo buscarArriendo(int id) {
        String sql = "SELECT * FROM arriendo WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Arriendo(id, new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha_termino")),
                    new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha_devolucion")), datos.getInt("documento_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Arriendo> mostrarArriendos() {
        ArrayList<Arriendo> arriendos = new ArrayList<>();
        String sql = "SELECT * FROM arriendo";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                arriendos.add(new Arriendo(datos.getInt("id"), new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha_termino")),
                        new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha_devolucion")), datos.getInt("documento_id")));
            }
            return arriendos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarArriendo(int id) {
        String sql = "DELETE FROM arriendo WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El arriendo se eliminó correctamente." : "No se pudo eliminar el arriendo.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="BOLETA-FACTURA">
    public String agregarBoletaFactura(BoletaFactura bf) {
        String sql = "INSERT INTO boleta_factura(tipo, folio, neto, iva, metodo_pago, documento_id) VALUES('" + bf.getTipo() + "','" + bf.getFolio() + "'," + bf.getNeto() + "," + bf.getIva() + ",'" + bf.getMetodoPago() + "'," + bf.getDocumentoId() + ")";
        return conexion.insertQuery(sql) ? "La boleta/factura se agregó correctamente." : "No se puede agregar la boleta/factura.";
    }

    public String modificarBoletaFactura(int id, BoletaFactura bf) {
        String sql = "UPDATE boleta_factura SET tipo = '" + bf.getTipo() + "', folio = '" + bf.getFolio() + "', neto = " + bf.getNeto() + ", iva = " + bf.getIva() + ", metodo_pago = '" + bf.getMetodoPago() + "', documento_id = " + bf.getDocumentoId();
        return conexion.insertQuery(sql) ? "La boleta/factura se modificó correctamente." : "No se pudo modificar la boleta/factura.";
    }

    public BoletaFactura buscarBoletaFactura(String tipo, String folio) {
        String sql = "SELECT * FROM boleta_factura WHERE tipo = " + tipo + " AND folio LIKE '" + folio + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new BoletaFactura(datos.getInt("id"), tipo, folio, datos.getInt("neto"), datos.getInt("iva"),
                    datos.getString("metodo_pago"), datos.getInt("documento_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<BoletaFactura> mostrarBoletasFacturas() {
        ArrayList<BoletaFactura> boletasFacturas = new ArrayList<>();
        String sql = "SELECT * FROM boleta_factura";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                boletasFacturas.add(new BoletaFactura(datos.getInt("id"), datos.getString("tipo"), datos.getString("folio"),
                        datos.getInt("neto"), datos.getInt("iva"), datos.getString("metodo_pago"), datos.getInt("documento_id")));
            }
            return boletasFacturas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarBoletaFactura(int id) {
        String sql = "DELETE FROM boleta_factura WHERE id = " + id;
        return conexion.insertQuery(sql) ? "Se eliminó correctamente la boleta/factura." : "No se pudo eliminar la boleta/factura.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="DOCUMENTO">
    public String agregarDocumento(Documento d) {
        String sql = "INSERT INTO documento(tipo, fecha) VALUES('" + d.getTipo() + "', '" + d.getFecha() + "')";
        return conexion.insertQuery(sql) ? "El documento se agregó correctamente." : "No se pudo agregar el documento.";
    }

    public String modificarDocumento(int id, Documento d) {
        String sql = "UPDATE documento SET tipo = '" + d.getTipo() + "', fecha = '" + d.getFecha() + "' WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El documento se modificó correctamente." : "No se pudo modificar el documento.";
    }

    public Documento buscarDocumento(int id) {
        String sql = "SELECT * FROM documento WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Documento(id, datos.getString("tipo"), new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(datos.getTimestamp("fecha")));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Documento> mostrarDocumentos() {
        ArrayList<Documento> documentos = new ArrayList<>();
        String sql = "SELECT * FROM documento";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                documentos.add(new Documento(datos.getInt("id"), datos.getString("tipo"), new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(datos.getTimestamp("fecha"))));
            }
            return documentos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarDocumento(int id) {
        String sql = "DELETE FROM documento WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El documento se eliminó correctamente." : "No se pudo eliminar el documento.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="DISTRIBUIDOR">
    public String agregarDistribuidor(Distribuidor d) {
        String sql = "INSERT INTO distribuidor(año_inicio, razon_social_id) VALUES(" + d.getAñoInicio() + "," + d.getRazonSocialId() + ")";
        return conexion.insertQuery(sql) ? "El distribuidor se agregó correctamente." : "No se pudo agregar el distribuidor.";
    }

    public String modificarDistribuidor(int id, Distribuidor d) {
        String sql = "UPDATE distribuidor SET año_inicio = " + d.getAñoInicio() + ", razon_social_id = " + d.getRazonSocialId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El distribuidor se modificó correctamente." : "No se pudo modificar el distribuidor.";
    }

    public Distribuidor buscarDistribuidor(int razonSocialId) {
        String sql = "SELECT * FROM distribuidor WHERE razon_social_id = " + razonSocialId;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Distribuidor(datos.getInt("id"), datos.getInt("año_inicio"), razonSocialId);
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Distribuidor> mostrarDistribuidores() {
        ArrayList<Distribuidor> distribuidores = new ArrayList<>();
        String sql = "SELECT * FROM distribuidor";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                distribuidores.add(new Distribuidor(datos.getInt("id"), datos.getInt("año_inicio"), datos.getInt("razon_social_id")));
            }
            return distribuidores;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarDistribuidor(int id) {
        String sql = "DELETE FROM distribuidor WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El distribuidor se eliminó correctamente." : "No se pudo eliminar el distribuidor.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="TRABAJADOR">
    public String agregarTrabajador(Trabajador t) {
        String sql = "INSERT INTO trabajador(fecha_contrato, persona_id) VALUES('" + t.getFechaContrato() + "'," + t.getPersonaId() + ")";
        return conexion.insertQuery(sql) ? "El trabajador se agregó correctamente." : "No se pudo agregar el trabajador.";
    }

    public String modificarTrabajador(int id, Trabajador t) {
        String sql = "UPDATE trabajador SET fecha_contrato = '" + t.getFechaContrato() + "', persona_id = " + t.getPersonaId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El trabajador se modificó correctamente." : "No se pudo modificar el trabajador.";
    }

    public Trabajador buscarTrabajador(int id) {
        String sql = "SELECT * FROM trabajador WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Trabajador(id, new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha_contrato")), datos.getInt("persona_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Trabajador> mostrarTrabajadores() {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        String sql = "SELECT * FROM trabajador";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                trabajadores.add(new Trabajador(datos.getInt("id"), new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("fecha_contrato")), datos.getInt("persona_id")));
            }
            return trabajadores;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarTrabajador(int id) {
        String sql = "DELETE FROM trabajador WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El trabajador se eliminó correctamente." : "No se pudo eliminar el trabajador.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="PERSONA">
    public String agregarPersona(Persona p) {
        String sql = "INSERT INTO persona(apellido_paterno, apellido_materno, razon_social_id) VALUES('" + p.getApellidoPaterno() + "','" + p.getApellidoMaterno() + "'," + p.getRazonSocialId() + ")";
        return conexion.insertQuery(sql) ? "La persona se agregó correctamente." : "No se pudo agregar la persona.";
    }

    public String modificarPersona(int id, Persona p) {
        String sql = "UPDATE persona SET apellido_paterno = '" + p.getApellidoPaterno() + "', apellido_materno = '" + p.getApellidoMaterno() + "', razon_social_id = " + p.getRazonSocialId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La persona se modificó correctamente." : "No se pudo modificar la persona.";
    }

    public Persona buscarPersona(int id) {
        String sql = "SELECT * FROM persona WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Persona(id, datos.getString("apellido_paterno"), datos.getString("apellido_materno"), datos.getInt("razon_social_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Persona> mostrarPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();
        String sql = "SELECT * FROM persona";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                personas.add(new Persona(datos.getInt("id"), datos.getString("apellido_paterno"), datos.getString("apellido_materno"), datos.getInt("razon_social_id")));
            }
            return personas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarPersona(int id) {
        String sql = "DELETE FROM persona WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La persona se eliminó correctamente." : "No se pudo eliminar la persona.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="RAZON_SOCIAL">
    public String agregarRazonSocial(RazonSocial rs) {
        String sql = "INSERT INTO razon_social(rut, nombre) VALUES('" + rs.getRut() + "','" + rs.getNombre() + "')";
        return conexion.insertQuery(sql) ? "La razón social se agregó correctamente." : "No se pudo agregar la razón social.";
    }

    public String modificarRazonSocial(int id, RazonSocial rs) {
        String sql = "UPDATE razon_social SET rut = '" + rs.getRut() + "', nombre = '" + rs.getNombre() + "' WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La razón social se modificó correctamente." : "No se pudo modificar la razón social.";
    }

    public RazonSocial buscarRazonSocial(String nombre) {
        String sql = "SELECT * FROM razon_social WHERE nombre LIKE '" + nombre + "%'";
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new RazonSocial(datos.getInt("id"), datos.getString("rut"), nombre, null);
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<RazonSocial> mostrarRazonesSociales() {
        ArrayList<RazonSocial> razonesSociales = new ArrayList<>();
        String sql = "SELECT * FROM razon_social";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                razonesSociales.add(new RazonSocial(datos.getInt("id"), datos.getString("rut"), datos.getString("nombre"), null));
            }
            return razonesSociales;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarRazonSocial(int id) {
        String sql = "DELETE FROM razon_social WHERE id = " + id;
        return conexion.insertQuery(sql) ? "La razón social se eliminó correctamente." : "No se pudo eliminar la razón social.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="CONTACTO">
    public String agregarContacto(Contacto c) {
        String sql = "INSERT INTO contacto(tipo, valor, subtipo, razon_social_id) VALUES('" + c.getTipo() + "','" + c.getValor() + "','" + c.getSubtipo() + "'," + c.getRazonSocialId() + ")";
        return conexion.insertQuery(sql) ? "El contacto se agregó correctamente." : "No se pudo agregar el contacto.";
    }

    public String modificarContacto(int id, Contacto c) {
        String sql = "UPDATE contacto SET tipo = '" + c.getTipo() + "', valor = '" + c.getSubtipo() + "', subtipo = '" + c.getSubtipo() + "', razon_social_id = " + c.getRazonSocialId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El contacto se modificó correctamente." : "No se pudo modificar el contacto.";
    }

    public Contacto buscarContacto(int id) {
        String sql = "SELECT * FROM contacto WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Contacto(id, datos.getString("tipo"), datos.getString("valor"), datos.getString("subtipo"), datos.getInt("razon_social_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Contacto> mostrarContactos() {
        ArrayList<Contacto> contactos = new ArrayList<>();
        String sql = "SELECT * FROM contacto";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                contactos.add(new Contacto(datos.getInt("id"), datos.getString("tipo"), datos.getString("valor"), datos.getString("subtipo"), datos.getInt("razon_social_id")));
            }
            return contactos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarContacto(int id) {
        String sql = "DELETE FROM contacto WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El contacto se eliminó correctamente." : "No se pudo eliminar el contacto.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="CLIENTE">
    public String agregarCliente(Cliente c) {
        String sql = "INSERT INTO cliente(fecha_nacimiento, persona_id) VALUES('" + c.getFechaNacimiento() + "'," + c.getPersonaId() + ")";
        return conexion.insertQuery(sql) ? "El cliente se agregó correctamente." : "No se pudo agregar el cliente.";
    }

    public String modificarCliente(int id, Cliente c) {
        String sql = "UPDATE cliente SET fecha_nacimiento = '" + c.getFechaNacimiento() + "', persona_id = " + c.getPersonaId() + " WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El cliente se modificó correctamente." : "No se pudo modificar el cliente.";
    }

    public Cliente buscarCliente(int id) {
        String sql = "SELECT * FROM cliente WHERE id = " + id;
        ResultSet datos = conexion.query(sql);

        try {
            datos.next();
            return new Cliente(datos.getInt("id"), new SimpleDateFormat("dd-MM-yyy").format(datos.getDate("fecha_nacimiento")), datos.getInt("persona_id"));
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Cliente> mostrarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                clientes.add(new Cliente(datos.getInt("id"), new SimpleDateFormat("dd-MM-yyy").format(datos.getDate("fecha_nacimiento")), datos.getInt("persona_id")));
            }
            return clientes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public String borrarCliente(int id) {
        String sql = "DELETE FROM cliente WHERE id = " + id;
        return conexion.insertQuery(sql) ? "El cliente se eliminó correctamente." : "No se pudo eliminar el cliente.";
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="RAZON_SOCIAL_DOCUMENTO">
    public boolean agregarRazonSocialDocumento(int razonSocialId, int documentoId, String rol) {
        String sql = "INSERT INTO razon_social_documento VALUES(" + razonSocialId + "," + documentoId + ",'" + rol + "')";
        return conexion.insertQuery(sql);
    }

    public boolean modificarRazonSocialDocumento(int razonSocialId, int documentoId, String rol) {
        String sql = "UPDATE razon_social_documento SET rol = '" + rol + "' WHERE razon_social_id = " + razonSocialId + " AND documento_id = " + documentoId;
        return conexion.insertQuery(sql);
    }

    public ArrayList<RazonSocial> mostrarRazonesSociales(int documentoId) {
        ArrayList<RazonSocial> razonesSociales = new ArrayList<>();
        String sql = "SELECT rs.*, rsd.* FROM razon_social rs, razon_social_documento rsd WHERE rsd.documento_id = " + documentoId;
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                razonesSociales.add(new RazonSocial(datos.getInt("rs.id"), datos.getString("rs.rut"), datos.getString("rs.nombre"), datos.getString("rsd.rol")));
            }
            return razonesSociales;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Documento> mostrarDocumentos(int razonSocialId) {
        ArrayList<Documento> documentos = new ArrayList<>();
        String sql = "SELECT d.*, rsd.* FROM documento d, razon_social_documento rsd WHERE rsd.razon_social_id = " + razonSocialId;
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                documentos.add(new Documento(datos.getInt("d.id"), datos.getString("d.tipo"), new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("d.fecha"))));
            }
            return documentos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean borrarRazonSocialDocumento(int razonSocialId, int documentoId) {
        String sql = "DELETE FROM razon_social_documento WHERE razon_social_id = " + razonSocialId + " AND documento_id = " + documentoId;
        return conexion.insertQuery(sql);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="MOVIMIENTO_COPIA">
    public boolean agregarMovimientoCopia(int movimientoId, int copiaId) {
        String sql = "INSERT INTO movimiento_copia VALUES(" + movimientoId + "," + copiaId + ")";
        return conexion.insertQuery(sql);
    }
    
    public ArrayList<Movimiento> mostrarMovimientos(int copiaId) {
        ArrayList<Movimiento> movimientos = new ArrayList<>();
        String sql = "SELECT m.*, mc.* FROM movimiento m, movimiento_copia mc WHERE mc.copia_id = " + copiaId;
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                movimientos.add(new Movimiento(datos.getInt("m.id"), datos.getString("m.tipo"), new SimpleDateFormat("dd-MM-yyyy").format(datos.getDate("m.fecha")), datos.getInt("m.documento_id")));
            }
            return movimientos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Copia> mostrarCopias(int movimientoId) {
        ArrayList<Copia> copias = new ArrayList<>();
        String sql = "SELECT c.*, mc.* FROM copia c, movimiento_copia mc WHERE mc.movimiento_id = " + movimientoId;
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                copias.add(new Copia(datos.getInt("c.id"), datos.getString("c.numero_serie"), datos.getString("c.estado"), datos.getInt("c.libro_id")));
            }
            return copias;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean borrarMovimientoCopia(int movimientoId, int copiaId) {
        String sql = "DELETE FROM movimiento_copia WHERE movimiento_id = " + movimientoId + " AND copia_id = " + copiaId;
        return conexion.insertQuery(sql);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="CATEGORIA_LIBRO">
    public boolean agregarCategoriaLibro(int categoriaId, int libroId) {
        String sql = "INSERT INTO categoria_libro VALUES(" + categoriaId + "," + libroId + ")";
        return conexion.insertQuery(sql);
    }

    public ArrayList<Categoria> mostrarCategorias(int libroId) {
        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT c.*, cl.* FROM categoria c, categoria_libro cl WHERE cl.libro_id = " + libroId;
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                categorias.add(new Categoria(datos.getInt("c.id"), datos.getString("c.nombre")));
            }
            return categorias;
        } catch (SQLException ex) {
            return null;
        }
    }

    public ArrayList<Libro> mostrarLibrosPorCategoria(int categoriaId) {
        ArrayList<Libro> libros = new ArrayList<>();
        String sql = "SELECT l.*, cl.* FROM libro l, categoria_libro cl WHERE cl.categoria_id = " + categoriaId;
        ResultSet datos = conexion.query(sql);

        try {
            while (datos.next()) {
                libros.add(new Libro(datos.getInt("l.id"), datos.getString("l.isbn"), datos.getString("l.titulo"), datos.getString("l.idioma"),
                        datos.getInt("l.numero_paginas"), datos.getInt("l.precio_referencia"), datos.getInt("l.año_publicacion"), datos.getInt("l.editorial_id")));
            }
            return libros;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean borrarCategoriaLibro(int categoriaId, int libroId) {
        String sql = "DELETE FROM categoria_libro WHERE categoria_id = " + categoriaId + " AND libro_id = " + libroId;
        return conexion.insertQuery(sql);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="AUTOR_LIBRO">
    public boolean agregarAutorLibro(int autorId, int libroId) {
        String sql = "INSERT INTO autor_libro VALUES(" + autorId + "," + libroId + ")";
        return conexion.insertQuery(sql);
    }
    
    public ArrayList<Autor> mostrarAutores(int libroId) {
        ArrayList<Autor> autores = new ArrayList<>();
        String sql = "SELECT a.*, al.* FROM autor a, autor_libro al WHERE al.libro_id = " + libroId;
        ResultSet datos = conexion.query(sql);
        
        try {
            while (datos.next()) {                
                autores.add(new Autor(datos.getInt("a.id"), datos.getString("a.nombre"), datos.getString("a.apellido_paterno"), datos.getString("a.apellido_materno")));
            }
            return autores;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ArrayList<Libro> mostrarLibrosPorAutor(int autorId) {
        ArrayList<Libro> libros = new ArrayList<>();
        String sql = "SELECT l.*, al.* FROM libro l, autor_libro al WHERE al.autor_id = " + autorId;
        ResultSet datos = conexion.query(sql);
        
        try {
            while (datos.next()) {
                libros.add(new Libro(datos.getInt("l.id"), datos.getString("l.isbn"), datos.getString("l.titulo"), datos.getString("l.idioma"),
                        datos.getInt("l.numero_paginas"), datos.getInt("l.precio_referencia"), datos.getInt("l.año_publicacion"), datos.getInt("l.editorial_id")));
            }
            return libros;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean borrarAutorLibro(int autorId, int libroId) {
        String sql = "DELETE FROM autor_libro WHERE autor_id = " + autorId + " AND libro_id = " + libroId;
        return conexion.insertQuery(sql);
    }
    // </editor-fold>
}
