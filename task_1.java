@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Ожидается что метод вренет true",true,isAdult);
    // Напиши код здесь
}
