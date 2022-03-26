import React, { Component } from 'react'
import From from '../components/From'
import Result from '../components/Result'

class App extends Component {// component stateful
  render() {

    const fondo = {
      color: 'black',
      backgroundImage: 'url(https://thumbs.dreamstime.com/z/domin%C3%B3-aislado-en-un-fondo-blanco-95087078.jpg)',
    };

    return (
      <div style={fondo}>
        <h3>Domino</h3>
        <p>Ficha-Random</p>
        <From />
        <br/>
        <Result />
      </div>
    )
  }
}

export default App


