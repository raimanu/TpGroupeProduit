import java.util.ArrayList;
import java.util.List;

public class ProductGroup extends Product {
    public static final String color_reset = "\u001B[0m";
    public static final String color_yellow = "\u001B[33m";
    protected List<Product> lot = new ArrayList<Product>();

    /**
     * Le constructeur de la classe ProductGroup
     * @param nom  Le nom du produit
     */
    public ProductGroup(String nom) {
        super(nom,0);
    }

    /**
     * Ajoute le produit au lot
     * @param produit Le produit a ajouté au lot
     */
    public void ajoutProduit(Product produit){
        this.lot.add(produit);
    }

    /**
     * Supprime le produit du lot
     * @param produit Le produit a supprimer du lot
     */
    public void supprProduit(Product produit){
        this.lot.remove(produit);
    }

    /**
     * Renvoie le produit à l'index indiqué
     * @param index L'index du produit
     * @return Le produit à l'index indiqué
     */
    public Product getProduct(int index) {
        return lot.get(index);
    }

    /**
     *Applique une promo sur tout les produits
     * @param pourcent Le pourcentage à utiliser
     */
    public void setPromo(double pourcent){
        for (Product product : lot) {
            product.setPrix(product.getPrix()*pourcent);
        }
    }

    /**
     * Permet de changer le prix de tout les produits
     * @param Nvprix Un nombre de type double qui sera le nouveau prix du produit
     */
    @Override
    public void setPrix(double Nvprix) {
        for (Product product : lot) {
                product.setPrix(Nvprix);
        }
    }

    /**
     * Renvoie le prix total du lot
     * @return Le prix total du lot de type double
     */
    @Override
    public double getPrix() {
        double prixTotal = 0.0;
        for (Product product : lot) {
            prixTotal += product.getPrix();
        }
        return prixTotal;
    }

    /**
     * Permet d'afficher les caractéristiques du produit
     */
    @Override
    public void showProduct() {
        System.out.println(color_yellow + "Voici ce que contient le lot "+ nom +" : \n");
        System.out.println("---------------------------------------------------------------\n" + color_reset);
        for (Product product : lot) {
            product.showProduct();
            System.out.println(color_yellow + "---------------------------------------------------------------" + color_reset);
        }
        System.out.printf("Le prix total du lot est de "+this.getPrix()+" euro\n\n");
    }
}
