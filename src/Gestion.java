
public class Gestion {

    public static void main(String[] args) {
        ProductFactory ElectroniqueFacto = new ElectroniqueFactory();
        ProductFactory VetementFacto = new VetementFactory();
        ProductGroup lotAnif = new ProductGroup("anniversaire");
        Product ipad = ElectroniqueFacto.createProduct("Ipad",100, "La dernière génération d'ipad de la fameuse marque");
        Product chassureNike = VetementFacto.createProduct("Chaussure Nike", 50,"45");
        ipad.showProduct();
        ipad.setPrix(ipad.getPrix()+10);
        ipad.showProduct();
        lotAnif.ajoutProduit(ipad);
        lotAnif.ajoutProduit(chassureNike);
        lotAnif.showProduct();
        lotAnif.setPromo(0.50);
        lotAnif.showProduct();
    }
}