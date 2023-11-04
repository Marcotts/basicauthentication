import React, {useState, useEffect} from "react";
import logo from './logo.svg';
import './App.css';
import Layout from "./Presentation/Layout";

function App() {

    const [clients, setClients] = useState([])
    const [films, setFilms] = useState([])

    useEffect(() => {
        fetch("/user/all")
            .then(response => response.json())
            .then(data => setClients(data))
    },[])


    useEffect(() => {
        fetch("/films/range/196&197")
            .then(response => response.json())
            .then(data => setFilms(data))
    },[])


    return (
        <div className="App">
            <Layout/>
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <div className="App-intro">
                    <h2>Clients222</h2>
                    {clients.map(client =>
                        <div key={client.id}>
                            {client.name} ({client.email})
                        </div>
                    )}
                    <h2>Clients333</h2>
                    {films.map(film =>
                        <div key={film.id}>
                            {film.titre_Francais}-{film.annee}
                        </div>
                    )}
                </div>
            </header>
        </div>
    );

}

export default App;