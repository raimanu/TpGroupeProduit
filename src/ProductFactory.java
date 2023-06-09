public abstract class ProductFactory {

    /**
     *Permet de créer un objet de type Product
     * @param name Le nom du produit
     * @param prix Le prix du produit
     * @param divers Un paramètre optionnels
     * @return Retourne un objet de type Product
     */
    public abstract Product createProduct(String name, double prix, String divers);
}