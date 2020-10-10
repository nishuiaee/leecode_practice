package DesignPattern.Sigleton;

public enum Singleton6 {
    INSTANCE;

    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        Singleton6 firstSingleton = Singleton6.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());

        try {
            Singleton6[] enumConstants = Singleton6.class.getEnumConstants();
            for (Singleton6 enumConstant :enumConstants) {
                System.out.println(enumConstant.getObjName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
