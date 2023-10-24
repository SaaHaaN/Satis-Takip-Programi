package Project;

/**
 *
 * @author Şahan
 * @param <T>
 */

/*
Bu sınıf ödevde kullandığım "GirisEkranı" yani MainFrame de olan yazıyı yazmak için yaptığım Generics.
 */
public class Generics<T> {

    T obj;

    Generics(T obj) {
        this.obj = obj;
    }

    String yazi() {
        String hosgeldin = "AUDİ SERVİSE HOŞGELDİNİZ";
        return hosgeldin;
    }

}
