<script>
  import { collection, addDoc } from "firebase/firestore";
  

  let nombre = "";
  let email = "";
  let users = [];

  function addUser() {
      const datos = async () => {
        try {
  const docRef = await addDoc(collection(db, "users"), {
    first: "Alan",
    middle: "Mathison",
    last: "Turing",
    born: 1912
  });

  console.log("Document written with ID: ", docRef.id);
} catch (e) {
  console.error("Error adding document: ", e);
}
}
  }
</script>

<nav class="blue" />

<div class="container">
  <h1>crud firestore</h1>

  <input type="text" placeholder="Nombre" bind:value={nombre} />
  <input type="text" placeholder="Email" bind:value={email} />
  <button class="btn blue" on:click={addUser}>Guardarp</button>
  <button class="btn green">Actualizar</button>

  <table>
    <th>Id</th>
    <th>Nombre</th>
    <th>Email</th>
    <th>Eliminar</th>
    <th>Editar</th>
    <th>Enviar ID </th>
    {#each users as item}
      <tr>{item.id}</tr>
      <tr>{item.nombre}</tr>
      <tr>{item.email} </tr>
      <td />
      <td />
      <td />
    {:else}
      <tr>
        <td colspan="6">
          <p>Sin datos en firestore</p>
        </td>
      </tr>
    {/each}
  </table>
</div>
