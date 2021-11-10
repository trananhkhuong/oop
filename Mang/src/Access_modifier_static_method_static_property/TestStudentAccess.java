package Access_modifier_static_method_static_property;

class TestStudentAccess{
    public static void main(String[] args) {
        StudentAccess st = new StudentAccess();
        st.setName("Trần Khương");
        st.setClasses("C0921k1");
        System.out.println(st.name);
        System.out.println(st.classes);
    }
}
