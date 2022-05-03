mod continental_motores {//Base de datos

    pub mod unidades {//Tabla unidades

        pub struct Unidad {
            id: i64,
            chasis: String,
            placa: String,
            color: String,
            cliente_id: i64
        }

        // Definición del método de creación de la tabla
        pub fn crear_tabla(tabla_: &mut Vec<Unidad>, tamanio: usize) -> Vec<Unidad> {
            tabla_ = Vec::with_capacity(tamanio);
            println!("La tabla unidades ha sido creada");
            return tabla_;
        }



        //Definición de la inserción de datos en la tabla
        pub fn insertar_tabla(tabla_: &mut Vec<Unidad>, id: i64, chasis: String, placa: String, color: String, cliente_id: i64) -> Vec<Unidad> {
            if tabla_.len() < tabla_.capacity() {
                //Insertar un valor nuevo
                let valor: struct = Unidad {
                    id: id,
                    chasis: chasis,
                    placa: placa,
                    color: color,
                    cliente_id: cliente_id
                };
                tabla_.push(valor);
                println!("Valor nuevo agregado a tabla unidades");
            }
            else {
                println!("La tabla ha llegado a su maxima capacidad");
            }
            return tabla_;
        }

        // Definición de la obtención de un dato según su índice
        pub fn select_unidad_por_id(tabla_: &mut Vec<Unidad>, id: usize) {
            println!("{} | {} | {} | {} | {}", tabla_[id].id, tabla_[id].chasis, tabla_[id].placa, tabla_[id].color, tabla_[id].cliente_id);
        }

        // Definición de la obtención de un dato según su placa
        pub fn select_unidad_por_placa(tabla_: &mut Vec<Unidad>, placa: String) {
            for valor in tabla_ {
                if valor.placa == placa {
                    println!("{} | {} | {} | {} | {}", valor.id, valor.chasis, valor.placa, valor.color, valor.cliente_id);
                }
            }
        }

        // Definición de la eliminación de un dato según su índice
        pub fn eliminar_elemento(tabla: &mut Vec<Unidad>, id: usize) -> Vec<Unidad> {
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
        pub fn editar_elemento(tabla_: &mut Vec<Unidad>, id: usize, chasis: String, placa: String, color: String, cliente_id: i64) -> Vec<Unidad> {
            if id >= 0 {
                tabla_[id].chasis = chasis;
                tabla_[id].placa = placa;
                tabla_[id].color = color;
                tabla_[id].cliente_id = cliente_id;
                println!("Valor editado: {}", id);
            }
            else {
                println!("El id debe ser mayor o igual a 0");
            }
            return tabla_
        }
    }

    pub mod clientes {//Tabla unidades

        pub struct Cliente {
            id: i64,
            nombre: String,
            telefono: String
        }

        // Definición del método de creación de la tabla
        pub fn crear_tabla(tabla_: &mut Vec<Cliente>, tamanio: usize) -> Vec<Cliente> {
            tabla_ = Vec::with_capacity(tamanio);
            println!("La tabla clientes ha sido creada");
            return tabla_;
        }

        //Definición de la inserción de datos en la tabla
        pub fn insertar_tabla(tabla_: &mut Vec<Cliente>, id: i64, nombre: String, telefono: String) -> Vec<Cliente> {
            if tabla_.len() < tabla_.capacity() {
                //Insertar un valor nuevo
                let valor: struct = Cliente {
                    id: id,
                    nombre: nombre,
                    telefono: telefono
                };
                tabla_.push(valor);
                println!("Valor nuevo agregado a tabla clientes");
            }
            else {
                println!("La tabla ha llegado a su maxima capacidad");
            }
            return tabla_;
        }
    }
}

// Definición de la obtención de un dato según su placa
fn select_unidades_por_cliente(tabla_: &mut Vec<struct>, tabla2_: &mut Vec<struct>) {
    for valor_cliente in tabla_ {
        println!("{} | {} | {}", valor_cliente.id, valor_cliente.nombre, valor_cliente.telefono);
        for valor_unidad in tabla2_ {
            if valor_cliente.id == valor_unidad.cliente_id {
                println!("    {} | {} | {} | {}", valor_unidad.id, valor_unidad.chasis, valor_unidad.placa, valor_unidad.color);
            }
        }
    }
}

fn main() {
    let mut vector_clientes: Vec<struct> = Vec::new();
    let mut vector_unidades: Vec<struct> = Vec::new();

    //Iniciar la tabla
    vector_clientes = continental_motores::clientes::crear_tabla(vector_clientes,5);
    vector_unidades = continental_motores::unidades::crear_tabla(vector_unidades,100);

    //Insertar valores
    vector_clientes = continental_motores::clientes::insertar_tabla(vector_clientes,1,"Alex".to_string(),"12234421".to_string());
    vector_clientes = continental_motores::clientes::insertar_tabla(vector_clientes,2,"Jhonny".to_string(),"65445538".to_string());
    vector_clientes = continental_motores::clientes::insertar_tabla(vector_clientes,3,"Pablo".to_string(),"48729776".to_string());

    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,1,"3FK874JKJFSN7".to_string(),"P-018DZK".to_string(),"Azul".to_string(),3);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,2,"GGREGEH345BDH".to_string(),"P-219HJL".to_string(),"Rojo metalico".to_string(),2);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,3,"TRETEERHRTH76".to_string(),"P-421DHK".to_string(),"Verde".to_string(),1);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,4,"FGGEE3553NNM8".to_string(),"P-020XCK".to_string(),"Blanco".to_string(),3);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,5,"NVCMDU839NDJC".to_string(),"P-021DHY".to_string(),"Azul".to_string(),2);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,6,"123345BDGEGGH".to_string(),"P-022NHT".to_string(),"Negro".to_string(),1);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,7,"987654EGEGWRT".to_string(),"P-023GJW".to_string(),"Amarillo".to_string(),2);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,8,"NAMNDY642FBNH".to_string(),"P-024ZZZ".to_string(),"Cafe".to_string(),2);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,9,"SFGTGRHT67654".to_string(),"P-025FGD".to_string(),"Celeste".to_string(),1);
    vector_unidades = continental_motores::unidades::insertar_tabla(vector_unidades,10,"RFEHR834VSFFF".to_string(),"P-026VZY".to_string(),"Plateado".to_string(),3);

    select_unidades_por_cliente(&mut vector_clientes, &mut vector_unidades);

    
}
