

fn hanoi(n: i64, desde: i64, hacia: i64, via: i64) {
    if n > 0 {
        hanoi(n - 1, desde, via, hacia);
        println!("Mover disco de palo {} a palo {}", desde, hacia);
        hanoi(n - 1, via, hacia, desde);
    }
}


fn main(){
    println!("--------------------------");
    println!("----ARCHIVO RECURSIVOS----");
    println!("--------------------------");

    println!("");
    println!("Hanoi");
	hanoi(3, 1 ,2 ,3);
}


/*
--------------------------
----ARCHIVO RECURSIVOS----
--------------------------
Fibonacci de 6 13

Hanoi
Mover disco de palo 1 a palo 2
Mover disco de palo 1 a palo 3
Mover disco de palo 2 a palo 3
Mover disco de palo 1 a palo 2
Mover disco de palo 3 a palo 1
Mover disco de palo 3 a palo 2
Mover disco de palo 1 a palo 2
*/