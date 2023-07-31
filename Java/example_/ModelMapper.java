package com.example;

public class ModelMapper {

    public static <T, U> U map(T source, Class<U> targetClass) throws InstantiationException, IllegalAccessException {
        @SuppressWarnings("deprecation")
		U target = targetClass.newInstance();
        // Realiza el mapeo manual de atributos si es necesario
        // Por ejemplo, target.setAtributo(source.getAtributo());
        return target;
    }

    @SuppressWarnings("deprecation")
	public static <T, U> U map(T source, Class<U> targetClass, String... properties) {
        U target;
        try {
            target = targetClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Error al instanciar el objeto de destino.", e);
        }
        // Realiza el mapeo manual de propiedades utilizando los nombres de las propiedades
        // Por ejemplo, target.setAtributo(source.getAtributo());
        return target;
    }

    public static <T, U> U map(T source1, T source2, Class<U> targetClass) throws InstantiationException, IllegalAccessException {
        @SuppressWarnings("deprecation")
		U target = targetClass.newInstance();
        // Realiza el mapeo manual de atributos si es necesario
        // Por ejemplo, target.setAtributo1(source1.getAtributo1());
        // target.setAtributo2(source2.getAtributo2());
        return target;
    }
}
