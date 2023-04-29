public class ElectroniqueFactory extends ProductFactory {
    /**
     *Permet de créer un objet de type Electronique
     * @param name Le nom du produit
     * @param price Le prix du produit
     * @param desc La description du produit
     * @return Retourne un objet de type Electronique
     */
    @Override
    public Electronique createProduct(String name, double price, String desc) {
        return new Electronique(name, price, desc);
    }
}