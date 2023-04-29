public class Vetement extends Product {
    protected String desc;
    public Vetement(String nom, double prix, String taille){
        super(nom,prix);
        this.desc = taille;
    }
    /**
     *Permet de changer le prix du produit
     * @param Nvprix Un nombre de type double qui sera le nouveau prix du produit
     */
    @Override
    public void setPrix(double Nvprix) {
        this.prix = Nvprix;
    }

    /**
     *Renvoie le prix du produit
     * @return Le prix du produit de type double
     */
    @Override
    public double getPrix() {
        return prix;
    }

    /**
     *Permet d'afficher les caractéristiques du produit
     */
    @Override
    public void showProduct() {
        System.out.println("Le vetement "+nom+" coûte "+prix+" euro\n"+"Taille : "+desc+"\n");
    }
}
