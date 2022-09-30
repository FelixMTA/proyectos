import { initializeApp } from "firebase/app";
import { getFirestore } from 'firebase/firestore';
const firebaseConfig = {
  apiKey: "AIzaSyBkJRKqhgSVqR4QpNtOLM5Wxi1WD9Xhfv8",
  authDomain: "svelte-fire-afb72.firebaseapp.com",
  projectId: "svelte-fire-afb72",
  storageBucket: "svelte-fire-afb72.appspot.com",
  messagingSenderId: "37232073189",
  appId: "1:37232073189:web:d3c4b837ca6d090419370c"
};

// Initialize Firebase
 const app = initializeApp(firebaseConfig);
 const db = getFirestore(app);

 //export default db