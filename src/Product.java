public abstract class Product {
    protected String nom;
    protected double prix;

    /**
     * Le constructeur de la classe Product
     * @param nom Le nom du produit
     * @param prix Le prix du produit
     */
    public Product(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }

    /**
     *Permet de changer le prix du produit
     * @param Nvprix Un nombre de type double qui sera le nouveau prix du produit
     */
    public abstract void setPrix(double Nvprix);

    /**
     *Renvoie le prix du produit
     * @return Le prix du produit de type double
     */
    public abstract double getPrix();

    /**
     *Permet d'afficher les caractéristiques du produit
     */
    public abstract void showProduct();
}