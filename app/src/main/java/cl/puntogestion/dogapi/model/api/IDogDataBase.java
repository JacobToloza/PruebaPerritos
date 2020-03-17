package cl.puntogestion.dogapi.model.api;


import cl.puntogestion.dogapi.model.RazaImagen;
import cl.puntogestion.dogapi.model.RazasLista;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IDogDataBase {
    @GET("api/breeds/list/all")
    Call<RazasLista> listaRazas();

    @GET("api/breed/{breed}/images")
    Call<RazaImagen> listaImagenes(@Path("breed") String breed);

    @GET("api/breed/{breed}/{subBreed}/images")
    Call<RazaImagen> listaImagenesSubraza(@Path("breed") String breed, @Path("subBreed") String subBreed);
}
