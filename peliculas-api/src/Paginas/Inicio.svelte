<script>
    import Cargador from '../Componentes/Cargador.svelte'
    import Grid from '../Componentes/Grid.svelte';

  //4d9fada041bf9e6f52a6551bf10644a9
  const url =
    "https://api.themoviedb.org/3/movie/popular?api_key=4d9fada041bf9e6f52a6551bf10644a9&language=en-US&page=1";

  let promesa = ajax();

  let peliculas = [];

  async function ajax() {
    const res = await fetch(url);
    peliculas = await res.json();

    if (res.ok) {
      return peliculas.results;
    } else {
      throw new Error("no se encontro conexion en api");
    }
  }
</script>

<h1>Peliculas chingonas.</h1>



{#await promesa}
<div align="center"><Cargador/></div>
{:then peliculas}
  <Grid {peliculas}/>
{:catch}
  <p style="color:red;">{Error}</p>
{/await}
