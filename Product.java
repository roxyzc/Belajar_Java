public class Product {
    public String nama;
    public int price;

    public Product(String nama, int price) {
        this.nama = nama;
        this.price = price;
    }

    public String toString() {
        return "Product name: " + this.nama + ", price: " + this.price;
    }

    // @Override
    // public boolean equals(Object o) {
    // if (o == this)
    // return true;
    // if (!(o instanceof Product)) {
    // return false;
    // }

    // Product product = (Product) o;
    // if (price != product.price) {
    // System.out.println(!(o instanceof Product));
    // return false;
    // }
    // return nama != null ? nama.equals(product.nama) : product.nama == null;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nama == null) ? 0 : nama.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (nama == null) {
            if (other.nama != null)
                return false;
        } else if (!nama.equals(other.nama))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Product product1 = new Product("roxyzc", 1000);
        Product product2 = new Product("roxyzc", 1000);
        System.out.println(product1.equals(product2));
    }
}
