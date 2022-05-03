mod tienda {//Base de datos

    pub mod ventas {//Tabla ventas

        pub struct Venta {
            total: i64,
            cliente: String
        }
       
        // Definición del método de creación de la tabla
        pub fn crear_tabla(tabla_: &mut Vec<Venta>, tamanio: usize) -> Vec<Venta> {
            tabla_ = Vec::with_capacity(tamanio);
            println!("La tabla ventas ha sido creada");
            return tabla_;
        }



        //Definición de la inserción de datos en la tabla
        pub fn insertar_tabla(tabla_: &mut Vec<Venta>, total: i64, cliente: String) -> Vec<Venta> {
            if tabla_.len() < tabla_.capacity() {
                //Insertar un valor nuevo
                let valor: struct = Venta {
                    total: total,
                    cliente: cliente.to_string()
                };
                tabla_.push(valor);
                println!("Valor nuevo agregado a tabla ventas");
            }
            else {
                println!("La tabla ha llegado a su maxima capacidad");
            }
            return tabla_;
        }

        // Definición de la obtención de un dato según su índice
        pub fn select_venta_por_id(tabla_: &mut Vec<Venta>, id: usize) {
            println!("total: {} cliente: {}", tabla_[id].total, tabla_[id].cliente);
        }

        // Definición de la eliminación de un dato según su índice
        pub fn eliminar_elemento(tabla_: &mut Vec<Venta>, id: usize) -> Vec<Venta> {
            if id >= 0 {
                tabla_.remove(id);
                println!("Valor eliminado: {}", id);
            }
            else {
                println!("El id debe ser mayor o igual a 0");
            }
            return tabla_
        }

        // Definición de la edición de un dato según su índice
        pub fn editar_elemento(tabla_: &mut Vec<Venta>, id: usize, total: i64, cliente: String) -> Vec<Venta> {
            if id >= 0 {
                tabla_[id].total = total;
                tabla_[id].cliente = cliente;
                println!("Valor editado: {}", id);
            }
            else {
                println!("El id debe ser mayor o igual a 0");
            }
            return tabla_
        }
    }
}

fn main() {
    let mut vector: Vec<struct> = Vec::new();

    //Iniciar la tabla
    vector = tienda::ventas::crear_tabla(vector,20);

    //Insertar valores
    vector = tienda::ventas::insertar_tabla(vector,15,"Hector".to_string());
    vector = tienda::ventas::insertar_tabla(vector,54,"Andres".to_string());
    vector = tienda::ventas::insertar_tabla(vector,85,"Luisa".to_string());
    vector = tienda::ventas::insertar_tabla(vector,223,"Pablo".to_string());
    vector = tienda::ventas::insertar_tabla(vector,0864,"Roberto".to_string());
    vector = tienda::ventas::insertar_tabla(vector,12,"Lucia".to_string());
    vector = tienda::ventas::insertar_tabla(vector,1,"Analu".to_string());
    vector = tienda::ventas::insertar_tabla(vector,986,"Maria".to_string());
    vector = tienda::ventas::insertar_tabla(vector,82,"Elizabeth".to_string());
    vector = tienda::ventas::insertar_tabla(vector,67,"Juan".to_string());
    vector = tienda::ventas::insertar_tabla(vector,34,"Sergio".to_string());
    vector = tienda::ventas::insertar_tabla(vector,3,"Lidia".to_string());
    vector = tienda::ventas::insertar_tabla(vector,8200,"Rony".to_string());

    tienda::ventas::select_venta_por_id(&mut vector,0);
    tienda::ventas::select_venta_por_id(&mut vector,12);
    tienda::ventas::select_venta_por_id(&mut vector,4);
    tienda::ventas::select_venta_por_id(&mut vector,10);
    tienda::ventas::select_venta_por_id(&mut vector,8);

    vector = tienda::ventas::eliminar_elemento(vector,1);
    vector = tienda::ventas::eliminar_elemento(vector,11);

    tienda::ventas::select_venta_por_id(&mut vector,0);
    tienda::ventas::select_venta_por_id(&mut vector,10);
    tienda::ventas::select_venta_por_id(&mut vector,3);
    tienda::ventas::select_venta_por_id(&mut vector,9);
    tienda::ventas::select_venta_por_id(&mut vector,7);

    vector = tienda::ventas::editar_elemento(vector,3,7*3,"Haroldo".to_string());
    vector = tienda::ventas::editar_elemento(vector,2,1234,"Sara".to_string());

    tienda::ventas::select_venta_por_id(&mut vector,3);
    tienda::ventas::select_venta_por_id(&mut vector,2);
    tienda::ventas::select_venta_por_id(&mut vector,5);
    tienda::ventas::select_venta_por_id(&mut vector,6);
}
