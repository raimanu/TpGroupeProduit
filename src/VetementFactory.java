public class VetementFactory extends ProductFactory {
    /**
     *Permet de créer un objet de type Electronique
     * @param name Le nom du produit
     * @param prix Le prix du produit
     * @param taille La taille du produit
     * @return Retourne un objet de type Electronique
     */
    @Override
    public Vetement createProduct(String name, double prix, String taille) {
        return new Vetement(name, prix, taille);
    }
}