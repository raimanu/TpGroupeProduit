public class Electronique extends Product {
    protected String desc;
    public Electronique(String nom, double prix, String desc){
        super(nom,prix);
        this.desc = desc;
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
        System.out.println("Le produit électronique "+nom+" coûte "+prix+" euro\n"+"Description : "+desc+"\n");
    }
}
