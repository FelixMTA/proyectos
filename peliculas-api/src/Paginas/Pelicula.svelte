<script>
  import { onMount } from "svelte";
  export let params = {};
  let id = params.id;
  const url = "https://api.themoviedb.org/3/movie/";
  const key = "?api_key=4d9fada041bf9e6f52a6551bf10644a9&language=en-US";
  const urlFinal = url + id + key;

  let pelicula = {};
  let generos = {};

  onMount(async () => {
    const res = await fetch(urlFinal);
    pelicula = await res.json();

    generos = await pelicula.genres;
    console.log(generos);
  });
</script>

<div class="row mt-5">
  <div class="col-lg-6">
    <img
      src="https://image.tmdb.org/t/p/w500{pelicula.poster_path}"
      alt={pelicula.title}
      width="100%"
      height="700"
    />
  </div>
  <div class="col-lg-6">
    <h1>{pelicula.title}</h1>
    <p>{pelicula.overview}</p>
    

    <div class="rating" aling="center">
      {pelicula.vote_average}
    </div>
  </div>
</div>

<style>
  .rating {
    width: 300px;
    border: solid 4px black;
    font-size: 10rem;
    font-weight: bolder;
  }
</style>
