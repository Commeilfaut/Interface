public  class Cook extends Worker implements CookFood{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void CookFood() {
        System.out.println("Готовлю еду");
    }
}
