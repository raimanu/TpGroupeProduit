public class VetementFactory extends ProductFactory {
    /**
     *Permet de créer un objet de type Electronique
     * @param name Le nom du produit
     * @param price Le prix du produit
     * @param taille La taille du produit
     * @return Retourne un objet de type Electronique
     */
    @Override
    public Vetement createProduct(String name, double price, String taille) {
        return new Vetement(name, price, taille);
    }
}