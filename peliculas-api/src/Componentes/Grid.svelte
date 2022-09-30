<script>
import Card from './Card.svelte'
import { push } from "svelte-spa-router";
export let peliculas

</script>

<div class="row mt-3">
    {#each peliculas as item }
        <div class="col-sm-4">
            <Card
            titulo={item.title}
            imagen={item.poster_path} 
            on:ver-mas={()=>push('/Pelicula/'+ item.id)}
            />
        </div>    

    {/each}
</div>