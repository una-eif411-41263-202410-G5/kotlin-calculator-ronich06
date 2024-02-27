package design.patterns.calculadora

import design.patterns.design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

internal class CalculadoraTest {
    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @AfterEach
    fun tearDown() {
        System.setOut(standardOut)
    }

    @Test
    fun `probando cada operacion de la calculadora`() {
        val calculadora = Calculadora()
        assertEquals(10, calculadora.sumar(5,5))
        assertEquals(10, calculadora.restar(15,5))
        assertEquals(10, calculadora.dividir(100,10))
        assertEquals(10, calculadora.multiplicar(5,2))
    }

}