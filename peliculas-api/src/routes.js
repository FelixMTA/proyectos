import Inicio from './Paginas/Inicio.svelte'
import Pelicula from './Paginas/Pelicula.svelte'
import ErrorRuta from './Paginas/ErrorRuta.svelte'


const routes={
    '/':Inicio,
    '/Pelicula/:id':Pelicula,
    '*':ErrorRuta
}


export default routes