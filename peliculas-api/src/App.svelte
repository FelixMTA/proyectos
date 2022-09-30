<script>
  import Router from "svelte-spa-router";
  import Menu from "./Componentes/Menu.svelte";
  import routes from "./routes";
</script>

<Menu />
<div class="container">
  <Router {routes} />
</div>
