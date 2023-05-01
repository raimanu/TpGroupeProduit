public class ElectroniqueFactory extends ProductFactory {
    /**
     *Permet de créer un objet de type Electronique
     * @param name Le nom du produit
     * @param prix Le prix du produit
     * @param desc La description du produit
     * @return Retourne un objet de type Electronique
     */
    @Override
    public Electronique createProduct(String name, double prix, String desc) {
        return new Electronique(name, prix, desc);
    }
}