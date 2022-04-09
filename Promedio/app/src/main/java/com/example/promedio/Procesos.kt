package com.example.promedio

class Procesos {
    companion object{
        val listaEstudiantes = ArrayList<Estudiante>()
        var pierden: Int = 0
        var ganan: Int = 0
        var recuperan: Int = 0

        fun promedio(n1: Double, n2: Double, n3: Double, n4: Double, n5: Double): Double = (n1 + n2 + n3 + n4 + n5) / 5

        fun rendimiento(promedio: Double): String {
            var resultado = ""
            if (promedio < 2.5) {
                resultado = "Perdió y no puede recuperar"
                pierden += 1
            }
            else if (promedio in 2.5..3.5) {
                resultado = "Perdió pero puede recuperar"
                recuperan += 1
            }
            else {
                resultado = "Ganó"
                ganan += 1
            }
            return resultado
        }

        fun anadirEstudiante(est: Estudiante) {
            listaEstudiantes.add(est)
        }

        fun estadisticas(): Array<Int> {
            return arrayOf<Int>(
                listaEstudiantes.size, ganan, pierden, recuperan
            )
        }

    }
}